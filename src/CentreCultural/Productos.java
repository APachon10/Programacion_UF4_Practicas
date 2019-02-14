package CentreCultural;

public class Productos {
	private int id;
	private String títol,autor;
	//Constructors 
	public Productos(int id, String títol, String autor) {
		this.id = id;
		this.títol = títol;
		this.autor = autor;
	}
	//Getters
	public int getId() {
		return id;
	}
	public String getTítol() {
		return títol;
	}
	public String getAutor() {
		return autor;
	}
	//Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setTítol(String títol) {
		this.títol = títol;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	// To String 
	@Override
	public String toString() {
		return "Productos [id=" + id + ", títol=" + títol + ", autor=" + autor + "]";
	}
	
	
	
	
}
