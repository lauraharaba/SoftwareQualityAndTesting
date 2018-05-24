package StateDesignPattern;

public class StareNegociere implements State {

	@Override
	public void mesaj(String text) {
		System.out.println("Se negociaza contractul cu structura initiala: " + text);

	}

}
