package FlyweightDesignPattern;

/*
 * Clasa contine informatie cu privire la numarul salii in care un anumit film va fi difuzat
 */

public class Sala {
	
	private int numarSala;
	
	public int getNumarSala() {
		return numarSala;
	}
	
	public void setNumarSala(int numarSala) {
		this.numarSala=numarSala;
	}
	
	public Sala(int numarSala) {
		this.numarSala=numarSala;
	}
	
	public Sala() {
		this.numarSala=8;
	}
	
	@Override
	public String toString() {
		return "Sala numarul "+numarSala;
	}
}
