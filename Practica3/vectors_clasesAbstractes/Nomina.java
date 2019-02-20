package vectors_clasesAbstractes;

import java.util.Arrays;
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
		e= new Caixer(null, null, null, 0);
		boolean salir=false;
		int op=0;
		int horas=0;
		String nom,lloc,ciutatO;
		//-----------------------------------
		int vendas=0;
		int i=0;
		do {
			if (i>empleados.length) {
				salir=true;
			}else {
				if (empleados[i] == null) {
					System.out.println("Que tipo de Empleado quieres crear? "
							+ "\n1 - Caixer"
							+ "\n2 - Mostrador"
							+ "\n3 - Neteja ");
					op=recogerEnteros();
					switch (op) {
					case 1:
						System.out.print("Nombre Empleado:");
						nom=recogerCadenas();
						System.out.print("Ciudad Origen :");
						ciutatO=recogerCadenas();
						System.out.print("Lugar de Trabajo:");
						lloc=recogerCadenas();
						System.out.print("Horas Trabajadas :");
						horas=recogerEnteros();
						
						e= new Caixer(nom, ciutatO, lloc, horas);
						empleados[i]=e;
						System.out.println("====================");
						System.out.println("Cajero Registrado");
						System.out.println("====================");
						break;
					case 2:
						System.out.print("Nombre Empleado:");
						nom=recogerCadenas();
						System.out.print("Ciudad Origen :");
						ciutatO=recogerCadenas();
						System.out.print("Lugar de Trabajo:");
						lloc=recogerCadenas();
						System.out.print("Numero de Ventas:");
						vendas = recogerEnteros();
						//Ponemos los Datos dentro del Objeto 
						e = new Mostrador(nom, ciutatO, lloc, vendas);
						empleados[i]=e;
						System.out.println("===================");
						System.out.println("Mostrador Registrado");
						System.out.println("===================");
						break;
					case 3:
						System.out.print("Nombre Empleado:");
						nom=recogerCadenas();
						System.out.print("Ciudad Origen :");
						ciutatO=recogerCadenas();
						System.out.print("Lugar de Trabajo:");
						lloc=recogerCadenas();
						e = new Neteja(nom, ciutatO, lloc);
						empleados[i]=e;
						System.out.println("===================");
						System.out.println("Personal de Limpieza  Registrado");
						System.out.println("===================");
						break;
					}
					salir=true;
				}else {
					i++;
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
	public int  quantsCornella() {
		int cont=0;
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i].getCiutatO().equalsIgnoreCase("Cornella")) {
				System.out.println("Hola");
				cont++;
			}
		}
		System.out.println("Hay "+cont +" de Trabajadores que son de Cornella");
		return cont;
	}
	public double costNomina() {
		double sal = 0;
		for (int i = 0; i < empleados.length; i++) {
			sal = sal + empleados[i].SalariDiari();
		}
		return sal;
	}
	public int quantitatCaixeres() {
		int cont=0;
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i] instanceof Caixer) {
				cont++;
			}
		}
		System.out.println("El Numero de Cajeras es: "+cont);
		return cont;
	}
	
	//Metodo Para mostrar los datos del Array a cada momento 
	public void mostrarDatos(Tipus_Empleat [] emple ) {
		System.out.println(Arrays.toString(emple));
	}
	//Metodos para recoger Datos
	public static int recogerEnteros() {
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		return numero;
	}
	public static String recogerCadenas() {
		Scanner scan = new Scanner(System.in);
		String palabra = scan.nextLine();
		return palabra;
	}
}
