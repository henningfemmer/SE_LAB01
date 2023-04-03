public class Client {
    private String name;
    private String netzAdresse;
    private String geraeteTyp;
    private String raum;

    public Client(String name, String netzAdresse, String geraeteTyp, String raum) {
        this.name = (name == null) ? "NAME?" : name;
        this.netzAdresse = (netzAdresse == null) ? "ADRESSE?" : netzAdresse;
        this.geraeteTyp = (geraeteTyp == null) ? "TYP?" : geraeteTyp;
        this.raum = (raum == null) ? "RAUM?" : raum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (name == null) ? "NAME?" : name;
    }

    public String getNetzAdresse() {
        return netzAdresse;
    }

    public void setNetzAdresse(String netzAdresse) {
        this.netzAdresse = (netzAdresse == null) ? "ADRESSE?" : netzAdresse;
    }

    public String getGeraeteTyp() {
        return geraeteTyp;
    }

    public void setGeraeteTyp(String geraeteTyp) {
        this.geraeteTyp = (geraeteTyp == null) ? "TYP?" : geraeteTyp;
    }

    public String getRaum() {
        return raum;
    }

    public void setRaum(String raum) {
        this.raum = (raum == null) ? "RAUM?" : raum;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", netzAdresse='" + netzAdresse + '\'' +
                ", geraeteTyp='" + geraeteTyp + '\'' +
                ", raum='" + raum + '\'' +
                '}';
    }
}
