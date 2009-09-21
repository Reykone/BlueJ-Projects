/**
 * Personenwaage: Personen werden gewogen, gemessen und der
 * BMI wird berechnet.
 */
public class Waage {
	private int gewicht;
	private int groesse;

	/**
	 * Zwei Konstruktoren: 1. Mit Eingabe beider Werte,
	 *                     2. Ohne Eingabe von Werten.
	 */
	public Waage(int neuesGewicht, int neueGroesse) {
		gewicht = neuesGewicht;
		groesse = neueGroesse;
	}

	public Waage() {
		gewicht = 0;
		groesse = 0;
	}

	/**
	 * Gibt Gewicht zur�ck.
	 */
	public int gibGewicht() {
		return gewicht;
	}

	/**
	 * Gibt Groesse zur�ck.
	 */
	public int gibGroesse() {
		return groesse;
	}

	/**
	 * Ver�ndert Gewicht
	 */
	public void setzeGewicht(int neuesGewicht) {
		gewicht = neuesGewicht;
	}

	/**
	 * Ver�ndert Gr��e.
	 */
	public void setzeGroesse(int neueGroesse) {
		groesse = neueGroesse;
	}

}