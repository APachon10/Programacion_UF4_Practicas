package ArrayList_Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayProducte extends Producte{
	ArrayList<Producte >productos = new ArrayList<Producte>(); 

	public ArrayProducte(ArrayList<Producte> productos) {
		this.productos = productos;
	}
	public ArrayProducte(int code, int stock, String name, String tipe, double price) {
		super(code, stock, name, tipe, price);
	}
	//Metodos
	public Producte insertarProducto(Producte e) {
		int codigo=0;
		boolean salir=false;
		System.out.println("===================");
		for (int i = 0; i < productos.size(); i++) {
			while (!salir) {
				System.out.print("Codigo: ");
				codigo = recogerEnteros();
				if (productos.get(i).getCode()==codigo) {
					System.out.println("Este codigo ya existe ");
					salir=false;
				}else {
					codigo = codigo;
					salir=true;
				}

			}
		}
		System.out.print("Nombre Producto : ");
		String nombre = recogerCadenas();
		System.out.print("Tipo de Producto : ");
		String tipo= recogerCadenas();
		System.out.print("Precio: ");
		int precio = recogerEnteros();
		System.out.print("Stock: ");
		int cantidad = recogerEnteros();
		//Metemos los datos dentro del Objeto
		e= new Producte(codigo, cantidad, nombre, tipo, cantidad);
		//Lo metemos dentro del Array 
		productos.add(e);
		System.out.println("===================");
		System.out.println("Producto Insertado");
		System.out.println("===================");
		return e;
	}
	public double aumentarPrecioOficina() {
		double aumento=0;
		System.out.println("============================");
		for (int i = 0; i < productos.size(); i++) {
			if (productos.get(i).getTipe().equalsIgnoreCase("Oficina")) {
				System.out.println("Precio antes del Aumento: "+ productos.get(i).getPrice());
				aumento = (double) productos.get(i).getPrice() + productos.get(i).getPrice()*10/100;
				productos.get(i).setPrice(aumento);
				System.out.println("Precio despues del Aumento: "+aumento);
			}else {
				System.out.println("No existe ningun Producto de tipo Oficina");
			}
		}
		System.out.println("=============================");
		return aumento;
	}
	public ArrayList eliminarProductosEstocCero(ArrayList<Producte >pro) {
		for (int i = 0; i < pro.size(); i++) {
			if (pro.get(i).getStock()==0) {
				pro.remove(pro.get(i));
			}
		}
		return pro;
	} 
	public void mostrarArrayList(ArrayList<Producte >pro) {
		System.out.println("===================");
		for (int i = 0; i < pro.size(); i++) {
			System.out.println(pro.get(i));
		}
		System.out.println("===================");
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
	public static double recogerDecimales() {
		Scanner scan = new Scanner(System.in);
		double numero = scan.nextDouble();
		return numero;
	}

}
