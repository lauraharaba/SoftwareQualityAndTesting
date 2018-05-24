package ChainOfResponsibilityDesignPattern;

public class Manager extends Handler {

	@Override
	public void procesareCerere(Alerta alerta) {
		if(alerta.getGrad()<=10)
			System.out.println("Manager a procesat alerta: " + alerta.getMesaj());
		else {
			System.out.println("Manager NU a putut procesa alerta: "+alerta.getMesaj());
			if(this.succesor!=null)
				this.succesor.procesareCerere(alerta);
		}
		
	}

}
