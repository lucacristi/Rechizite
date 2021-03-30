import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestGhiozdan {
    public static void main(String[] args) {
        List<Rechizita> rechizite = initializeazaRechizite();
        Ghiozdan ghiozdan = new Ghiozdan(rechizite);

        System.out.println("Nr total rechizite: " + ghiozdan.getNrRechizite());
        System.out.println("Nr total caiete: " + ghiozdan.getNrCaiete());
        System.out.println("Nr total manuale: " + ghiozdan.getNrManuale());

        ghiozdan.listItems();
        ghiozdan.listCaiet();
        ghiozdan.listManual();

        System.out.println("\nUltima rechizita: " + ghiozdan.elementAt(ghiozdan.getNrRechizite()-1));
        System.out.println("\nRechizita stearsa: " + ghiozdan.remove(ghiozdan.getNrRechizite()-1));
        System.out.println("\nUltima rechizita: " + ghiozdan.elementAt(ghiozdan.getNrRechizite()-1));

        ghiozdan.add(new Manual("atlas", Arrays.asList("Mihai","Iulia"), "Nord"));

        System.out.println("Nr total rechizite: " + ghiozdan.getNrRechizite());
        System.out.println("Nr total caiete: " + ghiozdan.getNrCaiete());
        System.out.println("Nr total manuale: " + ghiozdan.getNrManuale());
    }

    private static List<Rechizita> initializeazaRechizite() {
        Manual abecedar = new Manual("abecedar", Arrays.asList("Ion","Ana","Vasile"), "Corint");
        Manual culegere = new Manual("culegere", Arrays.asList("Crina","Mihaela","Sorin"), "ArtPress");

        Caiet matematica = new Caiet("patratele", "A5", 48);
        Caiet romana = new Caiet("linii", "dictando", 48);
        Caiet desen = new Caiet("desen", "blank", 80);

        List<Rechizita> rechizite = new ArrayList<>();

        rechizite.add(abecedar);
        rechizite.add(culegere);

        rechizite.add(matematica);
        rechizite.add(romana);
        rechizite.add(desen);

        return rechizite;
    }
}
