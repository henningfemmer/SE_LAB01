public class Rechner {
    Object adresse;
    Object device;

    public Rechner(Object adresse, Object device) {
        adresse = this.adresse;
        device = this.device;
    }

    public Object getAdresse() {
        return adresse;
    }

    public void setAdresse(Object adresse) {
        this.adresse = adresse;
    }

    public Object getDevice() {
        return device;
    }

    public void setDevice(Object device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return "Rechner{" +
                "adresse=" + adresse +
                ", device=" + device +
                '}';
    }

    public static void main (String...args){

    }
}
