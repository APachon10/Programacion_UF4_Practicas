package vectors_clasesAbstractes;

import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
	public static void main(String[] args) {
		ArrayList <Tipus_Empleat>empleados= new ArrayList<Tipus_Empleat>();
		Nomina m = new Nomina(empleados);
		int op=0;
	
		do {
			System.out.println("Que Operacion quieres realizar?"
					+ "\n1 - Añadir Empleado"
					+ "\n2 - Eliminar Empleado de Limpieza de Nomina "
					+ "\n3 - Ver Cuantas personas son de Cornella "
					+ "\n4 - Ver cost total de la Nomina "
					+ "\n5 - Ver cantidad de Cajeros en Nomina"
					+ "\n6 - Sueldo Promedio"
					+ "\n7 - Mostrar Array");
			System.out.print("Opcion: ");
			op=m.recogerEnteros();
			switch (op) {
			case 1:
				Tipus_Empleat e = null;
				m.insereixEmpleat(e);
				break;
			case 2:
				m.eliminaNeteja();
				break;
			case 3:
				m.quantsCornella();
				break;
			case 4:
				m.costNomina();
				break;
			case 5:
				m.quantitatCaixeres();
				break;
			case 7:
				m.mostrarDatos(empleados);
				break;
			}
		} while (op!=0);
	}
}
