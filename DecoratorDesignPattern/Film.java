package DecoratorDesignPattern;

public class Film implements IFilm {

	private String numeFilm;
	
	@Override
	public String getNumeFilm() {
		return numeFilm;
	}
	
	public void setNumeFilm(String numeFilm) {
		this.numeFilm=numeFilm;
	}
	
	
	public Film(String numeFilm) {
		super();
		this.numeFilm = numeFilm;
	}

	@Override
	public void pornesteFilm() {
		System.out.println("A pornit filmul: " + numeFilm);

	}

	@Override
	public void opresteFilm() {
		System.out.println("S-a terminat filmul: " + numeFilm);

	}

	

}
