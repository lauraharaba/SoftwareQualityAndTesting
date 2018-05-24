package BuilderDesignPattern;

public class SalaBuilder implements IBuilder {

	private Sala sala;
	
	public SalaBuilder() {
		sala = new Sala();
	}
	
	public SalaBuilder setNumarSala(int nrSala) {
		sala.setNumarSala(nrSala);
		return this;
	}
	
	public SalaBuilder setLuminaAprinsa(boolean luminaAprinsa) {
		sala.setLuminaAprinsa(luminaAprinsa);
		return this;
	}
	
	public SalaBuilder setUsaDeschisa(boolean usaDeschisa) {
		sala.setUsaDeschisa(usaDeschisa);
		return this;
	}
	
	public SalaBuilder setFilmDifuzat(String filmDifuzat) {
		
		sala.setFilmDifuzat(filmDifuzat);
		return this;
	}
	
	@Override
	public Sala build() {
		return sala;

	}

}
