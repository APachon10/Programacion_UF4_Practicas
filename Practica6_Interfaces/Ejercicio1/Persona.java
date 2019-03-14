package Ejercicio1;

import java.util.ArrayList;

public class Persona implements Comparable<Persona>{
	ArrayList<Persona > personas= new ArrayList<Persona>();
	private String nom;
	private int edad;
	private double altura;
	//Constructor
	
	public Persona(String nom, int edad, double altura) {
		this.nom = nom;
		this.edad = edad;
		this.altura = altura;
	}
	//Metodo para ordenar elementos 
	@Override
	public int compareTo(Persona o) {
		int res =0;
		if (this.altura > o.altura) {
			res =-1;
		}else if (this.altura<o.altura) {
			res=1;
		}
		return res;
	}

	@Override
	public String toString() {
		return "nom=" + nom + ", edad=" + edad + ", altura=" + altura;
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
	public double getaltura() {
		return altura;
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
	public void setaltura(double altura) {
		this.altura = altura;
	}
	
}
