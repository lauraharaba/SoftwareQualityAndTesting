package ObserverDesignPattern;

/*
 * 
 * Clasa BrokerAsigurari implementeaza interfata Observator si defineste functia concreta procesare(),
 * actiune pe care un broker de asigurari o intreprinde in zaul notificarii producerii unui event
 * 
 */

public class BrokerAsigurari implements Observator {

	@Override
	public void procesare() {
		System.out.println("Apelare persoana contact");
		
	}
	
	
}
