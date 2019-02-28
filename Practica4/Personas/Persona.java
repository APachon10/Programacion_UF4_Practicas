package Personas;

public class Persona {
	//Atributos
	private String nom;
	private int edat;
	private double altura;
	private char sexe;
	private boolean casat; 
	//Constructors por defecto
	public Persona() {
		
	}
	//Constructor Generico
	public Persona(String nom, int edat, double altura, char sexe, boolean casat) {
		super();
		this.nom = nom;
		this.edat = edat;
		this.altura = altura;
		this.sexe = sexe;
		this.casat = casat;
	}
	//Contructor para crear solteros
	public Persona(String nom, int edat, double altura, char sexe) {
		super();
		this.nom = nom;
		this.edat = edat;
		this.altura = altura;
		this.sexe = sexe;
		this.casat = false;
	}
	//Getters
	public String getNom() {
		return nom;
	}

	public int getEdat() {
		return edat;
	}
	public double getAltura() {
		return altura;
	}
	public char getSexe() {
		return sexe;
	}
	public boolean isCasat() {
		return casat;
	}
	//Setters
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	public void setCasat(boolean casat) {
		this.casat = casat;
	}
	
	@Override
	public String toString() {
		return "Persona --> nom=" + nom + ", edat=" + edat + ", altura=" + altura + ", sexe=" + sexe + ", casat=" + casat
				+ "]";
	}

	
}
