/**
 * Eine Klasse, deren Exemplare Informationen �ber ein Buch halten.
 * Dies k�nnte Teil einer gr��eren Anwendung sein, einer
 * Bibliothekssoftware beispielsweise.
 *
 * @author (Ihren Namen hier eintragen.)
 * @version (das heutige Datum eintragen.)
 */
class Buch {
	// Exemplarvariablen
	private String autor;
	private String titel;

	/**
	 * Setze den Autor und den Titel, wenn ein Exemplar erzeugt wird.
	 */
	public Buch(String buchautor, String buchtitel) {
		autor = buchautor;
		titel = buchtitel;
	}

	/**
	 * Gib den Autor des Buches zur�ck.
	 */
	public String gibAutor() {
		return autor;
	}

	/**
	 * Gid den Titel des Buches zur�ck.
	 */
	public String gibTitel() {
		return titel;
	}

	/**
	 * Der Titel des Buches wird auf der Konsole ausgegeben.
	 */
	public void schreibTitel() {
		System.out.println("##############");
		System.out.println("Titel: " + titel);
		System.out.println("##############");
		System.out.println();
	}

	/**
	 * Der Autor des Buches wird auf der Konsole ausgegeben.
	 */
	public void schreibAutorl() {
		System.out.println("##############");
		System.out.println("Autor: " + autor);
		System.out.println("##############");
		System.out.println();
	}

}