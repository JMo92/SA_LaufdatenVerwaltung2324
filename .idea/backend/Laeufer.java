public class Laeufer {

    private int id;
    private String name;
    private String vorname;
    private String adresse;
    private String geschlecht;
    private int geburtsjahr;
    private String vereinszugehörigkeit;
    private String email;
    private String sms;

    // Konstruktor
    public Laeufer(int id, String name, String vorname, String adresse, String geschlecht, int geburtsjahr, String vereinszugehörigkeit, String email, String sms) {
        this.id = id;
        this.name = name;
        this.vorname = vorname;
        this.adresse = adresse;
        this.geschlecht = geschlecht;
        this.geburtsjahr = geburtsjahr;
        this.vereinszugehörigkeit = vereinszugehörigkeit;
        this.email = email;
        this.sms = sms;
    }

    // Getter und Setter-Methoden für die Attribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    public String getVereinszugehörigkeit() {
        return vereinszugehörigkeit;
    }

    public void setVereinszugehörigkeit(String vereinszugehörigkeit) {
        this.vereinszugehörigkeit = vereinszugehörigkeit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    // Weitere Methoden zur Datenmanipulation oder -abfrage können hier hinzugefügt werden.
}
