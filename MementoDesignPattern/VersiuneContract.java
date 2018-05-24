package MementoDesignPattern;

/*
 * 
 * Clasa contine doua atribute: clauzeContract si procent
 * Reprezinta o stare intermediara prin care un obiect de tip Contract trece, pana la momentul finalizarii
 * 
 */

public class VersiuneContract {
	
	private String clauzeContract;
	private float procent;
	
	public VersiuneContract() {
		clauzeContract="";
		procent=0;
	}

	public VersiuneContract(String clauzeContract, float procent) {
	
		this.clauzeContract = clauzeContract;
		this.procent = procent;
	}

	public String getClauzeContract() {
		return clauzeContract;
	}

	public float getProcent() {
		return procent;
	}
	
	
}
