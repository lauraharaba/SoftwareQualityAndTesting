package SingletonDesignPattern;

public class Cinematograf {

	private String nume;
	private String adresa;
	private int nr_sali;
	private static Cinematograf instanta = null;
	
	//constructorul clasei este private pentru a se putea apela doar din interiorul clasei
	
	private Cinematograf(int nr_sali) {
		nume ="LightCinema";
		adresa = "Bulevardul Timisoara nr. 26";
		this.nr_sali=nr_sali;
		
	}
	
	public static Cinematograf getInstanta(int nr_sali) {
		if(instanta!=null) {
			System.out.println("Deja s-a creat o instanta!");
		}
			
		if(instanta==null) {
			instanta=new Cinematograf(nr_sali);
		}
		return instanta;	
	}
	
	@Override
	public String toString() {
		return "Cinematograf " + nume + ", adresa: " + adresa + "\n Cinematograful are " + nr_sali + " sali.";
	}
}
