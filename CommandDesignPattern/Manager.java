package CommandDesignPattern;


/*
 * 
 * Clasa Manager reprezinta obiectul care este responsabil de tratarea mesajelor receptionate si contine o metoda specifica 
 * metoda reprezinta actiunea intreprinsa in functie de primirea unui anumit tip de Mesaj 
 * 
 */

public class Manager {

	private String nume;
	
	public Manager(String nume) {
		this.nume=nume;
	}
	
	public void proceseazaMesajInfo(String text) {
		System.out.println("Managerul a citit mesajul de informare: " + text);
	}
	
	public void proceseazaMesajModificare(String text) {
		System.out.println("Managerul a citit mesajul de modificare: " + text);
	}
	
	public void proceseazaMesajContact(String text) {
		System.out.println("Managerul a citit mesajul de contact: " + text);
	}
}
