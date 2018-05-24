package ProxyDesignPattern;

public class ProxyContract implements IContract{

	private Contract contract = null;
	private String tipContract = null;
	private String numeClient=null;
	
	
	
	public ProxyContract(String tipContract, String numeClient) {
		this.tipContract = tipContract;
		this.numeClient = numeClient;
	}



	@Override
	public void multiplicareContract() {
		// TODO Auto-generated method stub
		if(contract == null) {
			contract=new Contract(tipContract, numeClient);
		}
		contract.multiplicareContract();
		
	}
	
	
}
