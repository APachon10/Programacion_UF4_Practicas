package vectors_clasesAbstractes;

import java.util.Scanner;

public class Nomina{
	Tipus_Empleat empleados [] = new Tipus_Empleat[5];
	//Constructors
	public Nomina(Tipus_Empleat[] empleados) {
		super();
		this.empleados = empleados;
	}
	//Metodos
	public Tipus_Empleat insereixEmpleat(Tipus_Empleat e ) {
		boolean salir=false;
		do {
			for (int i = 0; i < empleados.length; i++) {
				if (i>empleados.length) {
					salir=true;
				}else {
					if (empleados[i] == null) {
						empleados[i]=e;
						salir=true;
					}
				}
			}
		}while (!salir);
		return e;
	}
	public void eliminaNeteja() {
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i] instanceof Neteja) {
				System.out.println("Hola");
			}
		}
	}
	public void quantsCornella() {
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i].getCiutatO().equalsIgnoreCase("Cornella")) {
				System.out.println("Hola");
			}
		}
	}
	public double costNomina() {
		double sal = 0;
		for (int i = 0; i < empleados.length; i++) {
			sal = sal + empleados[i].SalariDiari();
		}
		return sal;
	}
	public void quantitatCaixeres() {
		int cont=0;
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i] instanceof Caixer) {
				cont++;
			}
		}
		System.out.println("El Numero de Cajeras es: "+cont);
	}
	//Metodos para recogerDatps
	public static int recogerEnteros() {
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		return numero;
	}
}
