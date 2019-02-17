package Facultad;

public class Estudiant {
	private String nom,cognoms,DNI,estat_civil;
	private int curs;
	
	//Constructors 
	public Estudiant() {
		
	}
	public Estudiant(String nom, String cognoms, String dNI, String estat_civil, int curs) {
		this.nom = nom;
		this.cognoms = cognoms;
		this.DNI = dNI;
		this.estat_civil = estat_civil;
		this.curs = curs;
	}
	
	//Getters 
	public String getNom() {
		return nom;
	}
	public String getCognoms() {
		return cognoms;
	}
	public String getDNI() {
		return DNI;
	}
	public String getEstat_civil() {
		return estat_civil;
	}
	public int getCurs() {
		return curs;
	}
	//Setters
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public void setEstat_civil(String estat_civil) {
		this.estat_civil = estat_civil;
	}
	public void setCurs(int curs) {
		this.curs = curs;
	}
	
	
	//To String
	@Override
	public String toString() {
		return "Estudiant [nom=" + nom + ", cognoms=" + cognoms + ", DNI=" + DNI + ", estat_civil=" + estat_civil
				+ ", curs=" + curs + "]";
	}
	//Metodos
}
