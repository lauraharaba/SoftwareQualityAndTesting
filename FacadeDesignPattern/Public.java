package FacadeDesignPattern;

import java.util.ArrayList;

/*
 * Clasa Public este acoperita de Facae. 
 * Aceasta clasa contine o lista de obiecte de tipul Persoana
 */
public class Public {

	private int nrPersoane;
	private ArrayList<Persoana> persoane;
	
	public Public(int nrPersoane) {
		this.nrPersoane=nrPersoane;
		persoane=new ArrayList<Persoana>();
		for(int i=0; i<nrPersoane; i++) {
			String numePersoana = "P"+(i+1);
			persoane.add(new Persoana(numePersoana));
		}
	}
	
	public void publiculIntraInSala() {
		System.out.println("Publicul intra in sala...");
		for(int i=0; i<nrPersoane; i++)
			persoane.get(i).merge();
	}
	
	public void publiculIeseDinSala() {
		System.out.println("Public iese din sala...");
		for(int i=0; i<nrPersoane; i++)
			persoane.get(i).merge();
	}
}
