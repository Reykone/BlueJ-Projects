/**
 * .
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Heizung {
	// Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
	double temperatur;

	/**
	 * Konstruktor f�r Objekte der Klasse Heizung
	 */
	public Heizung() {
		temperatur = 15.5;
	}

	/**
	 * Pr�ft ob die Temperatur im Intervall ist.
	 */
	public boolean pruefeTemperatur(double temp) {
		if (temp >= 0 && temp <= 45) {
			return true;
		}
		else {
			System.out
					.println("Fehler: Die Temperatur befindet sich nicht im korrekten Bereich von 0-45 Grad!");
			return false;
		}
	}

	/**
	 * Macht alles w�rmer (siehe Klimawandel).
	 */
	public void waermer() {
		if (pruefeTemperatur(temperatur + 0.5)) {

			temperatur += 0.5;
		}
	}

	/**
	 * Macht alles k�hler (siehe Eiszwerg). 
	 */
	public void kuehler() {
		if (pruefeTemperatur(temperatur - 0.5)) {
			temperatur -= 0.5;
		}
	}

	/**
	 * Macht alles total warm.
	 */
	public void schnellWaermer() {
		if (pruefeTemperatur(temperatur + 5)) {
			temperatur += 5;
		}
	}

	/**
	 * Macht alles total kalt (macht im K�hlschrank das Licht aus, Freund vom Eiszwerg).
	 */
	public void schnellKuehler() {
		if (pruefeTemperatur(temperatur - 5)) {
			temperatur -= 5;
		}
	}

	/**
	 * Gibt die aktuelle Temperatur zur�ck.
	 */
	public double gibTemperatur() {
		return temperatur;
	}

}