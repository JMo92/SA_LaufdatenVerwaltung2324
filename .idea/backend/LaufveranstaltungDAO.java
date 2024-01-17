import java.util.List;
//bin mir nicht sicher ob ich das verwende
public class LaufveranstaltungDao {

    // Beispiel: Datenbankzugriff für die Erstellung einer Laufveranstaltung
    public void createLaufveranstaltung(String name, String distanz, Date termin, double startgebuhr, int maxTeilnehmer) {
        // Implementiere den Datenbankzugriff hier
        // ...
    }

    // Beispiel: Datenbankzugriff für die Anmeldung eines Teilnehmers
    public void createTeilnehmer(int laufveranstaltungId, String teilnehmerName) {
        // Implementiere den Datenbankzugriff hier
        // ...
    }

    // Beispiel: Datenbankzugriff für die Abruf aller Laufveranstaltungen
    public List<Laufveranstaltung> getAlleLaufveranstaltungen() {
        // Implementiere den Datenbankzugriff hier
        // ...
    }

    // Weitere Methoden entsprechend deiner Anforderungen
}
