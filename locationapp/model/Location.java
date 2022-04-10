package locationapp.model;

public class Location {
    private int ID_LOC;
    private String DATE_DEB, HEURE_DEB, DATE_REST, HEURE_REST, DATE_REST_EFF, HEURE_REST_EFF;
    private long KILO_DEB, KILO_REST;
    private boolean CAUTION_PAYEE, DEDOMAGEMENT;
    private Client CLIENT;
    private Voiture VOITURE;
    public Location(int ID_LOC, String DATE_DEB, String HEURE_DEB, String DATE_REST, String HEURE_REST,
            long KILO_DEB, boolean CAUTION_PAYEE,boolean DEDOMAGEMENT, String DATE_REST_EFF, String HEURE_REST_EFF,
            long KILO_REST, Client CLIENT, Voiture VOITURE) {
        this.ID_LOC = ID_LOC;
        this.DATE_DEB = DATE_DEB;
        this.HEURE_DEB = HEURE_DEB;
        this.DATE_REST = DATE_REST;
        this.HEURE_REST = HEURE_REST;
        this.DATE_REST_EFF = DATE_REST_EFF;
        this.HEURE_REST_EFF = HEURE_REST_EFF;
        this.KILO_DEB = KILO_DEB;
        this.KILO_REST = KILO_REST;
        this.CAUTION_PAYEE = CAUTION_PAYEE;
        this.DEDOMAGEMENT = DEDOMAGEMENT;
        this.CLIENT = CLIENT;
        this.VOITURE = VOITURE;
    }

    public int getID_LOC() {
        return ID_LOC;
    }

    public void setID_LOC(int ID_LOC) {
        this.ID_LOC = ID_LOC;
    }

    public Client getCLIENT() {
        return CLIENT;
    }

    public void setCLIENT(Client CLIENT) {
        this.CLIENT = CLIENT;
    }

    public Voiture getVOITURE() {
        return VOITURE;
    }

    public void setVOITURE(Voiture VOITURE) {
        this.VOITURE = VOITURE;
    }

    public String getDATE_DEB() {
        return DATE_DEB;
    }

    public void setDATE_DEB(String DATE_DEB) {
        this.DATE_DEB = DATE_DEB;
    }

    public String getDATE_REST() {
        return DATE_REST;
    }

    public void setDATE_REST(String DATE_REST) {
        this.DATE_REST = DATE_REST;
    }

    public String getHEURE_REST() {
        return HEURE_REST;
    }

    public void setHEURE_REST(String HEURE_REST) {
        this.HEURE_REST = HEURE_REST;
    }

    public long getKILO_DEB() {
        return KILO_DEB;
    }

    public void setKILO_DEB(long KILO_DEB) {
        this.KILO_DEB = KILO_DEB;
    }

    public String getHEURE_DEB() {
        return HEURE_DEB;
    }

    public void setHEURE_DEB(String HEURE_DEB) {
        this.HEURE_DEB = HEURE_DEB;
    }

    public String getDATE_REST_EFF() {
        return DATE_REST_EFF;
    }

    public void setDATE_REST_EFF(String DATE_REST_EFF) {
        this.DATE_REST_EFF = DATE_REST_EFF;
    }

    public String getHEURE_REST_EFF() {
        return HEURE_REST_EFF;
    }

    public void setHEURE_REST_EFF(String HEURE_REST_EFF) {
        this.HEURE_REST_EFF = HEURE_REST_EFF;
    }

    public long getKILO_REST() {
        return KILO_REST;
    }

    public void setKILO_REST(long KILO_REST) {
        this.KILO_REST = KILO_REST;
    }

    public boolean isCAUTION_PAYEE() {
        return CAUTION_PAYEE;
    }

    public void setCAUTION_PAYEE(boolean CAUTION_PAYEE) {
        this.CAUTION_PAYEE = CAUTION_PAYEE;
    }

    public boolean isDEDOMAGEMENT() {
        return DEDOMAGEMENT;
    }

    public void setDEDOMAGEMENT(boolean DEDOMAGEMENT) {
        this.DEDOMAGEMENT = DEDOMAGEMENT;
    }
}