package Practica2;

public class Persona {
	private String nom;
	private int altura,edad;
	//Constructors
	public Persona(String nom, int altura, int edad) {
		super();
		this.nom = nom;
		this.altura = altura;
		this.edad = edad;
	}
	//Getters
	public String getNom() {
		return nom;
	}
	
	public int getAltura() {
		return altura;
	}
	public int getEdad() {
		return edad;
	}
	//Setters
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	//toString
	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", altura=" + altura + ", edad=" + edad + "]";
	}
	
	
}
