package CompositeDesignPattern;

import java.util.List;
import java.util.ArrayList;

/*
 * Clasa reprezinta clasa composite din cadrul arborescentei. 
 * Aceasta implementeaza interfata INod si gestioneaza o lista de INod
 * in care pot exista atat alte categorii cat si obiecte de tip Film. 
 * 
 */

public class Categorie implements INod {

	List<INod> subnoduri = new ArrayList<>();
	private String numeCategorie;
	
	public Categorie(String numeCategorie) {
		super();
		this.numeCategorie=numeCategorie;
	}
	
	@Override
	public void printeazaDescriere(String spatii) {
		System.out.println(spatii + "Categoria "+ numeCategorie + " contine: " );
		for (INod nod:subnoduri)
			nod.printeazaDescriere(spatii+" ");

	}

	@Override
	public void adaugaNod(INod nod) {
		subnoduri.add(nod);

	}

	@Override
	public INod getNod(int i) {
		// TODO Auto-generated method stub
		return subnoduri.get(i);
	}

	@Override
	public void stergeNod(INod nod) {
		// TODO Auto-generated method stub
		subnoduri.remove(nod);
	}

}
