import java.util.Objects;

public class Caiet extends Rechizita {
    private String tipCaiet;
    private int numarFile;

    public Caiet(String nume, String tipCaiet, int numarFile) {
        super.nume = nume;
        this.tipCaiet = tipCaiet;
        this.numarFile = numarFile;
    }

    public Caiet(Caiet anotherCaiet){
        this(anotherCaiet.nume, anotherCaiet.tipCaiet, anotherCaiet.numarFile);
    }

    @Override
    public String getNume() {
        return super.nume + " - caiet";
    }

    public String getTipCaiet() {
        return tipCaiet;
    }

    public void setTipCaiet(String tipCaiet) {
        this.tipCaiet = tipCaiet;
    }

    public int getNumarFile() {
        return numarFile;
    }

    public void setNumarFile(int numarFile) {
        this.numarFile = numarFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caiet caiet = (Caiet) o;
        return numarFile == caiet.numarFile &&
                Objects.equals(tipCaiet, caiet.tipCaiet);
    }

    @Override
    public String toString() {
        return "Caiet{" +
                "tipCaiet='" + tipCaiet + '\'' +
                ", numarFile=" + numarFile +
                '}';
    }
}
