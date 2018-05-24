package StateDesignPattern;

public class TestState {

	public static void main(String[] args) {
		ContractAsigurari contract=new ContractAsigurari();
		contract.mesaj("Parc auto format din 100 camioane. de gasit oferta pentru asigurare RCA.");
		
		contract.setStare(Stari.MODIFICARE);
		contract.mesaj("De adaugat oferta noua pentru asigurare RCA");
		
		contract.setStare(Stari.INCHEIAT);
		contract.mesaj("Date Director: Director contracte");
	}
	
}
