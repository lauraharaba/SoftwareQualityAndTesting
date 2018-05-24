package PrototypeDesignPattern;

public class TestPrototype {

	public static void main(String[] args) {
		IPersoanaSimulare p = new PersoanaSimulare("Ionescu Vasile", 28, "1940726889765");
		
		IPersoanaSimulare p1 = p.duplica();
		IPersoanaSimulare p2 = p.duplica();
		IPersoanaSimulare p3 = p.duplica();
		IPersoanaSimulare p4 = p.duplica();
		
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("Adresa p3= " + p3.hashCode());
		System.out.println(p4);
		System.out.println("Adresa p4= " + p4.hashCode());
		
	}
}
