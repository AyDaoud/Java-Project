package locationapp.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import locationapp.DAO.*;

public class LocationModel {
    private final LocationDAO lDAO = new LocationDAO(Connect.getInstance());
    private final ReservationDAO rDAO = new ReservationDAO(Connect.getInstance());
    private final ClientDAO cDAO = new ClientDAO(Connect.getInstance());
    private final VoitureDAO vDAO = new VoitureDAO(Connect.getInstance());
    private final ModLocDAO mDAO = new ModLocDAO(Connect.getInstance());
    
    public DefaultTableModel setTable(int id, String nom, String prenom) {
        Vector<String> title = lDAO.header();
        Vector<Vector<String>> data = locToVect(lDAO.find(id,nom, prenom));
        return new DefaultTableModel(data,title);
    }

    private Vector<Vector<String>> locToVect(Vector<Location> vl) {
        Vector<Vector<String>> v = new Vector<> ();
        for(int i = 0; i < vl.size() ; i++){
            Location l = vl.get(i);
            Vector<String> vs = new Vector<> ();
            vs.add(Integer.toString(l.getID_LOC()));
            vs.add(Integer.toString(l.getCLIENT().getID_CLI()));
            vs.add(l.getCLIENT().getNOM());vs.add(l.getCLIENT().getPRENOM());
            vs.add(Integer.toString(l.getVOITURE().getID_V()));
            vs.add(l.getVOITURE().getMARQUE());vs.add(l.getVOITURE().getTYPE());
            vs.add(l.getDATE_DEB());vs.add(l.getHEURE_DEB());
            vs.add(l.getDATE_REST());vs.add(l.getHEURE_REST());
            vs.add(Long.toString(l.getKILO_DEB()));
            vs.add((l.isCAUTION_PAYEE())?"Oui":"Non");vs.add((l.isDEDOMAGEMENT())?"Oui":"Non");
            vs.add(l.getDATE_REST_EFF());vs.add(l.getHEURE_REST_EFF());
            vs.add(Long.toString(l.getKILO_REST()));
            v.add(vs);     
        }
        return v;
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

    public String form(String s){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd yyyy H");
        LocalDateTime dated = LocalDateTime.parse(s+" 0",formatter);
        return dated.toString().substring(0, 10);
    }
    
    public void AjouterLoc(int idcComV, int idvComV, String dd, String hdSp, String df, String hfSp, long kilom, boolean cautChV, boolean dedChV) {
        Location l = new Location(lDAO.NextId(), form(dd), hdSp, form(df), hfSp, kilom, cautChV, dedChV, "NULL","NULL",0,cDAO.find(idcComV), vDAO.find(idvComV));
        lDAO.create(l);
    }

    public void ModLoc(int ID, int idcComV, int idvComV, String dd, String hdSp, String df, String hfSp, long kilom, boolean cautChV, boolean dedChV) {
        Location l = new Location(ID, form(dd), hdSp, form(df), hfSp, kilom, cautChV, dedChV, "NULL","NULL",0,cDAO.find(idcComV), vDAO.find(idvComV));
        lDAO.update(l);
    }
    
     public String wkKilo() {
        return Long.toString(mDAO.find(3).getKILO_FORFAIT());
    }

    public long calculKilo(String dd, String hd, String df, String hf) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dated = LocalDateTime.parse(dd+" "+hd,formatter);
        LocalDateTime datef = LocalDateTime.parse(df+" "+hf,formatter);
        long dur = Math.abs(ChronoUnit.HOURS.between(dated,datef))/24;
        long week = dur/7;
        long days = dur%7;
        return mDAO.find(1).getKILO_FORFAIT()*days+mDAO.find(2).getKILO_FORFAIT()*week;
    }

    public Vector<Integer> getReservationIDs() {
        return rDAO.findIDs();
    }

    public Reservation getRes(int id) {
        return rDAO.find(id);
    }

    public void endRes(int id) {
        Reservation r = rDAO.find(id);
        r.setETAT("Terminée");
        rDAO.update(r);
    }

    public Location getLoc(int ID) {
        return lDAO.find(ID);
    }

    public Vector<Integer> getLocIDs() {
        return lDAO.findIDs();
    }

    public void updateLoc(Location l) {
        lDAO.update(l);
    }

    public Double calculmMont(Location l) {
        long kilo = calculKilo(l.getDATE_DEB(),l.getHEURE_DEB(),l.getDATE_REST(),l.getHEURE_REST());
        double prix = getPrix(l.getVOITURE().getID_V());
        Double mont = kilo*prix;
        if(l.isCAUTION_PAYEE())mont-=mont*0.2;
        else mont+=mont*0.03;
        if(l.isDEDOMAGEMENT())mont-=getAmende(l.getVOITURE().getID_V());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String d = l.getDATE_REST()+" "+l.getHEURE_REST();
        String deff = l.getDATE_REST_EFF()+" "+l.getHEURE_REST_EFF()+":00";
        LocalDateTime date = LocalDateTime.parse(d,formatter);
        LocalDateTime dateeff = LocalDateTime.parse(deff,formatter);
        Long dur = ChronoUnit.HOURS.between(date,dateeff);
        if(dur%24!=0)dur=dur/24+1;
        else dur/=24;
        if(dur>0)mont+=dur*getAmende(l.getVOITURE().getID_V());
        if((l.getKILO_REST()-l.getKILO_DEB())>kilo)mont+=(l.getKILO_REST()-l.getKILO_DEB()-kilo)*prix;
        return mont;
    }

    private Double getAmende(int idv) {
        return vDAO.find(idv).getCLASSE().getAMENDE_J();
    }
}