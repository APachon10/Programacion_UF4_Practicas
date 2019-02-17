package Facultad;

public class Personal_de_Servei {
	private String nom,cognoms,DNI,estat_civil,seccio;
	private int any_incorporacio,num_despatx;
	
	
	//Constructors
	public Personal_de_Servei() {
		
	}
	public Personal_de_Servei(String nom, String cognoms, String dNI, String estat_civil, String seccio,
			int any_incorporacio, int num_despatx) {
		this.nom = nom;
		this.cognoms = cognoms;
		DNI = dNI;
		this.estat_civil = estat_civil;
		this.seccio = seccio;
		this.any_incorporacio = any_incorporacio;
		this.num_despatx = num_despatx;
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
	public String getSeccio() {
		return seccio;
	}
	public int getAny_incorporacio() {
		return any_incorporacio;
	}
	public int getNum_despatx() {
		return num_despatx;
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
	public void setSeccio(String seccio) {
		this.seccio = seccio;
	}
	public void setAny_incorporacio(int any_incorporacio) {
		this.any_incorporacio = any_incorporacio;
	}
	public void setNum_despatx(int num_despatx) {
		this.num_despatx = num_despatx;
	}
	//To String 
	@Override
	public String toString() {
		return "Personal_de_Servei [nom=" + nom + ", cognoms=" + cognoms + ", DNI=" + DNI + ", estat_civil="
				+ estat_civil + ", seccio=" + seccio + ", any_incorporacio=" + any_incorporacio + ", num_despatx="
				+ num_despatx + "]";
	}
	
}
