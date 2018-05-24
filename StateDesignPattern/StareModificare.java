package StateDesignPattern;

public class StareModificare implements State {

	@Override
	public void mesaj(String text) {
		System.out.println("Contractul se modifica prin: "+text);

	}

}
