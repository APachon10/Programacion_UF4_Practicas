package CentreCultural;

public class Productos {
	private int id;
	private String t�tol,autor;
	//Constructors 
	public Productos(int id, String t�tol, String autor) {
		this.id = id;
		this.t�tol = t�tol;
		this.autor = autor;
	}
	//Getters
	public int getId() {
		return id;
	}
	public String getT�tol() {
		return t�tol;
	}
	public String getAutor() {
		return autor;
	}
	//Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setT�tol(String t�tol) {
		this.t�tol = t�tol;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	// To String 
	@Override
	public String toString() {
		return "Productos [id=" + id + ", t�tol=" + t�tol + ", autor=" + autor + "]";
	}
	
	
	
	
}
