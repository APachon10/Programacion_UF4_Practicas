package Practica1;

public class Edifici {
	private String nom;
	private double superficie;
	
	public Edifici() {
		
	}
	public Edifici(String nom, double superficie) {
		this.nom = nom;
		this.superficie = superficie;
	}
	//Getters
	public String getNom() {
		return nom;
	}
	public double getSuperficie() {
		return superficie;
	}
	//Setters
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	@Override
	public String toString() {
		return "Edifici--> nom=" + nom + ", superficie=" + superficie;
	}
	
	
	
}
