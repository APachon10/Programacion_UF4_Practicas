package Banc;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//Creamos un Objeto de la clase Banco
		Banc b = new Banc("APachon", "Alberto", 20, 25000000);
		//Creamos un OBjeto de la clase Cliente 
		Cliente c1 = new Cliente("APachon", "Alberto", 20, 2500000,"Pachon", "77749839H");
		Cliente c2 = new Cliente("ADomingo", "Andrea", 25, 1000000,"Domingo", "7849737S");
		
		//Cliente 1
		System.out.println("Datos Cliente 1 ");
		System.out.println("====================");
		System.out.print("Cliente 1: "+c1.toString());
		System.out.println("====================");
		System.out.println("Saldo Cliente 1 :"+c1.getSaldo());
		//Vamos a disminuir el saldo del Cliente 1 
		c1.disminuirSaldo(400000);
		System.out.println("====================");
		System.out.println("Saldo del Cliente 1 despues de sacar Dinero :"+c1.getSaldo());
		System.out.println("====================");
		//Vamos a aumentar el saldo del Cliente 1 
		c1.aumentarSaldo(5000);
		System.out.println("Saldo del Cliente 1 despues de ingresar Dinero en la cuenta :"+c1.getSaldo());
		
		//Cliente 2 
		System.out.println("====================");
		System.out.println("Datos Cliente 2");
		System.out.println("====================");
		System.out.print("Cliente 2: "+c2.toString());
		System.out.println("Saldo Cliente 2 :"+c2.getSaldo());
		System.out.println("====================");
		//Vamos a disminuir el saldo del Cliente 2 
		c2.disminuirSaldo(150000);
		System.out.println("Saldo del Cliente 2 despues de sacar Dinero :"+c2.getSaldo());
		System.out.println("====================");
		//Vamos a aumentar el saldo del Cliente 2
		c2.aumentarSaldo(5000);
		System.out.println("Saldo del Cliente 2 despues de ingresar Dinero en la cuenta :"+c2.getSaldo());
		System.out.println("====================");
		
		
	}
}
