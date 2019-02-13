package immboliaria;

import java.util.Scanner;


public class Principal {
	
	public static void main(String[] args) {
		//Creamos 2 Pisos
		Pisos m1 = new Pisos("C/Falsa", 1, 45,2);
		Pisos m3 = new Pisos("C/Alexandria", 2, 90, 5);
		///Llamamos al metodo para calcular el precio del Piso m1
		m1.calcularPrecio(14);
		//Llamamos al metodo para calcular el precio del pIso m3
		m3.calcularPrecio(20);
		//Creamos 2 Locales 
		immoble m2 = new Locals("C/Pino", 2, 60,4);
		immoble m5 = new Locals("C/Alejandro", 5, 50, 1);
		//Llamaremos al metodo para calcular el precio del Local m2 
		
		//Llamaremos al metodo para calcular el precio del local m5
	}
	public String recogerCadenas() {
		Scanner scan  =new Scanner(System.in);
		String palabra = scan.nextLine();
		return palabra;
	}
}
