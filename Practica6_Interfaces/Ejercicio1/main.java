package Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main {
	public static void main(String[] args) {
		ArrayList<Persona> persona = new ArrayList<Persona>();
		ArrayList<Persona> persona_ordenadas = new ArrayList<Persona>();
		Persona p = new Persona(null,0,0);
		persona = p.rellenarArrayList();
		System.out.println("========================");
		System.out.println("Lista de Personas sin ordenar ");
		System.out.println("========================");
		p.mostrarDatos(persona);
		System.out.println("========================");

		Persona p1 = new Persona(persona.get(0).getNom(),persona.get(0).getEdad(),persona.get(0).getAlçada());
		for (int i = 0; i < persona.size(); i++) {
			if (p1.compareTo(persona.get(i))==1 ) { 
				System.out.println("La persona p1: es mayor. " +p1.toString()); 
			}else if (p1.compareTo(persona.get(i))==0 ) {
				System.out.println("La persona p1: es menor. "+p1.toString()); 
			}else { 
				System.out.println ("La persona p1 es igual a la persona p2: " +p1.toString()); 
			}
		} 

		System.out.println("Lista de Personas ordenas por Altura");
		System.out.println("=========================");
		p.mostrarDatos(persona_ordenadas);
		System.out.println("========================");
		System.out.println();
		System.out.println("Programa Finalizado ");
	}
}
