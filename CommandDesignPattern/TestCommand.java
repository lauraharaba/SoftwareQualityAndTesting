package CommandDesignPattern;

public class TestCommand {

	public static void main (String [] args) {
		Manager manager = new Manager("Costache Ion");
		
		Secretara secretara = new Secretara();
		
		MesajInfo mesajInfo = new MesajInfo(manager, "Contract incheiat");
		MesajModificare mesajModificare = new MesajModificare(manager, "Limita asigurare RCA modificata la 8500");
		MesajContact mesajContact = new MesajContact(manager, "Agent vanzari Ion Popescu");
		
		secretara.preiaMesaj(mesajInfo);
		secretara.preiaMesaj(mesajModificare);
		secretara.preiaMesaj(mesajContact);
		
		System.out.println("Data 24-05-2018 -*- Flux mesaje");
		secretara.transmiteMesaje();
		
		System.out.println("Data 25-05-2018 -*- Flux mesaje");
		secretara.transmiteMesaje();
		
		MesajInfo mesajInfo2 = new MesajInfo(manager, "Contract nou");
		MesajModificare mesajModificare2 = new MesajModificare(manager, "Limita asigurare RCA modificata la 10000");
		
		secretara.preiaMesaj(mesajInfo2);
		secretara.preiaMesaj(mesajModificare2);
		
		System.out.println("Data 26-05-2018 -*- Flux mesaje");
		secretara.transmiteMesaje();
		
	
	}
	
}
