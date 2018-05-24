package ProxyDesignPattern;

public class Contract implements IContract {

	private String tipContract=null;
	private String numeClient=null;
	
	@Override
	public void multiplicareContract() {
		System.out.println("Se xeroxeaza un document contract tip " + tipContract + " pentru " + numeClient);

	}

	public Contract(String tipContract, String numeClient) {
		super();
		this.tipContract = tipContract;
		this.numeClient = numeClient;
		imprimareContract();
	}
	
	public void imprimareContract() {
		System.out.println("Contractul " + tipContract+" s-a initializat si se printeaza pentru prima data.");
	}
	
	

}
