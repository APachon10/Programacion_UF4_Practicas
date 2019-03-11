package Ejercicio1;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		ArrayList<Persona> persona = new ArrayList<Persona>();
		Persona p = new Persona(null,null,0);
		
		
		System.out.println("Lista de Personas sin ordenar ");
		System.out.println("========================");
		p.mostrarDatos(persona);
		System.out.println("========================");
		for (int i = 0; i < persona.size(); i++) {
			
		}
	}
}
