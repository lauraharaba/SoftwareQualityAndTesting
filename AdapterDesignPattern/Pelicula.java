package AdapterDesignPattern;

public class Pelicula implements IPelicula {

	private String numePelicula;
	
	public Pelicula(String numePelicula)
	{
		this.numePelicula=numePelicula;
	}
	@Override
	public void pornestePelicula() {
		// TODO Auto-generated method stub
		System.out.println("A pornit pelicula: " + numePelicula);

	}

	@Override
	public void oprestePelicula() {
		// TODO Auto-generated method stub
		System.out.println("Pelicula " + numePelicula + " s-a temrinat.");
	}

}
