package Personas;

import java.util.ArrayList;
import java.util.Scanner;

public class FrmPersona {
	public static void main(String[] args) {
		FrmPersona programa = new FrmPersona();
		ArrayList<Persona> personas = new ArrayList<Persona>();
		programa.menu(personas);
	}
	public void menu(ArrayList<Persona> people) {
		int op=0;
		do {
			System.out.println("Que Opcion quieres ejecutar?"
					+ "\n1 - Introducir Datos Nuevos "
					+ "\n2 - Mostrar Datos"
					+ "\n3 - Eliminar Elemento "
					+ "\n4 - Sortir");
			System.out.println("===================");
			System.out.println("Opcion: ");
			op=recogerEnteros();
			switch (op) {
			case 1:
				people.add(insertarPersona());
				break;
			case 2:
				mostrarDatos(people);
				break;
			case 3:
				eliminarPersona(people);
				break;
			case 4:
				System.out.println("Saliendo del Programa ");
				break;
			}
		} while (op!=5);
	}
	//Metodos para recoger Datos
	public static char recogerCaracteres() {
		Scanner scan = new Scanner(System.in);
		char caracter=scan.next().charAt(0);
		return caracter;
	}
	public static double recogerDecimales() {
		Scanner scan = new Scanner(System.in);
		double decimal=scan.nextDouble();
		return decimal;
	}
	public static String recogerCadenas() {
		Scanner scan = new Scanner(System.in);
		String cadena=scan.nextLine();
		return cadena;
	}
	public static int recogerEnteros() {
		Scanner scan = new Scanner(System.in);
		int numero=scan.nextInt();
		return numero;

	}
	//Metodos para gestionar el ArrayList
	public Persona insertarPersona() {
		System.out.println("======================");
		System.out.print("Nombre: ");
		String nom = recogerCadenas();
		System.out.print("DNI: ");
		String DNI= recogerCadenas();
		System.out.print("Edad:");
		int edad=recogerEnteros();
		System.out.print("Altura:");
		double altura = recogerDecimales();
		System.out.print("Sexo:");
		char sexe=recogerCaracteres();
		System.out.println("Esta Casado?");
		String confirmacion=recogerCadenas();
		boolean casado=false;
		if (confirmacion.equalsIgnoreCase("Si")) {
			casado=true;
		}else if (confirmacion.equalsIgnoreCase("No")) {
			casado =false;
		}
		//Creamos el Objeto 
		Persona p= new Persona(nom,DNI,edad, altura, sexe, casado);
		System.out.println("======================");
		System.out.println("Elemento Añadido");
		System.out.println("======================");
		return p;
	}
	public void eliminarPersona(ArrayList<Persona> people) {
		System.out.println("======================");
		System.out.print("Introduce el Dni de la persona que quieres eliminar: ");
		String DNI = recogerCadenas();
		boolean salir=false;
		int i=0;
		do {
			if (people.get(i).getDNI().equals(DNI)) {
				salir=false;
			}
			if (people.get(i).getDNI().equals(DNI)) {
				people.remove(i);
				salir=true;
			}
			i++;
		} while (!salir);
		System.out.println("======================");
		System.out.println("Elemento Eliminado");
		System.out.println("======================");

	}
	public void mostrarDatos(ArrayList<Persona> people) {
		System.out.println("======================");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		System.out.println("======================");
	}
}
