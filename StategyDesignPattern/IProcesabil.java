package StategyDesignPattern;

import java.util.List;

/* 
 * 
 * Clasa abstracta care defineste interfata obiectelor te tip strategie de alegere 
 * ce ofera algoritmi de prelucrare particularizati. 
 * 
 */

public interface IProcesabil {
	
	public abstract OfertaAsigurare alegereOferta(List<OfertaAsigurare> listaOferte);
	
}
