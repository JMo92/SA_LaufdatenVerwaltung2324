import java.util.Date;

public class Laufveranstaltung {
    private int id;
    private String Name;
    private String Distanz;
    private Date Termin;
    private double Startgebühr;
    private int gemeldeteTeilnehmer;

    // Konstruktor
    public Laufveranstaltung(int id, String Name, String Distanz, Date Termin, double Startgebühr, int gemeldeteTeilnehmer) {
        this.id = id;
        this.Name = Name;
        this.Distanz = Distanz;
        this.Termin = Termin;
        this.Startgebühr = Startgebühr;
        this.gemeldeteTeilnehmer = gemeldeteTeilnehmer;
    }

    // Getter und Setter-Methoden:
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

    public String getDistanz() {
        return Distanz;
    }

    public void setDistanz(String distanz) {
        Distanz = distanz;
    }

    public Date getTermin() {
        return Termin;
    }

    public void setTermin(Date termin) {
        Termin = termin;
    }

    public double getStartgebühr() {
        return Startgebühr;
    }

    public void setStartgebühr(double startgebühr) {
        Startgebühr = startgebühr;
    }

    public int getGemeldeteTeilnehmer() {
        return gemeldeteTeilnehmer;
    }

    public void setGemeldeteTeilnehmer(int gemeldeteTeilnehmer) {
        this.gemeldeteTeilnehmer = gemeldeteTeilnehmer;
    }

    // Weitere Methoden zur Datenmanipulation oder -abfrage können hier hinzugefügt werden.
}
