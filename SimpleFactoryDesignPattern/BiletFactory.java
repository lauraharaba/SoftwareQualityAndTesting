package SimpleFactoryDesignPattern;

public class BiletFactory {

	Bilet createInstance(TipBilet tip) {
		
		//se foloseste switch pentru a se asigura returnarea tipului de apelator cerut. 
		
		switch(tip) {
		case ADULT:{
			return new BiletAdult();
		}
		case STUDENT:{
			return new BiletStudent();
		}
		case VIP:{
			return new BiletVIP();
		}
		default:
			return null;
		}
	}
}
