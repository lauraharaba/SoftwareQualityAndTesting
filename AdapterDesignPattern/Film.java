package AdapterDesignPattern;

public class Film implements IFilm {

	private String numeFilm;
	
	public Film (String numeFilm) {
		this.numeFilm=numeFilm;
	}
	
	@Override
	public void pornesteFilm() {
		System.out.println("A pornit filmul: " + numeFilm);
		
	}

	@Override
	public void opresteFilm() {
		// TODO Auto-generated method stub
		System.out.println("Filmul " + numeFilm + " s-a terminat.");
	}

}
