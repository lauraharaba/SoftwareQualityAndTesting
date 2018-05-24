package DecoratorDesignPattern;

public abstract class AbstractFilmImbunatatit implements IFilm {

	private IFilm film;
	
	public IFilm getFilm() {
		return film;
	}
	
	public void setFilm(IFilm film) {
		this.film=film;
	}
	
	public AbstractFilmImbunatatit(IFilm film) {
		this.film=film;
	}
	
	
	@Override
	public void pornesteFilm() {
		film.pornesteFilm();

	}

	@Override
	public void opresteFilm() {
		film.opresteFilm();

	}

	@Override
	public String getNumeFilm() {
		return film.getNumeFilm();
	}

	//Dupa ce se implementeaza metodele deja existente, se definesc cele noi:
	public abstract void pauza();
	public abstract void resume();
	
	//Ultimele doua metode se vor implementa in clasa concreta
	
}
