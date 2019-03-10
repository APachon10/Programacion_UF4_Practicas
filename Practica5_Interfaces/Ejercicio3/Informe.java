package Ejercicio3;

import java.util.Scanner;

public class Informe {
	public static void main(String[] args) {
		Alumne alumne = new Alumne(null,0);
		Profesor p=new  Profesor(null,0);
		Pas ps = new Pas(null,0);
		
		System.out.println("==================");
		//Pedimos los Datos del Alumno
		System.out.print("Nombre Alumno: ");
		String nom_alumne = recogerCadenas();
		System.out.print("Dias Faltados: ");
		int faltas_alumne = recogerEnteros();
		
		System.out.println("==================");
		//Pedimos los Datos del Profesor
		System.out.print("Nombre Profesor: ");
		String nom_profe = recogerCadenas();
		System.out.print("Dias Faltados: ");
		int faltas_profe = recogerEnteros();
		
		System.out.println("==================");
		//Pedimos los Datos del Pas
		System.out.print("Nombre PAS: ");
		String nom_pas = recogerCadenas();
		System.out.print("Dias Faltados: ");
		int faltas_pas = recogerEnteros();
		System.out.println("==================");
		
		//Metemos los datos dentro de los objetos 
		alumne = new Alumne(nom_alumne, faltas_alumne);
		p = new Profesor(nom_profe, faltas_profe);
		ps = new Pas(nom_pas, faltas_pas);
		
		//llamamos al metodo 
		alumne.absencies(faltas_alumne);
		System.out.println("==================");
		p.absencies(faltas_profe);
		System.out.println("==================");
		ps.absencies(faltas_pas);
		System.out.println("==================");
		
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
