package CentreCultural;

public class Llibres extends Productos{
	private int num_pag ;
	//Constructors
	public Llibres(int id, String títol, String autor, int num_pag) {
		super(id, títol, autor);
		this.num_pag = num_pag;
	}
	//Getters
	public int getNum_pag() {
		return num_pag;
	}
	//Setters
	public void setNum_pag(int num_pag) {
		this.num_pag = num_pag;
	}
	@Override
	public String toString() {
		return "Llibres ["+super.toString()+" num_pag=" + num_pag + "]";
	}
	
	
}
