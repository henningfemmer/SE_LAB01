import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String ersteAdresse = Net.ping("194.94.2.14");
        String zweiteAdresse = Net.ping("194.94.2.20");
        System.out.println(ersteAdresse);
        System.out.println("\n" + zweiteAdresse);
        System.out.println("-------------------");
        System.out.println("Die Anzahl der vergebbaren Adressen beträgt: " + anzahlVergebbarerNetzwerke(128));
        System.out.println("Und hier alle vergebbaren Adressen aufgelistet:");
        ArrayList<String> stringArrayList = vergebbareAdressen(128);
        for (String s : stringArrayList) {
            System.out.println(s);
        }
    }

    public static boolean zeitüberschreitungPrüfung (String adresse) {
        boolean antwortZeit = adresse.contains("Zeitüberschreitung");
        boolean antwortMS = !adresse.contains("ms");
        return antwortZeit && antwortMS;
    }

    public static boolean antwortPing (String adresse) {
        boolean erreichbarAntwort = Net.ping(adresse).contains("Zeitüberschreitung");
        return erreichbarAntwort;
    }

    public static int anzahlVergebbarerNetzwerke(int gesamtanzahl) {
        int counter = 0;
        for (int i = 1; i < gesamtanzahl; i++) {
            if (!antwortPing("194.94.2." + i)) {
                counter++;
            }
        }
        return counter;
    }

    public static ArrayList<String> vergebbareAdressen(int gesamtzahl) {
       ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < gesamtzahl; i++) {
            if (!antwortPing("194.94.2." + i)) {
                stringArrayList.add("194.94.2." + i);
            }
        }
        return stringArrayList;
    }




}
