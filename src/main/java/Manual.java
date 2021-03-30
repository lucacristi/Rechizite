import java.util.Arrays;
import java.util.Objects;

public class Manual extends Rechizita{
    private int nrAutori = 0;
    private String[] autori;
    private String editura;

    public Manual(String nume, String[] autori, String editura) {
        super.nume = nume;
        copyAuthors(autori);
        this.editura = editura;
    }

    public Manual(Manual anotherManual){
        this(anotherManual.nume, anotherManual.autori, anotherManual.editura);
    }

    @Override
    public String getNume() {
        return super.nume + " - manual";
    }

    public String[] getAutori() {
        return autori;
    }

    public void setAutori(String[] autori) {
        this.autori = autori;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manual manual = (Manual) o;
        return Arrays.equals(autori, manual.autori) &&
                Objects.equals(editura, manual.editura);
    }

    @Override
    public String toString() {
        return "Manual{" +
                "autori=" + Arrays.toString(autori) +
                ", editura='" + editura + '\'' +
                '}';
    }

    private void copyAuthors(String[] autori){
        nrAutori = autori.length;
        this.autori = new String[nrAutori];

    }
}
