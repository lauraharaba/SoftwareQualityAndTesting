package DecoratorDesignPattern;

public class TestDecorator {

	public static void main(String[] args) {
		
		IFilm film = new Film ("Titanic");
		film.pornesteFilm();
		film.opresteFilm();
		AbstractFilmImbunatatit filmImbunatatit = new FilmImbunatatit(film);
		filmImbunatatit.pornesteFilm();
		filmImbunatatit.pauza();
		filmImbunatatit.resume();
		filmImbunatatit.opresteFilm();
		
	}

}
