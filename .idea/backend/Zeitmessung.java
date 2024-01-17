public class Zeitmessung {
    private int id;
    private int Startnummer;
    private String Zwischenzeit;
    private String Endzeit;

    // Konstruktor
    public Zeitmessung(int id, int Startnummer, String Zwischenzeit, String Endzeit) {
        this.id = id;
        this.Startnummer = Startnummer;
        this.Zwischenzeit = Zwischenzeit;
        this.Endzeit = Endzeit;
    }

    // Getter und Setter-Methoden (nicht gezeigt)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStartnummer() {
        return Startnummer;
    }

    public void setStartnummer(int startnummer) {
        Startnummer = startnummer;
    }

    public String getZwischenzeit() {
        return Zwischenzeit;
    }

    public void setZwischenzeit(String zwischenzeit) {
        Zwischenzeit = zwischenzeit;
    }

    public String getEndzeit() {
        return Endzeit;
    }

    public void setEndzeit(String endzeit) {
        Endzeit = endzeit;
    }

    // Weitere Methoden zur Datenmanipulation oder -abfrage können hier hinzugefügt werden.
}

