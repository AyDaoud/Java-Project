package locationapp.model;

public class ModLoc {
    private int ID_MOD,DUREE;
    private String LABEL;
    private long KILO_FORFAIT;

    public ModLoc(int ID_MOD, String LABEL, int DUREE, long KILO_FORFAIT) {
        this.ID_MOD = ID_MOD;
        this.DUREE = DUREE;
        this.LABEL = LABEL;
        this.KILO_FORFAIT = KILO_FORFAIT;
    }

    public int getID_MOD() {
        return ID_MOD;
    }

    public void setID_MOD(int ID_MOD) {
        this.ID_MOD = ID_MOD;
    }

    public int getDUREE() {
        return DUREE;
    }

    public void setDUREE(int DUREE) {
        this.DUREE = DUREE;
    }

    public String getLABEL() {
        return LABEL;
    }

    public void setLABEL(String LABEL) {
        this.LABEL = LABEL;
    }

    public long getKILO_FORFAIT() {
        return KILO_FORFAIT;
    }

    public void setKILO_FORFAIT(long KILO_FORFAIT) {
        this.KILO_FORFAIT = KILO_FORFAIT;
    }
}