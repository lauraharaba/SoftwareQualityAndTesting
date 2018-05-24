package FacadeDesignPattern;

public class Cinema {

	private Sala sala;
	private Film film;
	private Public publicul;
	
	public Cinema() {
		
	}
	
	
	public void difuzareFilmInSala(String numeSala, String numeFilm) {
		sala = new Sala(numeSala);
		publicul = new Public(3);
		film = new Film(numeFilm);
		sala.deschideUsa();
		sala.aprindeLumina();
		publicul.publiculIntraInSala();
		sala.inchideUsa();
		sala.stingeLumina();
		film.play();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		film.stop();
		sala.aprindeLumina();
		sala.deschideUsa();
		publicul.publiculIeseDinSala();

	}
}
