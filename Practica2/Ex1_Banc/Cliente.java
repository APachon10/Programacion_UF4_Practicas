package Ex1_Banc;

public class Cliente extends Banc{
	private String apellidos,DNI;
	
	public Cliente(String nom_Compte, String nom_Client, int deposit, int saldo,String apellidos,String dNI) {
		super(nom_Compte, nom_Client, deposit, saldo);
		this.apellidos = apellidos;
		DNI = dNI;
	}
	//Getters
	public String getApellidos() {
		return apellidos;
	}
	public String getDNI() {
		return DNI;
	}
	//Setters
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	///To String 
	@Override
	public String toString() {
		return "Cliente-->"+super.toString()+" [apellidos=" + apellidos + ", DNI=" + DNI + "]";
	}
	
	
}
