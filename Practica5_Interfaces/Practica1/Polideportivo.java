package Practica1;

public class Polideportivo {
	private String nom;
	//Constructors
	public Polideportivo(String nom) {
		this.nom = nom;
	}
	//Getters
	public String getNom() {
		return nom;
	}
	//Setters
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Polideportivo--> nom=" + nom;
	}
}
