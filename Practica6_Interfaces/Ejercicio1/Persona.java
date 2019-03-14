package Ejercicio1;

import java.util.ArrayList;

public class Persona implements Comparable<Persona>{
	ArrayList<Persona > personas= new ArrayList<Persona>();
	private String nom;
	private int edad;
	private double al�ada;
	//Constructor
	
	public Persona(String nom, int edad, double al�ada) {
		this.nom = nom;
		this.edad = edad;
		this.al�ada = al�ada;
	}
	//Metodo para ordenar elementos 
	@Override
	public int compareTo(Persona o) {
/*		int res =0;
		if (this.al�ada > o.al�ada) {
			res =1;
		}else if (this.al�ada<o.al�ada) {
			res=0;
		}
		return res;*/
		return (int)(this.al�ada - o.al�ada);
	}

	@Override
	public String toString() {
		return "nom=" + nom + ", edad=" + edad + ", al�ada=" + al�ada;
	}
	public ArrayList<Persona> getPersonas() {
		return personas;
	}
	//Getters
	public String getNom() {
		return nom;
	}
	public int getEdad() {
		return edad;
	}
	public double getAl�ada() {
		return al�ada;
	}
	//Setters
	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setAl�ada(double al�ada) {
		this.al�ada = al�ada;
	}
	
}
