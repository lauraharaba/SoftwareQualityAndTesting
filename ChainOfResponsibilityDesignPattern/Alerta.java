package ChainOfResponsibilityDesignPattern;

/*
 * 
 * Clasa alerta este obiectul generat de realizarea fiecarui eveniment in parte si contine o componenta a mesajului, 
 * precum si un cod atasat reprezentand gradul aferent alertei
 */

public class Alerta {

	private int grad;
	private String mesaj;
	
	
	public Alerta(int grad, String mesaj) {
		this.grad = grad;
		this.mesaj = mesaj;
	}


	public int getGrad() {
		return grad;
	}


	public String getMesaj() {
		return mesaj;
	}
	
	
}
