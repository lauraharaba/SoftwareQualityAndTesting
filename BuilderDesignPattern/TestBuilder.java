package BuilderDesignPattern;

public class TestBuilder {

	public static void main(String[] args) {
		Sala sala1;
		sala1= new SalaBuilder().setNumarSala(6).setFilmDifuzat("Rambo").build();
		
		Sala sala2;
		sala2=new SalaBuilder().setLuminaAprinsa(false).setNumarSala(10).setUsaDeschisa(true).build();
		
		System.out.println(sala1);
		System.out.println(sala2);

	}

}
