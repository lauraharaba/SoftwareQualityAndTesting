package ProxyDesignPattern;

public class TestProxy {

	public static void main(String [] args) {
		
		IContract contract1 = new ProxyContract("RCA", "Ion Ionel");
		IContract contract2 = new ProxyContract("Casco", "George Georgel");
		
		contract1.multiplicareContract();
		contract1.multiplicareContract();
		contract2.multiplicareContract();
		System.out.println(contract2.hashCode());
		contract2.multiplicareContract();
		contract1.multiplicareContract();
		contract2.multiplicareContract();
		System.out.println(contract2.hashCode());
	}
	
}
