package Banc;

public class Banc {
	private String nom_Compte,nom_Client;
	private int deposit,saldo;
	//Constructors
	public Banc(String nom_Compte, String nom_Client, int deposit, int saldo) {
		this.nom_Compte = nom_Compte;
		this.nom_Client = nom_Client;
		this.deposit = deposit;
		this.saldo = saldo;
	}
	//Getters
	public String getNom_Compte() {
		return nom_Compte;
	}
	public String getNom_Client() {
		return nom_Client;
	}
	public int getDeposit() {
		return deposit;
	}
	public int getSaldo() {
		return saldo;
	}
	//Setters
	public void setNom_Compte(String nom_Compte) {
		this.nom_Compte = nom_Compte;
	}
	public void setNom_Client(String nom_Client) {
		this.nom_Client = nom_Client;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	//To String 
	@Override
	public String toString() {
		return "Banc [nom_Compte=" + nom_Compte + ", nom_Client=" + nom_Client + ", deposit=" + deposit + ", saldo="
				+ saldo + "]";
	}
	//Metodos 
	
	
}
