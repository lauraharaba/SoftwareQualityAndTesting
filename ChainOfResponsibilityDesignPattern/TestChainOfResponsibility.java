package ChainOfResponsibilityDesignPattern;

public class TestChainOfResponsibility {

	public static void main(String[] args) {
		BrokerAsigurari brokerAsigurari = new BrokerAsigurari();
		Manager manager = new Manager();
		CEORomania ceoRomania = new CEORomania();
		
		//gestiune lant de tratare a alertelor
		brokerAsigurari.setSuccesor(manager);
		manager.setSuccesor(ceoRomania);
		
		Alerta a1=new Alerta(70, "Inundatii in judetul Ilfov");
		Alerta a2=new Alerta(3, "Schimbat nume contact");
		Alerta a3=new Alerta(8, "Modificare procent daune asigurare dezastre naturale");
		
		System.out.println("ALERTA - " + a1.getMesaj());
		brokerAsigurari.procesareCerere(a1);
		System.out.println("ALERTA - " + a2.getMesaj());
		brokerAsigurari.procesareCerere(a2);
		System.out.println("ALERTA - " + a3.getMesaj());
		brokerAsigurari.procesareCerere(a3);

	}

}
