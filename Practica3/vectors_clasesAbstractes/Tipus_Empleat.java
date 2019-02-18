package vectors_clasesAbstractes;

public abstract class Tipus_Empleat {
	private String nom,ciudatO,lloc;
	//Contructors
	public Tipus_Empleat(String nom, String ciudatO, String lloc) {
		this.nom = nom;
		this.ciudatO = ciudatO;
		this.lloc = lloc;
	}
	//Getters
	public String getNom() {
		return nom;
	}
	public String getCiutatO() {
		return ciudatO;
	}
	public String getlloc() {
		return lloc;
	}
	//Setters
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setCiudatO(String ciudatO) {
		this.ciudatO = ciudatO;
	}
	public void setLloc(String lloc) {
		this.lloc = lloc;
	}
	@Override
	public String toString() {
		return "nom=" + nom + ", ciudatO=" + ciudatO + ", lloc=" + lloc;
	}
	//Metodos
	public abstract String lloc();
	public abstract String ciutatOritge();
	public abstract double SalariDiari();
}
