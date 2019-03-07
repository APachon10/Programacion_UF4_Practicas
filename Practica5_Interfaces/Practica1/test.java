package Practica1;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		ArrayList<Edifici> edificios = new ArrayList<Edifici>();
		test test = new test();
		test.menu(edificios);	
	}
	public  void menu(ArrayList<Edifici> edificis) {
		int op=0;
		Edifici e = new Edifici(null, 0);
		do {
			System.out.println("Que Quieres hacer?"
					+ "\n1 - Añadir Edificio"
					+ "\n2 - Mostrar Datos"
					+ "\n3 - Salir");
			op=recogerEnteros();
			switch (op) {
			case 1:

				break;
			case 2:
				break;
			case 3:
				break;
			}
		} while (op!=0);
	}
	public Edifici insertarEdificio(Edifici e,ArrayList<Edifici> edificis) {
		int op= recogerEnteros();
		String nombre="";
		double superficie=0;
		int num_oficinas=0;
		do {
			System.out.println("Tipo de Instalacion"
					+ "\n0 - Polideportivo"
					+ "\n1 - Edifici d' Oficines");
			switch (op) {
			case 0:
				e= new Polideportivo();

				nombre = recogerCadenas();
				e.setNom(nombre);
				superficie = recogerDoubles();
				e.setSuperficie(superficie);

				edificis.add(e);
				break;
			case 1:
				e= new Edifici_oficines();

				nombre = recogerCadenas();
				e.setNom(nombre);
				superficie = recogerDoubles();
				e.setSuperficie(superficie);
				break;
			}
		} while (op!=2);
		return e;
	}
	//Metodo para recogerDatos
	public static int recogerEnteros() {
		Scanner scan  = new Scanner(System.in);
		boolean salir=false;
		int numero=0;
		while (!salir) {
			System.out.println("Numero:");
			if (salir) {
				if (scan.hasNextInt()) {
					numero=scan.nextInt();
				}else {
					System.out.println("Error, vuelve a introducir el numero");
					scan.next();
				}
			}
		}
		return numero;
	}
	public static double recogerDoubles() {
		Scanner scan  = new Scanner(System.in);
		boolean salir=false;
		double numero=0;
		while (!salir) {
			System.out.println("Numero:");
			if (salir) {
				if (scan.hasNextDouble()) {
					numero=scan.nextDouble();
				}else {
					System.out.println("Error, vuelve a introducir el numero");
					scan.next();
				}
			}
		}
		return numero;
	}
	public static String recogerCadenas() {
		Scanner scan = new Scanner(System.in);
		String cadena = scan.nextLine();
		return cadena;
	}
}
