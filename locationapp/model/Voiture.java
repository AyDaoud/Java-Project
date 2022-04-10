package locationapp.model;

public class Voiture {
    private int ID_V,PUISSANCE;
    private String MATRICULE,MARQUE,TYPE,ETAT,DATE_A;
    private Double PRIX_A;
    private Boolean RADIO,CLIMAT,ABS,AIRBAG;
    private Classe CLASSE;

    public Voiture(int ID_V, String MATRICULE, String MARQUE, String TYPE, int PUISSANCE,String DATE_A, Double PRIX_A, String ETAT, Boolean RADIO, Boolean CLIMAT, Boolean ABS, Boolean AIRBAG, Classe CLASSE) {
        this.ID_V = ID_V;
        this.PUISSANCE = PUISSANCE;
        this.MATRICULE = MATRICULE;
        this.MARQUE = MARQUE;
        this.TYPE = TYPE;
        this.ETAT = ETAT;
        this.DATE_A = DATE_A;
        this.PRIX_A = PRIX_A;
        this.RADIO = RADIO;
        this.CLIMAT = CLIMAT;
        this.ABS = ABS;
        this.AIRBAG = AIRBAG;
        this.CLASSE = CLASSE;
    }

    public int getID_V() {
        return ID_V;
    }

    public void setID_V(int ID_V) {
        this.ID_V = ID_V;
    }

    public Classe getCLASSE() {
        return CLASSE;
    }

    public void setCLASSE(Classe CLASSE) {
        this.CLASSE = CLASSE;
    }

    public int getPUISSANCE() {
        return PUISSANCE;
    }

    public void setPUISSANCE(int PUISSANCE) {
        this.PUISSANCE = PUISSANCE;
    }

    public String getMATRICULE() {
        return MATRICULE;
    }

    public void setMATRICULE(String MATRICULE) {
        this.MATRICULE = MATRICULE;
    }

    public String getMARQUE() {
        return MARQUE;
    }

    public void setMARQUE(String MARQUE) {
        this.MARQUE = MARQUE;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getETAT() {
        return ETAT;
    }

    public void setETAT(String ETAT) {
        this.ETAT = ETAT;
    }

    public String getDATE_A() {
        return DATE_A;
    }

    public void setDATE_A(String DATE_A) {
        this.DATE_A = DATE_A;
    }

    public Double getPRIX_A() {
        return PRIX_A;
    }

    public void setPRIX_A(Double PRIX_A) {
        this.PRIX_A = PRIX_A;
    }

    public Boolean getRADIO() {
        return RADIO;
    }

    public void setRADIO(Boolean RADIO) {
        this.RADIO = RADIO;
    }

    public Boolean getCLIMAT() {
        return CLIMAT;
    }

    public void setCLIMAT(Boolean CLIMAT) {
        this.CLIMAT = CLIMAT;
    }

    public Boolean getABS() {
        return ABS;
    }

    public void setABS(Boolean ABS) {
        this.ABS = ABS;
    }

    public Boolean getAIRBAG() {
        return AIRBAG;
    }

    public void setAIRBAG(Boolean AIRBAG) {
        this.AIRBAG = AIRBAG;
    }
}