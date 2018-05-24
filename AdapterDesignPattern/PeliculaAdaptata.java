package AdapterDesignPattern;

public class PeliculaAdaptata extends Pelicula implements IFilm {

	public PeliculaAdaptata(String numePelicula) {
		super(numePelicula);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pornesteFilm() {
		super.pornestePelicula();
		
	}

	@Override
	public void opresteFilm() {
		super.oprestePelicula();
		
	}
	
	

}
