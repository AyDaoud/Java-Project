package locationapp.model;

public class Reservation {
    private int ID_RES;
    private String DATE_DEB, HEURE_DEB, DATE_FIN, HEURE_FIN, ETAT, RAISON_D_ANNUL;
    private Client CLIENT;
    private Voiture VOITURE;

    public Reservation(int ID_RES, String DATE_DEB, String HEURE_DEB, String DATE_FIN, String HEURE_FIN, String ETAT, String RAISON_D_ANNUL, Client CLIENT, Voiture VOITURE) {
        this.ID_RES = ID_RES;
        this.DATE_DEB = DATE_DEB;
        this.HEURE_DEB = HEURE_DEB;
        this.DATE_FIN = DATE_FIN;
        this.HEURE_FIN = HEURE_FIN;
        this.ETAT = ETAT;
        this.RAISON_D_ANNUL = RAISON_D_ANNUL;
        this.CLIENT = CLIENT;
        this.VOITURE = VOITURE;
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
    
    public int getID_RES() {
        return ID_RES;
    }

    public void setID_RES(int ID_RES) {
        this.ID_RES = ID_RES;
    }

    public String getDATE_DEB() {
        return DATE_DEB;
    }

    public void setDATE_DEB(String DATE_DEB) {
        this.DATE_DEB = DATE_DEB;
    }

    public String getHEURE_DEB() {
        return HEURE_DEB;
    }

    public void setHEURE_DEB(String HEURE_DEB) {
        this.HEURE_DEB = HEURE_DEB;
    }

    public String getDATE_FIN() {
        return DATE_FIN;
    }

    public void setDATE_FIN(String DATE_FIN) {
        this.DATE_FIN = DATE_FIN;
    }

    public String getHEURE_FIN() {
        return HEURE_FIN;
    }

    public void setHEURE_FIN(String HEURE_FIN) {
        this.HEURE_FIN = HEURE_FIN;
    }

    public String getETAT() {
        return ETAT;
    }

    public void setETAT(String ETAT) {
        this.ETAT = ETAT;
    }

    public String getRAISON_D_ANNUL() {
        return RAISON_D_ANNUL;
    }

    public void setRAISON_D_ANNUL(String RAISON_D_ANNUL) {
        this.RAISON_D_ANNUL = RAISON_D_ANNUL;
    }
}