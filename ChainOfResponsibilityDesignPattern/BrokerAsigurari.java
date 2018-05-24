package ChainOfResponsibilityDesignPattern;


/*
 * 
 * Clasa BrokerAsigurari extinde clasa absracta Handler si 
 * defineste obiectul concret din cadrul secventei de tratare a evenimentelor produse. 
 * 
 * Tratarea evenimentului se realizeaza folosind un grad atasat fiecarei alerte si 
 * compararea acestui grad cu nivelul intern al angajatului
 * 
 */

public class BrokerAsigurari extends Handler {

	@Override
	public void procesareCerere(Alerta alerta) {
		if(alerta.getGrad()<=5) {
			System.out.println("Broker Asigurari a procesat alerta " + alerta.getMesaj());
		}
		else {
			System.out.println("Broker Asigurari NU a putut procesa alerta " + alerta.getGrad() + ", iar aceasta se trimite mai departe");
			if(this.succesor!=null)
				this.succesor.procesareCerere(alerta);
		}
		
	}
	
}
