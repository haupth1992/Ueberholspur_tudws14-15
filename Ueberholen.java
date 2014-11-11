//@author Thomas Hauptvogel

public class Ueberholen {

	public static void main(String[] args) {
		int v1, v2; // Geschwindigkeiten
		float l1, l2; // Fahrzeuglängen
		float strecke, vm2, zeit; // weiteres Zeug
		
		v1 = 80;
		v2 = 90;
		l1 = 12.5f;
		l2 = 4.2f;
		 
		strecke = ((l1 + l2 + (v2/2 + v1/2))*v2)/(v2-v1); //Berechnung laut Wikipedia
		
		System.out.println("Der Überholvorgang erstreckt sich über " + strecke + "m!");
		
		vm2 = v2 / 3.6f; //Geschwindigkeit in m/s
	
		zeit = (strecke/vm2); //Zeit in s
		
		System.out.println("Der Lahmarsch benötigt " + zeit + "s!");
		
		//-----------------------------------------------------------------------------
		
		System.out.println("--------------------------------------");
		System.out.println("Jetzt mit Ganzzahlen:");
		
		//-----------------------------------------------------------------------------
		
		int il1 = (int) 12.5;
		int il2 = (int) 4.2;
		
		int istrecke = ((il1 + il2 + (v2/2 + v1/2))*v2)/(v2-v1); //Berechnung laut Wikipedia
		
		System.out.println("Der Überholvorgang erstreckt sich über " + istrecke + "m!");
		
		int ivm2 = v2 / (int)3.6;
		int izeit = (istrecke/ivm2);
		
		System.out.println("Der Lahmarsch benötigt " + izeit + "s!");
	}

}
