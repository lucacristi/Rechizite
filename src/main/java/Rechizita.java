public abstract class Rechizita {
    protected String nume;
    private double pret;

    public abstract String getNume();

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Rechizita{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                '}';
    }
}
