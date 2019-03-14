package Ejercicio1;

import java.util.ArrayList;

public class Persona implements Comparable<Persona>{
	ArrayList<Persona > personas= new ArrayList<Persona>();
	private String nom;
	private int edad;
	private double alçada;
	//Constructor
	
	public Persona(String nom, int edad, double alçada) {
		this.nom = nom;
		this.edad = edad;
		this.alçada = alçada;
	}
	//Metodo para ordenar elementos 
	@Override
	public int compareTo(Persona o) {
/*		int res =0;
		if (this.alçada > o.alçada) {
			res =1;
		}else if (this.alçada<o.alçada) {
			res=0;
		}
		return res;*/
		return (int)(this.alçada - o.alçada);
	}

	@Override
	public String toString() {
		return "nom=" + nom + ", edad=" + edad + ", alçada=" + alçada;
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
	public double getAlçada() {
		return alçada;
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
	public void setAlçada(double alçada) {
		this.alçada = alçada;
	}
	
}
