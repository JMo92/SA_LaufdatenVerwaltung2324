// Definiere die HTML-Struktur des Menüs
const menuHTML = `
<div class="menu">
    <ul>
        <li><a href="startSeite.html">Startseite</a></li>
        <li><a href="anmeldungLaeufer.html">Läufer-Anmeldung</a></li>
        <li><a href="startGebuehr.html">Startgebühr überweisen</a></li>
        <li><a href="laufVeranstaltungen.html">Veranstaltungen</a></li>
        <li><a href="ergebnisse.html">Ergebnisse</a></li>
        <li><a href="abmeldung.html">Abmelden</a></li>
        <li><a href="offeneGebuehren.html">Offene Gebühren</a></li>
        <li><a href="kontakt.html">Kontakt</a></li>
    </ul>
</div>
`;

// Füge das Menü in den <body> jeder Seite ein
document.addEventListener("DOMContentLoaded", function() {
    document.body.insertAdjacentHTML("afterbegin", menuHTML);
});
