package CompositeDesignPattern;

public interface INod {

	public void printeazaDescriere(String spatii);
	public void adaugaNod(INod nod);
	public INod getNod(int i);
	public void stergeNod(INod nod);
}
