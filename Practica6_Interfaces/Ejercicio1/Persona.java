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
		int res =0;
		if (this.edad > o.edad) {
			res =1;
		}else if (this.edad<o.edad) {
			res=0;
		}
		return res;
	}
	//Metodos para gestionar El ArrayList
	public ArrayList<Persona> rellenarArrayList() {
		Persona e = new Persona("Dani",22,1.87);
		personas.add(e);
		Persona e2=new Persona("Pol",52,1.73);
		personas.add(e2);
		
		Persona e3=new Persona("Manel",27,1.58);
		personas.add(e3);
		
		Persona e4=new Persona("David",25,1.64);
		personas.add(e4);
		
		Persona e5=new Persona("Pere",80,1.84);
		personas.add(e5);
		return personas;
	} 
	public void insertarElemento(Persona e) {
		personas.add(e);
	}
	public void mostrarDatos(ArrayList<Persona> people) {
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
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
