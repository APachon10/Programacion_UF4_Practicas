package Ejercicio1;

import java.util.ArrayList;

public class Persona implements Comparable<Persona>{
	ArrayList<Persona > personas= new ArrayList<Persona>();
	private String nom,edad;
	private int alçada;
	//Constructor
	public Persona(String nom, String edad, int alçada) {
		this.nom = nom;
		this.edad = edad;
		this.alçada = alçada;
	}
	//Metodo para ordenar elementos 
	@Override
	public int compareTo(Persona o) {
		int res =0;
		if (this.edad > o.edad) {
			res = 1;
			
		}
		return 0;
	}
	//Metodos para gestionar El ArrayList
	public void rellenarArrayList(ArrayList<Persona> people,Persona e) {
		people.add(e);
	} 
	public void mostrarDatos(ArrayList<Persona> people) {
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
	}
	
}
