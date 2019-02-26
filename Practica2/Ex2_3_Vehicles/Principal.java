package Ex2_3_Vehicles;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
	public static void main(String[] args) {
		boolean salir =false;
		String confirmacion="",tipo_vehiculo="";
		int i=0;
		ArrayList<Vehicle> vehiculos = new ArrayList<Vehicle>();
		while (i<2) {
			System.out.println("Que Vehiculo quieres crear? ");
			tipo_vehiculo=recogerCadenas();
			vehiculos.add(crearVehiculos(tipo_vehiculo));
			i++;
		}
		System.out.println("Vehiculos Creados");
		System.out.println("======================");
		mostrarArrayList(vehiculos);
	}
	public static String recogerCadenas() {
		Scanner scan  =new Scanner(System.in);
		String palabra = scan.nextLine();
		return palabra;
	}
	public static int recogerEnteros() {
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		return numero;
	}
	public static double recogerDoubles() {
		Scanner scan = new Scanner(System.in);
		double numero = scan.nextInt();
		return numero;
	}
	public static Vehicle crearVehiculos(String tipo) {
		Vehicle m = new Vehicle(0,0, null, null);
		int num_ocu = 0,num_r=0;
		String data_matr="",mitja_despl="";
		
		switch (tipo) {
		case "Moto":
			double cl=0;
			//Pedimos los Datos 
			System.out.print("Numero Ocupantes: ");
			num_ocu = recogerEnteros();
			System.out.print("Numero Ruedas: ");
			num_r = recogerEnteros();
			//Pedimos la fecha de Matriculacion 
			System.out.print("Fecha Matriculacion: ");
			data_matr =recogerCadenas();
			System.out.print("Medio de Desplazamiento: ");
			mitja_despl = recogerCadenas();
			System.out.print("Cilindrada: ");
			cl = recogerDoubles();
			//Creamos el Objeto de la Clase Moto 
			m= new Moto(num_ocu, num_r, data_matr, mitja_despl,cl);
			System.out.println("=======================");
			System.out.println("Vehiculo  Creado ");
			break;
		case "Coche":
			int puertas =0;
			boolean num_puertas =false;
			//Pedimos los Datos 
			System.out.print("Ocupantes: ");
			num_ocu = recogerEnteros();
			System.out.print("Ruedas: ");
			num_r = recogerEnteros();
			//Pedimos la fecha de Matriculacion 
			System.out.print("Fecha Matriculacion:");
			data_matr =recogerCadenas();
			System.out.print("Medio de Desplazamiento: ");
			mitja_despl = recogerCadenas();
			System.out.print("Numero de Puertas: ");
			puertas = recogerEnteros();
			if (puertas ==3 || puertas == 5) {
				num_puertas=true;
			}else {
				num_puertas=false;
			}
			m=new Cotxer(num_ocu, num_r, data_matr, mitja_despl, num_puertas);
			System.out.println("=======================");
			System.out.println("Vehiculo  Creado ");
			break;
		case "Camio":
			int altura  =0 ;
			//Pedimos los Datos 
			System.out.print("Ocupantes: ");
			num_ocu = recogerEnteros();
			System.out.print("Ruedas: ");
			num_r = recogerEnteros();
			//Pedimos la fecha de Matriculacion 
			System.out.print("Fecha Matriculacion:");
			data_matr =recogerCadenas();
			System.out.print("Medio de Desplazamiento: ");
			mitja_despl = recogerCadenas();
			System.out.print("Altura: ");
			altura = recogerEnteros();
			m=new Camio(num_ocu, num_r, data_matr, mitja_despl, altura);
			System.out.println("=======================");
			System.out.println("Vehiculo  Creado ");
			break;
		case "Bici":
			String tipo_bici="";
			//Pedimos los Datos 
			System.out.print("Ocupantes: ");
			num_ocu = recogerEnteros();
			System.out.print("Ruedas: ");
			num_r = recogerEnteros();
			//Pedimos la fecha de Matriculacion 
			System.out.print("Fecha Matriculacion:");
			data_matr =recogerCadenas();
			System.out.print("Medio de Desplazamiento: ");
			mitja_despl = recogerCadenas();
			System.out.print("Tipo de Bici: ");
			tipo_bici = recogerCadenas();
			m=new Bici(num_ocu, num_r, data_matr, mitja_despl, tipo_bici);
			System.out.println("=======================");
			System.out.println("Vehiculo  Creado ");
			break;
		case "Lancha":
			String casco  ="";
			//Pedimos los Datos 
			System.out.print("Ocupantes: ");
			num_ocu = recogerEnteros();
			System.out.print("Ruedas: ");
			num_r = recogerEnteros();
			//Pedimos la fecha de Matriculacion 
			System.out.print("Fecha Matriculacion:");
			data_matr =recogerCadenas();
			System.out.print("Medio de Desplazamiento: ");
			mitja_despl = recogerCadenas();
			System.out.println("Tipo de Casco ");
			casco = recogerCadenas();
			
			m=new Llanxa(num_ocu, num_r, data_matr, mitja_despl, casco);
			System.out.println("=======================");
			System.out.println("Vehiculo  Creado ");
			System.out.println("=======================");
			break;
		}
		return m;
	}
	public static void mostrarArrayList(ArrayList<Vehicle> veh) {
		for (int i = 0; i < veh.size(); i++) {
			System.out.println(veh.get(i));
		}
	}
}
