package ObserverDesignPattern;

/*
 * 
 * Clasa TestObserver testeaza implementarea design pattern-ului Observator 
 * folosind un obiect de tip Eveniment si o lista de observatori 
 * formata din doi brokeri de asigurari si un manager
 * 
 * In urma abonarii observatorilor la evenimentele de ip media, acestia sunt notificati de anunt
 * 
 */

public class TestObserver {

	public static void main(String[] args) {
		Eveniment eveniment = new Eveniment();
		
		//observatori
		BrokerAsigurari brokerAsigurari1 = new BrokerAsigurari();
		BrokerAsigurari brokerAsigurari2 = new BrokerAsigurari();
		Manager manager = new Manager();
		
		//abonare observatori la evenimente Media
		eveniment.adaugareObservator(brokerAsigurari1);
		eveniment.adaugareObservator(brokerAsigurari2);
		eveniment.adaugareObservator(manager);
		
		//lansare eveniment in Media
		eveniment.anuntareMedia();
		
	}
	
}
