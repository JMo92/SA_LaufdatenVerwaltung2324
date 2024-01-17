public class Ergebnisliste {
    private int id;
    private String Name;
    private int Platzierung;
    private String Laufzeit;
    private Laeufer Laeufer;

    // Konstruktor
    public Ergebnisliste(int id, String Name, int Platzierung, String Laufzeit, Laeufer Laeufer) {
        this.id = id;
        this.Name = Name;
        this.Platzierung = Platzierung;
        this.Laufzeit = Laufzeit;
        this.Laeufer = Laeufer;
    }

    // Getter und Setter-Methoden

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPlatzierung() {
        return Platzierung;
    }

    public void setPlatzierung(int platzierung) {
        Platzierung = platzierung;
    }

    public String getLaufzeit() {
        return Laufzeit;
    }

    public void setLaufzeit(String laufzeit) {
        Laufzeit = laufzeit;
    }

    public Laeufer getLaeufer() {
        return Laeufer;
    }

    public void setLaeufer(Laeufer laeufer) {
        Laeufer = laeufer;
    }

    // Weitere Methoden zur Datenmanipulation oder -abfrage können hier hinzugefügt werden.
}
