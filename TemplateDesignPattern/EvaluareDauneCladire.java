package TemplateDesignPattern;

public class EvaluareDauneCladire extends EvaluareDaune {

	@Override
	public void deplasare() {
		System.out.println("Deplasare la cladirea clientului");
		
	}

	@Override
	public void identificareDaune() {
		System.out.println("Identificare daune cladire");
	}

	@Override
	public void consultareAnalisti() {
		System.out.println("Contactare analisti evaluare cladiri");
		
	}

	@Override
	public void consultareFirmaAsiguratoare() {
		System.out.println("Contactare firma asiguratoare cladiri");
		
	}

	@Override
	public void evaluareFinalaDaune() {
		System.out.println("Preluare date ale daunelor catre firma asiguratoare cladiri");
		
	}

}
