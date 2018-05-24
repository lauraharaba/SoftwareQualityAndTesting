package ChainOfResponsibilityDesignPattern;

/*
 * 
 * Clasa CEORomania extinde clasa abstracta Handler
 * Clasa deineste obiectul concret din cadrul secventei de tratare a evenimentelor produce
 * 
 * 
 * 
 */


public class CEORomania extends Handler {

	@Override
	public void procesareCerere(Alerta alerta) {
		
		System.out.println("CEO Romania a procesat alerta: " + alerta.getMesaj());
		
	}

}
