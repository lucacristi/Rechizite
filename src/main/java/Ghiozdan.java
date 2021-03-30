import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ghiozdan {
    private final static String MANUAL = "Manual";
    private final static String CAIET = "Caiet";
    private List<Rechizita> rechizite;

    public Ghiozdan(List<Rechizita> rechizite) {
        this.rechizite = new ArrayList<>(rechizite.size());
        this.rechizite.addAll(rechizite);
    }

    public Ghiozdan(Ghiozdan anotherGhiozdan) {
        this(anotherGhiozdan.rechizite);
    }

    public boolean add(Rechizita rechizita) {
        return rechizite.add(rechizita);
    }

    public Rechizita remove(int pozitie) {
        return rechizite.remove(pozitie);
    }

    public Rechizita elementAt(int pozitie) {
        return rechizite.get(pozitie);
    }

    public void listItems() {
        System.out.println("\nAfisare rechizite");
        for (Rechizita rechizita : rechizite) {
            System.out.println(rechizita);
        }
    }

    public void listManual() {
        System.out.println("\nAfisare manuale");
        for (Rechizita rechizita : rechizite) {
            if (rechizita.getClass().getName().equals(MANUAL))
                System.out.println(rechizita);
        }
    }

    public void listCaiet() {
        System.out.println("\nAfisare caiete");
        for (Rechizita rechizita : rechizite) {
            if (rechizita.getClass().getName().equals(CAIET))
                System.out.println(rechizita);
        }
    }

    public int getNrRechizite() {
        return rechizite.size();
    }

    public int getNrManuale() {
        int nrManuale = 0;
        for (Rechizita rechizita : rechizite) {
            if (rechizita.getClass().getName().equals(MANUAL))
                nrManuale++;
        }
        return nrManuale;
    }

    public int getNrCaiete() {
        int nrCaiete = 0;
        for (Rechizita rechizita : rechizite) {
            if (rechizita.getClass().getName().equals(CAIET))
                nrCaiete++;
        }
        return nrCaiete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ghiozdan ghiozdan = (Ghiozdan) o;
        return Objects.equals(rechizite, ghiozdan.rechizite);
    }
}
