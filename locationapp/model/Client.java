package locationapp.model;

public class Client {
    private int ID_CLI;
    private String NOM,PRENOM,ADRESSE;
    private long NUM_PERMIS;
    public Client(int ID_CLI, String NOM, String PRENOM, String ADRESSE, long NUM_PERMIS) {
        this.ID_CLI = ID_CLI;
        this.NOM = NOM;
        this.PRENOM = PRENOM;
        this.ADRESSE = ADRESSE;
        this.NUM_PERMIS = NUM_PERMIS;
    }

    public int getID_CLI() {
        return ID_CLI;
    }

    public void setID_CLI(int ID_CLI) {
        this.ID_CLI = ID_CLI;
    }

    public String getNOM() {
        return NOM;
    }

    public void setNOM(String NOM) {
        this.NOM = NOM;
    }

    public String getPRENOM() {
        return PRENOM;
    }

    public void setPRENOM(String PRENOM) {
        this.PRENOM = PRENOM;
    }

    public String getADRESSE() {
        return ADRESSE;
    }

    public void setADRESSE(String ADRESSE) {
        this.ADRESSE = ADRESSE;
    }

    public long getNUM_PERMIS() {
        return NUM_PERMIS;
    }

    public void setNUM_PERMIS(long NUM_PERMIS) {
        this.NUM_PERMIS = NUM_PERMIS;
    }
}