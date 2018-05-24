package StateDesignPattern;

public class StareAnulare implements State {

	@Override
	public void mesaj(String text) {
		System.out.println("Contract anulat din motive: " + text);

	}

}
