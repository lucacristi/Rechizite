import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Manual extends Rechizita{
    private List<String> autori;
    private String editura;

    public Manual(String nume, List<String> autori, String editura) {
        super.nume = nume;
        this.autori = List.copyOf(autori);
        this.editura = editura;
    }

    public Manual(Manual anotherManual){
        this(anotherManual.nume, anotherManual.autori, anotherManual.editura);
    }

    public List<String> getAutori() {
       return List.copyOf(autori);
    }

    public void setAutori(List<String> autori) {
        this.autori = List.copyOf(autori);
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    @Override
    public String getNume() {
        return super.nume + " - manual";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manual manual = (Manual) o;
        return Objects.equals(autori, manual.autori) &&
                Objects.equals(editura, manual.editura);
    }

    @Override
    public String toString() {
        return "Manual{" +
                "autori=" + autori +
                ", editura='" + editura + '\'' +
                '}';
    }
}
