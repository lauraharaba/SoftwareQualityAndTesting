package SingletonDesignPattern;

/*
 * Pentru exemplificare se creeaza doua instante ale clasei Cinematograf.
 * O instanta cu 3 sali si alta cu 6. 
 * Metoda getInstanta() va crea o singura instanta, adica pe cea cu 3 sali. 
 */


public class TestSingleton {

	public static void main(String[] args) {
		
		Cinematograf c1 = Cinematograf.getInstanta(3);
		System.out.println(c1);
		
		Cinematograf c2 = Cinematograf.getInstanta(6);
		System.out.println(c2);
	}
	
}
