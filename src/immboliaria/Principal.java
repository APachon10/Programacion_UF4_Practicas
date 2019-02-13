package immboliaria;

import java.util.Scanner;


public class Principal {
	
	public static void main(String[] args) {
		//Creamos 2 Pisos
		Pisos m1 = new Pisos("C/Falsa", 1, 45,2);
		Pisos m3 = new Pisos("C/Alexandria", 2, 90, 5);
		///Llamamos al metodo para calcular el precio del Piso m1
		System.out.println("Piso 1 ");
		System.out.println("================");
		m1.calcularPrecio(14);
		System.out.println("================");
		//Llamamos al metodo para calcular el precio del pIso m3
		System.out.println("Piso 2 ");
		System.out.println("================");
		m3.calcularPrecio(20);
		//Creamos 2 Locales 
		Locals m2 = new Locals("C/Pino", 2, 60,4);
		Locals m5 = new Locals("C/Alejandro", 5, 50, 1);
		System.out.println("================");
		//Llamaremos al metodo para calcular el precio del Local m2 
		System.out.println("Local 1");
		System.out.println("================");
		m2.calcularPrecio(14);
		System.out.println("================");
		//Llamaremos al metodo para calcular el precio del local m5
		System.out.println("Local 2 ");
		System.out.println("================");
		m2.calcularPrecio(40);
	}
	public String recogerCadenas() {
		Scanner scan  =new Scanner(System.in);
		String palabra = scan.nextLine();
		return palabra;
	}
}
