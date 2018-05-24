package CompositeDesignPattern;

public class TestComposite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Film f1 = new Film("Film de actiune");
		Film f2 = new Film("Comedie");
		Film f2b = new Film ("Comedie Muzicala");
		Film f3 = new Film("Drama");
		Film f4 = new Film("Horror");
		Film f5 = new Film("Romance");
		Film f5b = new Film ("Musical");
		
		Categorie categorie1 = new Categorie ("Filme");
		Categorie categorie2 = new Categorie ("Comedii");
		Categorie categorie3 = new Categorie("Muzicale");
		Categorie categorie4 = new Categorie("Altele");
		
		categorie1.adaugaNod(categorie2);
		categorie1.adaugaNod(categorie3);
		categorie1.adaugaNod(categorie4);
		
		categorie2.adaugaNod(f2);
		categorie2.adaugaNod(f2b);
		
		categorie3.adaugaNod(f2b);
		categorie3.adaugaNod(f5b);
		
		categorie4.adaugaNod(f5);
		categorie4.adaugaNod(f4);
		categorie4.adaugaNod(f3);
		
		categorie1.printeazaDescriere("");
		
	}

}
