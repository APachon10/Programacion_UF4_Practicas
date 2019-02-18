package vectors_clasesAbstractes;

import java.util.Scanner;

public class Nomina{
	Tipus_Empleat empleados [] = new Tipus_Empleat[5];
	//Constructors
	
	//Metodos
	public Tipus_Empleat insereixEmpleat(Tipus_Empleat e ) {
		boolean salir=false;
		int op=0;
		do {
			
		} while (!salir);
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
}
 