package StategyDesignPattern;

//Implementarea modulului implica utilizarea design pattern-ului Strategy

//Strategy permite alegerea la run-time a algoritmului care sa fie utilizat in scopul identificarii ofertei de asigurare optim.


public class OfertaAsigurare {

	private String furnizorOfertaAsigurare;
	private float limitaMaximaAsigurata;
	private float costAsigurare;
	
	
	public OfertaAsigurare(String furnizorOfertaAsigurare, float limitaMaximaAsigurata, float costAsigurare) {
		super();
		this.furnizorOfertaAsigurare = furnizorOfertaAsigurare;
		this.limitaMaximaAsigurata = limitaMaximaAsigurata;
		this.costAsigurare = costAsigurare;
	}


	public String getFurnizorOfertaAsigurare() {
		return furnizorOfertaAsigurare;
	}


	public float getLimitaMaximaAsigurata() {
		return limitaMaximaAsigurata;
	}


	public float getCostAsigurare() {
		return costAsigurare;
	}
	
	
	@Override
	public String toString() {
		return "OfertaAsigurare [furnizorOfertaAsigurare= " + furnizorOfertaAsigurare + " limita " + limitaMaximaAsigurata
				+ " cost=" + costAsigurare +"]";
	}
	
}
