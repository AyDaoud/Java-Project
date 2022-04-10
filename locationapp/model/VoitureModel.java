package locationapp.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import locationapp.DAO.ClasseDAO;
import locationapp.DAO.Connect;
import locationapp.DAO.LocationDAO;
import locationapp.DAO.ReservationDAO;
import locationapp.DAO.VoitureDAO;

public class VoitureModel {
    private final VoitureDAO vDAO = new VoitureDAO(Connect.getInstance());
    private final ReservationDAO rDAO = new ReservationDAO(Connect.getInstance());
    private final LocationDAO lDAO = new LocationDAO(Connect.getInstance());
    private final ClasseDAO clDAO = new ClasseDAO(Connect.getInstance());
    public DefaultTableModel setTable(String mat, String marque, String type, boolean r, boolean c, boolean abs, boolean ab) {
        Vector<String> title = vDAO.header();
        Vector<Vector<String>> data = VoitureToVect(vDAO.find(mat, marque, type, r, c, abs, ab));
        return new DefaultTableModel(data,title);
    }
    public DefaultTableModel setTable1() {
        Vector<String> title = vDAO.header();
        Vector<Vector<String>> data = VoitureToVect(find2old());
        return new DefaultTableModel(data,title);
    }
    private Vector<Vector<String>> VoitureToVect(Vector<Voiture> vc) {
        Vector<Vector<String>> vv = new Vector<> ();
        for(int i = 0; i < vc.size() ; i++){
            Voiture v = vc.get(i);
            Vector<String> vs = new Vector<> ();
            vs.add(Integer.toString(v.getID_V()));
            vs.add(v.getMATRICULE());vs.add(v.getMARQUE());vs.add(v.getTYPE());
            vs.add(Integer.toString(v.getPUISSANCE()));
            vs.add(v.getDATE_A());vs.add(Double.toString(v.getPRIX_A()));
            vs.add(v.getETAT());
            vs.add((v.getRADIO())?"Oui":"Non");vs.add((v.getCLIMAT())?"Oui":"Non");
            vs.add((v.getABS())?"Oui":"Non");vs.add((v.getAIRBAG())?"Oui":"Non");
            vv.add(vs);     
        }
        return vv;
    }
    public String form(Date date){
        String d="";
        if(date!=null){
            d=date.toString();
            d= d.substring(0, 11)+d.substring(24, 28);
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd yyyy H");
        LocalDateTime dated = LocalDateTime.parse(d+" 0",formatter);
        return dated.toString().substring(0, 10);
    }

    public void create(String mat, String mar, String type, int puis, String date, double prix, boolean r,
            boolean c, boolean abs, boolean air, int clas) {
        Voiture v = new Voiture(vDAO.NextId(),mat,mar,type,puis,date,prix,"Disponible",r,c,abs,air,clDAO.find(clas));
        vDAO.create(v);
    }

    public Vector<Integer> classIds() {
        return clDAO.findIDs();
    }
    public Vector<Voiture> find2old(){
        Vector<Voiture> v = vDAO.find("%", "%", "%",false,false,false,false);
        int i=0;
        while(i<v.size()){
            if (age(v.get(i))<2){
                v.remove(i);
            }
            else i++;
        }
        return v;
    }
    public void supp() {
        Vector<Voiture> v = find2old();
        for (Voiture vv : v) {
            vv.setETAT("Supprimée");
            vDAO.update(vv);
        }
    }
    private double age(Voiture v) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H");
        LocalDateTime dated = LocalDateTime.parse(v.getDATE_A()+" 0",formatter);
        LocalDateTime datef = LocalDateTime.now();
        return Math.abs(ChronoUnit.HOURS.between(dated,datef)/(24*365));
    }

    public DefaultTableModel setDispTable(String dd, String df, boolean r, boolean c, boolean abs, boolean ab){
        Vector<String> title = vDAO.header();
        Vector<Voiture> voitures = vDAO.find("%", "%", "%", r, c, abs, ab);
        int i =0 ;
        while(i<voitures.size()){
            Vector<Reservation> reservations = rDAO.findByIdv(voitures.get(i).getID_V());
            boolean t = true;
            for(int j = 0; j<reservations.size(); j++){
                if(!verif(dd,df,reservations.get(j).getDATE_DEB(),reservations.get(j).getDATE_FIN())){
                    voitures.remove(i);
                    t=false;i--;System.out.println("*");
                    break;
                }
            }
            if(t){
                Vector<Location> locations = lDAO.findByIdv(voitures.get(i).getID_V());
                for(int j = 0; j<locations.size(); j++){
                    if(!verif(dd,df,locations.get(j).getDATE_DEB(),locations.get(j).getDATE_REST())){
                        voitures.remove(i);i--;
                        break;
                    }
                }
            }
            i++;
        }
        
        Vector<Vector<String>> data = VoitureToVect(voitures);
        
        return new DefaultTableModel(data,title);
    }

    private boolean verif(String dd1, String df1, String dd2, String df2) {
        Date date1,date2;
        try {
            date1 = new SimpleDateFormat("yyyy-MM-dd").parse(df1);
            date2= new SimpleDateFormat("yyyy-MM-dd").parse(dd2);
            if(date1.compareTo(date2)<0)return true;
            date1= new SimpleDateFormat("yyyy-MM-dd").parse(df2);
            date2= new SimpleDateFormat("yyyy-MM-dd").parse(dd1);
            if(date1.compareTo(date2)<0)return true;
            return false;
        } catch (ParseException ex) {
            Logger.getLogger(VoitureModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}