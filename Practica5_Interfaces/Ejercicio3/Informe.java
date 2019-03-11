package Ejercicio3;

import java.util.Scanner;

public class Informe {
	public static void main(String[] args) {
		Alumne alumne = new Alumne("Alberto", 10);
		Profesor p = new Profesor("Enric", 90);
		Pas ps = new Pas("Jorge", 45);
		
		System.out.println("Objetos");
		System.out.println("======================");
		System.out.println("Datos Alumno --> "+ alumne.toString());
		System.out.println("======================");
		System.out.println("Datos Profesor -->  "+ p.toString());
		System.out.println("======================");
		System.out.println("Datos Pas --> "+ps.toString());
		System.out.println("======================");
		
		System.out.println();
		System.out.println("Absencies");
		System.out.println("======================");	
		//llamamos al metodo 
		System.out.println(alumne.absencies(alumne.getHoras_faltadas()));
		System.out.println("==================");
		System.out.println(p.absencies(p.getHoras_faltadas()));
		System.out.println("==================");
		System.out.println(ps.absencies(ps.getHoras_faltadas()));
		System.out.println("==================");
		
		System.out.println();
		
		System.out.println("Ahora pediremos los datos y llamaremos al metodo de control Absencies con todos los objetos ");
		//Ahora llamaremos al metodo controlAbsencies 
		System.out.println("==================");
		//Pedimos los Datos del Alumno
		System.out.print("Nombre Alumno: ");
		String nom_alumne = recogerCadenas();
		System.out.print("Numero de Faltas: ");
		int faltas_alumne = recogerEnteros();
		
		System.out.println("==================");
		//Pedimos los Datos del Profesor
		System.out.print("Nombre Profesor: ");
		String nom_profe = recogerCadenas();
		System.out.print("Numero de Faltas: ");
		int faltas_profe = recogerEnteros();
		
		System.out.println("==================");
		//Pedimos los Datos del Pas
		System.out.print("Nombre PAS: ");
		String nom_pas = recogerCadenas();
		System.out.print("Numero de Faltas : ");
		int faltas_pas = recogerEnteros();
		System.out.println("==================");;
		
		Usuari u_alumne = new Alumne(nom_alumne, faltas_alumne);
		System.out.println(u_alumne.absencies(faltas_alumne));
		System.out.println("======================");
		Usuari u_profe = new Profesor(nom_profe, faltas_profe);
		System.out.println(u_profe.absencies(faltas_profe));
		System.out.println("======================");
		Usuari u_pas = new Pas(nom_pas, faltas_pas);
		System.out.println(u_pas.absencies(faltas_pas));
		System.out.println("======================");
		
		System.out.println("Programa Finalizado");
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
