package CommandDesignPattern;

import java.util.ArrayList;

public class Secretara {

	public ArrayList<Mesaj> listaMesaje;
	
	public Secretara() {
		listaMesaje=new ArrayList();
	}
	
	public void preiaMesaj(Mesaj mesaj) {
		this.listaMesaje.add(mesaj);
	}
	
	public void transmiteMesaje() {
		if(listaMesaje.size()==0)
			System.out.println("Nu exista mesaje!");
		for(Mesaj m:listaMesaje) {
			m.proceseaza();
		}
		listaMesaje.clear();
	}
	
}
