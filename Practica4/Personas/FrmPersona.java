package Personas;

import java.util.ArrayList;
import java.util.Scanner;

public class FrmPersona {
	public static void main(String[] args) {
		FrmPersona programa = new FrmPersona();
		ArrayList<Persona> people
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
				break;
			case 3:
				break;
			case 4:
				mostrarDatos(people);
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
		System.out.println("Nombre: ");
		String nom = reco;
		
		//Creamos el Objeto 
		Persona p= new Persona();
		return p;
	}
	public void mostrarDatos(ArrayList<Persona> people) {
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
	}
}
