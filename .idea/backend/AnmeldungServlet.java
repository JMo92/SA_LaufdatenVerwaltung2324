import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/anmeldung")
public class AnmeldungServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Daten aus dem Anmeldeformular abrufen
        String vorname = request.getParameter("vorname");
        String nachname = request.getParameter("nachname");
        String adresse = request.getParameter("adresse");
        String geschlecht = request.getParameter("geschlecht");
        int geburtsjahr = Integer.parseInt(request.getParameter("geburtsjahr"));
        String verein = request.getParameter("verein");
        String email = request.getParameter("email");
        boolean smsBenachrichtigungen = request.getParameter("sms") != null; // Überprüfen, ob die Checkbox ausgewählt wurde
        String laufveranstaltung = request.getParameter("laufveranstaltung");

        // Hier kannst du die Anmeldelogik implementieren, z.B., indem du die Daten in die Datenbank speicherst
        // Beispiel: LaufveranstaltungsService.läuferAnmelden(vorname, nachname, adresse, ...);

        // Beispielantwort (kann je nach Anforderungen angepasst werden)
        response.getWriter().println("Anmeldung erfolgreich! Vielen Dank, " + vorname + " " + nachname + "!");
    }
}
