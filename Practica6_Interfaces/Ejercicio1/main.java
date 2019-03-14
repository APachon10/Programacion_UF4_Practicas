package Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main {
	static ArrayList<Persona> persona = new ArrayList<Persona>();
	public static void main(String[] args) {
		Persona p = new Persona(null,0,0);
		rellenarArrayList(persona);
		System.out.println("========================");
		System.out.println("Lista de Personas sin ordenar ");
		System.out.println("========================");
		mostrarDatos(persona);
		System.out.println("========================");

		Collections.sort(persona);

		System.out.println("Lista de Personas ordenas por Altura");
		System.out.println("=========================");
		mostrarDatos(persona);
		System.out.println("========================");
		System.out.println();
		System.out.println("Programa Finalizado ");
	}
	
	
	//Metodos para gestionar El ArrayList
	public static ArrayList<Persona> rellenarArrayList(ArrayList<Persona> people) {
		Persona e = new Persona("Dani",22,1.87);
		people.add(e);
		Persona e2=new Persona("Pol",52,1.73);
		people.add(e2);

		Persona e3=new Persona("Manel",27,1.58);
		people.add(e3);

		Persona e4=new Persona("David",25,1.64);
		people.add(e4);

		Persona e5=new Persona("Pere",80,1.84);
		people.add(e5);
		return people;
	} 
	public static void insertarElemento(Persona e) {
		persona.add(e);
	}
	public static void mostrarDatos(ArrayList<Persona> people) {
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
	}
}
