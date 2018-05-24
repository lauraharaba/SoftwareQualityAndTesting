package MementoDesignPattern;

public class Contract {

	private String clauzeContract;
	private float procent;
	private String numeClient;
	
	public Contract (String numeClient) {
		this.numeClient=numeClient;
	}
	
	public void adaugaClauzeContractuale(String caluze) {
		this.clauzeContract+="\n" + caluze;
	}
	
	public VersiuneContract salvare() {
		System.out.println("Salvare versiune contract...");
		return new VersiuneContract(this.clauzeContract, this.procent);
	}
	
	public void refacereVersiuneContractAnterior(VersiuneContract versiuneContract) {
		this.clauzeContract=versiuneContract.getClauzeContract();
		this.procent=versiuneContract.getProcent();
	}
	
	@Override
	public String toString() {
		return "Contract [clauzeContract=" + clauzeContract + " nume client: " + numeClient + "]";
	}
}
