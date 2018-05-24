package ObserverDesignPattern;

public class Eveniment extends Mediatizabil {
	
	private boolean isMedia=false;
	
	public void anuntareMedia() {
		if(!isMedia) {
			isMedia=true;
			this.notificareObservator();
		}
		
		else
			isMedia=false;
	}
	
	public void anuntMedia() {
		System.out.println("Anunt Media de interes privind firma ?$#");
		anuntareMedia();
		System.out.println("Anunt Media de interes privind firma ?$#");
	}

}
