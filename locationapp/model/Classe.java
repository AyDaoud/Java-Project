package locationapp.model;

public class Classe {
    private int ID_CLASS;
    private double PRIX_KILO,AMENDE_J;

    public Classe(int ID_CLASS, double PRIX_KILO, double AMENDE_J) {
        this.ID_CLASS = ID_CLASS;
        this.PRIX_KILO = PRIX_KILO;
        this.AMENDE_J = AMENDE_J;
    }

    public int getID_CLASS() {
        return ID_CLASS;
    }

    public void setID_CLASS(int ID_CLASS) {
        this.ID_CLASS = ID_CLASS;
    }

    public double getPRIX_KILO() {
        return PRIX_KILO;
    }

    public void setPRIX_KILO(double PRIX_KILO) {
        this.PRIX_KILO = PRIX_KILO;
    }

    public double getAMENDE_J() {
        return AMENDE_J;
    }

    public void setAMENDE_J(double AMENDE_J) {
        this.AMENDE_J = AMENDE_J;
    }
}