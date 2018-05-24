package StateDesignPattern;

public class StareIncheiat implements State {

	@Override
	public void mesaj(String text) {
		System.out.println("S-a incheiat contractul: "+text);

	}

}
