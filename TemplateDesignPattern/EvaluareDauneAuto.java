package TemplateDesignPattern;

public class EvaluareDauneAuto extends EvaluareDaune {

	@Override
	public void deplasare() {
		System.out.println("Deplasare la fata locului (accidentului)");
		
	}

	@Override
	public void identificareDaune() {
		System.out.println("Identificare daune auto");
		
	}

	@Override
	public void consultareAnalisti() {
		System.out.println("Contactare analisti daune auto");
		
	}

	@Override
	public void consultareFirmaAsiguratoare() {
		System.out.println("Contactare firma asiguratoare auto");
	}

	@Override
	public void evaluareFinalaDaune() {
		System.out.println("Preluare date ale daunelor cladiri catre firma asiguratoare si transmitere la client");
		
	}

}
