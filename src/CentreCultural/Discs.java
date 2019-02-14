package CentreCultural;

public class Discs extends Productos{
	private String nombre_discografica;
	//Constructors 
	public Discs(int id, String títol, String autor, String nombre_discografica) {
		super(id, títol, autor);
		this.nombre_discografica = nombre_discografica;
	}
	//Getters
	public String getNombre_discografica() {
		return nombre_discografica;
	}
	//Setters
	public void setNombre_discografica(String nombre_discografica) {
		this.nombre_discografica = nombre_discografica;
	}
	@Override
	public String toString() {
		return "Discs ["+super.toString()+" nombre_discografica=" + nombre_discografica + "]";
	}
	
	
}
