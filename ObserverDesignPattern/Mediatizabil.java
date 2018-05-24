package ObserverDesignPattern;

import java.util.ArrayList;

/*
 * 
 * Clasa Mediatizabil este clasa abstracta care gestioneaza lista de observatori
 * care se aboneaza unui eveniment
 * contine metode de adaugare si eliminare de obiecte de top Observator din lista 
 * 
 */

public abstract class Mediatizabil {

	ArrayList<Observator> observatori = new ArrayList<Observator>();
	
	public void adaugareObservator(Observator observator) {
		observatori.add(observator);
	}
	
	public void eliminaObservator(Observator observator) {
		observatori.remove(observator);
	}
	
	public void notificareObservator() {
		for(int i=0; i<observatori.size(); i++) {
			observatori.get(i).procesare();
		}
	}
	
}
