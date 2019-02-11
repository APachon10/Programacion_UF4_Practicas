package Instituto;

public class Profesor {
	private String nom,cognoms,nif,curs;
	private int sou,num_hores;

	//Constructor
	public Profesor(String nom, String cognoms, String nif, String curs, int sou, int num_hores) {
		this.nom = nom;
		this.cognoms = cognoms;
		this.nif = nif;
		this.curs = curs;
		this.sou = sou;
		this.num_hores = num_hores;
	}
	//Getters && Setters 
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognoms() {
		return cognoms;
	}
	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getCurs() {
		return curs;
	}
	public void setCurs(String curs) {
		this.curs = curs;
	}
	public int getSou() {
		return sou;
	}
	public void setSou(int sou) {
		this.sou = sou;
	}
	public int getNum_hores() {
		return num_hores;
	}
	public void setNum_hores(int num_hores) {
		this.num_hores = num_hores;
	}
	//Metodos de la clase
	boolean cambiarHorario(String horarioNuevo) {
		boolean cambio =false;
		 
		if (!horarioNuevo.equals(null)) {
			int nuevoHorario = Integer.parseInt(horarioNuevo);
			if (nuevoHorario == this.num_hores) {
				cambio=false;
			}else {
				int horarioAnterior =this.num_hores;
				this.num_hores = nuevoHorario;
				System.out.println("El horario del profesor "+this.nom + " ha sido cambiado de "+horarioAnterior + " Horas a "+this.num_hores+" Horas");
				cambio =true;
			}
		}
		return cambio;
	}
	@Override
	public String toString() {
		return "Profesor [nom=" + nom + ", cognoms=" + cognoms + ", nif=" + nif + ", curs=" + curs + ", sou=" + sou
				+ ", num_hores=" + num_hores + "]";
	}
	
	
}
