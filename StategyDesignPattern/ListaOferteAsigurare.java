package StategyDesignPattern;

import java.util.ArrayList;
import java.util.List;


/*
 * 
 * Clasa ListaOferteAsigurare gestioneaza lista de oferte de asigurare detinute de firma 
 * Precum si o referinta de tip IProcesabil catre obiectul care va oferi tipul de prelucrare
 * 
 */

public class ListaOferteAsigurare {

	List<OfertaAsigurare> listaOferte = new ArrayList<OfertaAsigurare>();
	protected IProcesabil strategie;
	
	public void addOferta (OfertaAsigurare oferta) {
		listaOferte.add(oferta);
		
	}
	
	public void setStrategie(IProcesabil strategie) {
		this.strategie=strategie;
	}
	
	public OfertaAsigurare alegereOferta() {
		if(strategie != null)
			return strategie.alegereOferta(listaOferte);
		else
			throw new UnsupportedOperationException();
	}
	
}
