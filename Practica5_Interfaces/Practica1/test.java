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
		System.out.println("=====================");
		do {
			System.out.println("Que Quieres hacer?"
					+ "\n1 - Añadir Edificio"
					+ "\n2 - Mostrar Datos"
					+ "\n3 - Salir");
			System.out.println("=====================");
			System.out.print("Opcion:");
			op=recogerEnteros();
			switch (op) {
			case 1:
				insertarEdificio(e, edificis);
				break;
			case 2:
				mostrarDatos(edificis);
				break;
			case 3:
				System.out.println("Saliendo... ");
				break;
			}
		} while (op!=3);
		System.out.println("=====================");
		System.out.println("Programa Terminado");
	}
	public Edifici insertarEdificio(Edifici e,ArrayList<Edifici> edificis) {
		int op= 0;
		String nombre="";
		double superficie=0;
		int num_oficinas=0;
		System.out.println("============================");
		System.out.println("Tipo de Instalacion"
				+ "\n0 - Polideportivo"
				+ "\n1 - Edifici d' Oficines");
		System.out.println("============================");
		System.out.print("Opcion:");
		op=recogerEnteros();
		switch (op) {
		case 0:
			System.out.println("============================");
			System.out.print("Nombre Polideportivo: ");
			nombre = recogerCadenas();
			System.out.print("Superficie Polideportivo: ");
			superficie = recogerDoubles();
			e= new Polideportivo(nombre,superficie);
			edificis.add(e);
			System.out.println("============================");
			System.out.println("Polideportivo Añadido");
			System.out.println("============================");
			break;
		case 1:
			System.out.println("============================");
			System.out.print("Nombre Edifici d' Oficines: ");
			nombre = recogerCadenas();
			System.out.print("Nombre Edifici d' Oficines: ");
			superficie = recogerDoubles();
			System.out.print("Numero Oficinas:");
			num_oficinas = recogerEnteros();

			e= new Edifici_oficines(nombre, superficie, num_oficinas);

			edificis.add(e);

			System.out.println("============================");
			System.out.println("Edifici d' Oficines  Añadido");
			System.out.println("============================");
			break;
		}
		return e;
	}
	//Metodo para mostrar los datos del ArrayList
	public void mostrarDatos(ArrayList<Edifici> edificis) {
		System.out.println("=====================");
		for (int i = 0; i < edificis.size(); i++) {
			System.out.println(edificis.get(i));
		}
		System.out.println("=====================");
	}
	//Metodo para recogerDatos
	public static int recogerEnteros() {
		Scanner scan  = new Scanner(System.in);
		boolean salir=false;
		int numero=0;
		while (!salir) {
			if (scan.hasNextInt()) {
				if (scan.hasNextInt()) {
					numero=scan.nextInt();
					salir=true;
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
			if (scan.hasNextDouble()) {
				if (scan.hasNextDouble()) {
					numero=scan.nextDouble();
					salir=true;
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
