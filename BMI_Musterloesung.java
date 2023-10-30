	import java.util.Scanner;
public class BMI_Musterloesung {

	/**
	 * Das Koerpergewicht in Kilogramm und die Koerpergroesse in Meter einer Person wird von der Konsole 
	 * eingelesen.
	 * Der BMI (Gewicht in kg auf das Quadrat der Koerpergroesse in m) wird berechnet
	 * 
	 * @author schmidt
	 * @version 3.0
	 */

		public static void main(String args []) {
			int gewichtInKG;
			float groesse;
			float bmi;
			int vorkomma;
			float nachkomma;
			int nachkommaEineStelleGerundet;
			
			Scanner sc = new Scanner(System.in);
			//Einlesen
			gewichtInKG = sc.nextInt();
			groesse = sc.nextFloat();
			
			System.out.println("Koerpergewicht: " + gewichtInKG + " kg"); 
			System.out.println("Koerpergroesse: " + groesse + " m"); //Testausgabe
			// Verarbeiten
			// Gewicht in kg auf das Quadrat der Koerpergroesse in m
			bmi = gewichtInKG / (groesse * groesse);
			// System.out.println("BMI: " + bmi); //Testausgabe
			
			//Vorkomma und Nachkomma zur Kommasetzung bei der Ausgabe
			vorkomma = (int) bmi; //Nachkommastellen durch Cast-Befehl abschneiden
			nachkomma = bmi - vorkomma; //!!!WICHTIG!!!
			// System.out.println(vorkomma); //Testausgabe
			// System.out.println(nachkomma); //Testausgabe
			
			/*nachkomma als float, um Nachkommastellen nicht 
			vor dem Runden zu verlieren
			*/
			nachkomma = nachkomma *10; 
			// System.out.println(nachkomma); //Testausgabe
			
			//nachkommaEineStelleGerundet ist int das found int zurückgibt.
			nachkommaEineStelleGerundet = Math.round(nachkomma);
			//Ausgeben
			System.out.println("Der BMI betraegt: " + vorkomma + "," + nachkommaEineStelleGerundet);
			
			sc.close();
		
		}

	}
