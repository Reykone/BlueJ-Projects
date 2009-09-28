/**
 * Personenwaage: Personen werden gewogen, gemessen und der
 * BMI wird berechnet.
 */
public class Waage {
	private double gewicht;
	private double groesse;
	private double bmi;

	/**
	 * Zwei Konstruktoren: 1. Mit Eingabe beider Werte,
	 *                     2. Ohne Eingabe von Werten.
	 */
	public Waage(double neuesGewicht, double neueGroesse) {
		gewicht = neuesGewicht;
		groesse = neueGroesse;
		bmi = 0;
	}

	public Waage() {
		gewicht = 0;
		groesse = 0;
		bmi = 0;
	}

	/**
	 * Gibt Gewicht zur�ck.
	 */
	public double gibGewicht() {
		return gewicht;
	}

	/**
	 * Gibt Groesse zur�ck.
	 */
	public double gibGroesse() {
		return groesse;
	}

	/**
	 * Ver�ndert Gewicht
	 */
	public void setzeGewicht(double neuesGewicht) {
		gewicht = neuesGewicht;
	}

	/**
	 * Ver�ndert Gr��e.
	 */
	public void setzeGroesse(double neueGroesse) {
		groesse = neueGroesse;
	}

	/**
	 * Berechnet den BMI aus den vorher eingegeben Werten, falls sie gesetzt und g�ltig sind.
	 */
	public double bodyMassIndex() {
		if (groesse != 0 && gewicht != 0) {
			double quadrat = groesse * groesse;
			double preBMI = gewicht / quadrat;
			bmi = preBMI * 10000;
			return bmi;
		}
		else {
			System.out.println("##############");
			System.out.println("Mindestens eine Angabe zum Berechnen des BMI fehlt.");
			System.out.println("##############");
			System.out.println("");
			return 0;
		}
	}

	/**
	 * Gibt alle Werte auf der Konsole aus.
	 */
	public void detailAusgabe() {
		bmi = bodyMassIndex();
		System.out.println("##############");
		System.out.println("Gr��e: " + groesse + "cm.");
		System.out.println("Gewicht: " + gewicht + "kg.");
		System.out.println("BMI: " + bmi);
		if (bmi < 18.5) {
			System.out.println("Achtung, wahrscheinlich bist du untergewichtig!");
		}
		else if (bmi >= 18.5 && bmi <= 25) {
				System.out.println("Dein Gewicht ist genau im richtigen Bereich. Sehr gut!");
			}
			else if (bmi > 25) {
					System.out.println("Achtung, wahrscheinlich bist du �bergewichtig!");
				}
		System.out.println("##############");
		System.out.println("");
	}

}