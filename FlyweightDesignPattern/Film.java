package FlyweightDesignPattern;

public class Film implements IFilm {

	private String denumire;
	
	
	public Film(String denumire) {
		super();
		this.denumire = denumire;
	}


	@Override
	public void play(Sala sala) {
		// TODO Auto-generated method stub

		System.out.println(denumire + "a inceput in sala " + sala.getNumarSala());
	}


	public String getDenumire() {
		return denumire;
	}


	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	
	

}
