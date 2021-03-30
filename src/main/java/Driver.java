public class Driver {
    public static void main(String[] args) {
        String[] autori = new String[3];
        autori[0] = "nicu";
        autori[1] = "matei";
        Caiet caiet = new Caiet("bla", "dictando", 48);
        Manual manual = new Manual("abecedar", autori, "ramira");

        System.out.println(caiet);
        System.out.println(caiet.getNume());
        System.out.println(manual);
        System.out.println(manual.getNume());

        autori[2]="luca";
        System.out.println(manual);
    }
}
