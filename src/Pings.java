import java.util.ArrayList;

public class Pings {
    public static void main(String... args){
        String adresse14 = "194.94.2.14";
        String adresse20 = "194.94.2.20";

        String antwortAdresse14 = Net.ping(adresse14);
        String antwortAdresse20 = Net.ping(adresse20);

        System.out.println(antwortAdresse14);
        System.out.println("==============================================================");
        System.out.println(antwortAdresse20);
        System.out.println("==============================================================");
        System.out.println("Adresse 194.94.2.14 erreicht = " + adresseErreichbar(antwortAdresse14));
        System.out.println("==============================================================");
        System.out.println("Adresse 194.94.2.20 erreicht = " + adresseErreichbar(antwortAdresse20));
        System.out.println("In diesem Netz sind noch : " + anzahlFreieAdressen() + " frei.");

        ArrayList<String> belegt = belegteAdressen();
        for (String adresse : belegt){
            System.out.println(adresse);
        }
        System.out.println(belegt.size() + " Adressen sind bereits belegt.");
    }

    public static boolean zeitueberschreitungEnthalten(String text){
        return text.contains("Zeitüberschreitung");
    }

    public static boolean hatAntwortzeit(String text){
        return (text.contains("Zeit") && text.contains("ms"));
    }

    public static boolean adresseErreichbar(String antwort){
        return (hatAntwortzeit(antwort) && !zeitueberschreitungEnthalten(antwort));
    }

    public static int anzahlFreieAdressen(){
        int frei = 0;
        for (int i = 1; i <= 128; i++){
            if(adresseErreichbar(Net.ping(i))){
                frei++;
            }
        }
        return frei;
    }

    public static ArrayList<String> belegteAdressen(){
        ArrayList<String> antwortendeAdressen = new ArrayList<>();
        for (int i = 1; i <= 128; i++){
            if(!adresseErreichbar(Net.ping(i))){
                antwortendeAdressen.add("194.94.2." + i);
            }
        }
        return antwortendeAdressen;
    }
}
