package Instituto;

public class Administrativos {
	private String name,surname,nif;
	private int sou;
	//Contructor 
	public Administrativos(String name, String surname, String nif, int sou) {
		this.name = name;
		this.surname = surname;
		this.nif = nif;
		this.sou = sou;
	}
	//Getters && Setters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public int getSou() {
		return sou;
	}
	public void setSou(int sou) {
		this.sou = sou;
	}
	//Metodos
	int modificarSueldo(int nuevoSueldo) {
		if (nuevoSueldo<this.sou) {
			System.out.println("Sueldo introducido mas bajo que el Anterior asi que ejecutaremos el metodo de bajar sueldo ");
			bajarSueldo(nuevoSueldo);
		}else {
			System.out.println("Sueldo introducido mas grande que el Anterior asi que ejecutaremos el metodo de subir sueldo ");
			subirSueldo(nuevoSueldo);
		}
		return nuevoSueldo;
	}
	public int subirSueldo(int nuevoSueldo) {
		this.sou = nuevoSueldo + this.sou;
		return this.sou;
	}
	public int bajarSueldo(int nuevoSueldo) {
		this.sou = nuevoSueldo - this.sou;
		return this.sou;
	}
	@Override
	public String toString() {
		return "Administrativos [name=" + name + ", surname=" + surname + ", nif=" + nif + ", sou=" + sou + "]";
	}
	
}
