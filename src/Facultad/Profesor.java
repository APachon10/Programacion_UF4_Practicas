package Facultad;

public class Profesor {
	private String nom,cognom,dni,estat_civil,departament;
	private int any_incorporacio,num_despatx;

	//Constructors
	public Profesor() {
		
	}
	public Profesor(String nom, String cognom, String dni, String estat_civil, String departament, int any_incorporacio,
			int num_despatx) {
		this.nom = nom;
		this.cognom = cognom;
		this.dni = dni;
		this.estat_civil = estat_civil;
		this.departament = departament;
		this.any_incorporacio = any_incorporacio;
		this.num_despatx = num_despatx;
		
	}
	//Getters
	public String getNom() {
		return nom;
	}
	public String getCognom() {
		return cognom;
	}
	public String getDni() {
		return dni;
	}
	public String getEstat_civil() {
		return estat_civil;
	}
	public String getDepartament() {
		return departament;
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
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setEstat_civil(String estat_civil) {
		this.estat_civil = estat_civil;
	}
	public void setDepartament(String departament) {
		this.departament = departament;
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
		return "Profesor [nom=" + nom + ", cognom=" + cognom + ", dni=" + dni + ", estat_civil=" + estat_civil
				+ ", departament=" + departament + ", any_incorporacio=" + any_incorporacio + ", num_despatx="
				+ num_despatx + "]";
	}
	
}
