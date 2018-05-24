package PrototypeDesignPattern;

/*
 * Interfata IPersoanaSimulare reprezinta tipul abstract care contine metoda duplica() - adica pentru clonarea obiectelor
 * 
 * Interfata extinde Cloneable pentru a se realiza clonarea obiectelor (deep copy)
 * 
 */

public interface IPersoanaSimulare extends Cloneable {

	public IPersoanaSimulare duplica();
}
