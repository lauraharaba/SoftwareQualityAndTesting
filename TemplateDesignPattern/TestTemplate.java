package TemplateDesignPattern;

public class TestTemplate {

	public static void main(String[] args) {
		EvaluareDauneAuto dauneAuto = new EvaluareDauneAuto();
		EvaluareDauneCladire dauneCladire = new EvaluareDauneCladire();
		
		System.out.println("DAUNE AUTO");
		dauneAuto.evalueazaDaune();
		
		System.out.println("DAUNE CLADIRE");
		dauneCladire.evalueazaDaune();
	}
	
}
