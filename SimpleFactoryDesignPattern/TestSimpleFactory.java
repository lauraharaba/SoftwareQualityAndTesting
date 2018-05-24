package SimpleFactoryDesignPattern;

public class TestSimpleFactory {

	public static void main(String[] args) {
		
		BiletFactory fabrica = new BiletFactory();
		Bilet bilet;
		
		bilet=fabrica.createInstance(TipBilet.ADULT);
		bilet.descriere();
		
		bilet=fabrica.createInstance(TipBilet.STUDENT);
		bilet.descriere();
		
		bilet=fabrica.createInstance(TipBilet.VIP);
		bilet.descriere();
	}

}
