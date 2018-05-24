package PrototypeDesignPattern;

public class PersoanaSimulare implements IPersoanaSimulare {

	private String nume;
	private int varsta;
	private String cnp;
	
	
	public PersoanaSimulare() {
		this.nume="Popescu Ionel";
		this.varsta=33;
		this.cnp="1960305044657";
		
	}
	
	public PersoanaSimulare(String nume, int varsta, String cnp) {
		this.nume=nume;
		this.varsta=varsta;
		this.cnp=cnp;
	}
	
	@Override
	public String toString() {
		return "PersoanaSimulare cu numele: " + nume + ", varsta= " + varsta + " si cnp=" + cnp;
	}
	
	@Override
	public IPersoanaSimulare duplica() {
		try {
			return(IPersoanaSimulare)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

}
