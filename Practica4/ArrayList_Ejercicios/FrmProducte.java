package ArrayList_Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class FrmProducte {
	public static void main(String[] args) {
		ArrayList<Producte> productos = new ArrayList<Producte>();
		FrmProducte programa = new FrmProducte();
		programa.menu(productos);
	}
	public void menu(ArrayList<Producte> productos) {
		int op=0;
		ArrayProducte ap = new ArrayProducte(productos);
		Producte e=null;
		do {
			System.out.println("Que Operacion quieres realizar?"
					+ "\n1 - Insertar Producto"
					+ "\n2 - Aumentar Precio Productos tipo Oficina"
					+ "\n3 - Eliminar Productos que tengan estoc cero"
					+ "\n4 - Mostrar Productos que hay en el ArrayList"
					+ "\n5 - Salir");
			System.out.print("Opcion:");
			op=recogerEnteros();
			switch (op) {
			case 1:
				ap.insertarProducto(e);
				break;
			case 2 :
				break;
			case 4:
				ap.mostrarArrayList(productos);
				break;
			}
		} while (op!=5);
	}
	//Metodos para recoer Datos
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
	public static double recogerDecimales(){
		Scanner scan = new Scanner(System.in);
		double numero= scan.nextDouble();
		return numero;
	}
}
