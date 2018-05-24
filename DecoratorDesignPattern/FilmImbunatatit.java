package DecoratorDesignPattern;

public class FilmImbunatatit extends AbstractFilmImbunatatit {

	public FilmImbunatatit(IFilm film) {
		super(film);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pauza() {
		System.out.println("Filmul " + super.getNumeFilm() + " a intrat in pauza.");
	}

	@Override
	public void resume() {
		System.out.println("Filmul " + super.getNumeFilm() + " a reinceput.");
		
	}

	
	
}
