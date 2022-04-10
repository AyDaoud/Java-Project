package locationapp.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import locationapp.DAO.ClientDAO;
import locationapp.DAO.Connect;
import locationapp.DAO.ModLocDAO;
import locationapp.DAO.ReservationDAO;
import locationapp.DAO.VoitureDAO;

public class ReservationModel {
    private final ReservationDAO rDAO = new ReservationDAO(Connect.getInstance());
    private final ClientDAO cDAO = new ClientDAO(Connect.getInstance());
    private final VoitureDAO vDAO = new VoitureDAO(Connect.getInstance());
    private final ModLocDAO mDAO = new ModLocDAO(Connect.getInstance());
    
    public DefaultTableModel setTable(int id, String nom, String prenom) {
        Vector<String> title = rDAO.header();
        Vector<Vector<String>> data = resToVect(rDAO.find(id,nom, prenom));
        return new DefaultTableModel(data,title);
    }
    
    private Vector<Vector<String>> resToVect(Vector<Reservation> vr) {
        Vector<Vector<String>> v = new Vector<> ();
        for(int i = 0; i < vr.size() ; i++){
            Reservation r = vr.get(i);
            Vector<String> vs = new Vector<> ();
            vs.add(Integer.toString(r.getID_RES()));
            vs.add(Integer.toString(r.getCLIENT().getID_CLI()));
            vs.add(r.getCLIENT().getNOM());vs.add(r.getCLIENT().getPRENOM());
            vs.add(Integer.toString(r.getVOITURE().getID_V()));
            vs.add(r.getVOITURE().getMARQUE());vs.add(r.getVOITURE().getTYPE());
            vs.add(r.getDATE_DEB());vs.add(r.getHEURE_DEB());
            vs.add(r.getDATE_FIN());vs.add(r.getHEURE_FIN());
            vs.add(r.getETAT());vs.add(r.getRAISON_D_ANNUL());
            v.add(vs);     
        }
        return v;
    }

    public void AjouterRes(int idc, int idv, String dd, String hd, String df, String hf) {
        Reservation r = new Reservation(rDAO.NextId(),form(dd),hd,form(df),hf,"En cours","",cDAO.find(idc),vDAO.find(idv));
        rDAO.create(r);
    }
    private String form(String s){
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd yyyy H");
        LocalDateTime dated = LocalDateTime.parse(s+" 0",formatter);
        return dated.toString().substring(0, 10);
    }
    
    public String getClientNom(int idcCom) {
        return cDAO.find(idcCom).getNOM();
    }

    public String getVoitureMat(int idvCom) {
        return vDAO.find(idvCom).getMATRICULE();
    }

    public String getClientPrenom(int idcCom) {
        return cDAO.find(idcCom).getPRENOM();
    }

    public String getVoitureNom(int idvCom) {
        Voiture v = vDAO.find(idvCom);
        return v.getMARQUE()+" "+v.getTYPE();
    }

    public double getPrix(int idvCom) {
        return vDAO.find(idvCom).getCLASSE().getPRIX_KILO();
    }

    public Vector<Integer> getClientIDs() {
        return cDAO.findIDs();
    }

    public Vector<Integer> getVoitureIDs() {
        return vDAO.findIDs();
    }

    public String wkKilo() {
        return Long.toString(mDAO.find(3).getKILO_FORFAIT());
    }

    public String calculKilo(String dd, String hd, String df, String hf) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd yyyy HH:mm");
        LocalDateTime dated = LocalDateTime.parse(dd+" "+hd,formatter);
        LocalDateTime datef = LocalDateTime.parse(df+" "+hf,formatter);
        long dur = Math.abs(ChronoUnit.HOURS.between(dated,datef))/24;
        long week = dur/7;
        long days = dur%7;
        return mDAO.find(1).getKILO_FORFAIT()*days+mDAO.find(2).getKILO_FORFAIT()*week+"";
    }

    public void ModRes(int id,int idc, int idv, String dd, String hd, String df, String hf) {
        Reservation r = new Reservation(id,form(dd),hd,form(df),hf,"En cours","",cDAO.find(idc),vDAO.find(idv));
        rDAO.update(r);    }

    public void chEtatRes(int ID, String etat, String ra) {
        Reservation r = rDAO.find(ID);
        r.setETAT(etat);r.setRAISON_D_ANNUL(ra);
        rDAO.update(r);
    }
}