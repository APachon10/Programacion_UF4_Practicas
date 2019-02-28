package Figuras;

import java.util.ArrayList;
import java.util.Scanner;

public class FRmFigures {
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		FRmFigures programa = new FRmFigures();
		programa.menu(figuras);
	}
	public void menu(ArrayList<Figura> fig) {
		int op=0;
		Figura e = new Cercle(null,0,0);
		do {
			System.out.println("Que Quieres Hacer?"
					+ "\n0 - Salir "
					+ "\n1 - Crear Figura "
					+ "\n2 - Contar Figuras"
					+ "\n3 - Sumar Area de todos los Circulos"
					+ "\n4 - Mostrar Datos");
			System.out.print("Opcion: ");
			op=recogerEnteros();
			switch (op) {
			case 1:
				insertarFigura(fig, e);
				break;
			case 2:
				contarFiguras(fig);
				break;
			case 3:
				sumarAreaCirculos(fig);
				break;
			case 4:
				mostrarDatos(fig);
				break;
			case 0:
				System.out.println("Saliendo del Programa.... ");
				break;
			}
		} while (op!=3);
		System.out.println("Programa Terminado :)");
	}
	public Figura insertarFigura(ArrayList<Figura> fig,Figura e ) {
		System.out.println("=======================");
		if (fig.size() >10 ) {
			System.out.println("No se pueden añadir mas Elementos ");
		}else {
			String color;
			double base,altura,r,lado,area;
			int tipo=0;
			System.out.println("Que Figura quieres crear? "
					+ "\n1 - Cercle"
					+ "\n2 - Triangle"
					+ "\n3 - Quadrat");
			System.out.println("=======================");
			System.out.print("Opcion:");
			tipo= recogerEnteros();
			switch (tipo) {
			case 1:
				System.out.println("=======================");
				System.out.print("Color de la Figura: ");
				color= recogerCadenas();

				System.out.print("Radio:");
				r=recogerDecimales();

				e = new Cercle(color,0,r);
				area = e.calcularArea();
				e.setArea(area);

				fig.add(e);
				System.out.println("=====================");
				System.out.println("Circulo Añadido");
				System.out.println("=====================");
				break;
			case 2:
				System.out.println("=======================");
				System.out.print("Color de la Figura: ");
				color= recogerCadenas();
				System.out.print("Base: ");
				base= recogerDecimales();
				System.out.print("Altura: ");
				altura=recogerDecimales();

				e= new Triangle(color,0,base,altura);
				fig.add(e);
				area = e.calcularArea();
				e.setArea(area);
				
				System.out.println("=====================");
				System.out.println("Triangulo Añadido");
				System.out.println("=====================");
				break;
			case 3:
				System.out.println("=======================");
				System.out.print("Color de la Figura: ");
				color= recogerCadenas();
				System.out.println("Lado:");
				lado = recogerDecimales();

				e= new Quadrat(color,0,lado);
				area = e.calcularArea();
				e.setArea(area);
				fig.add(e);
				
				System.out.println("=====================");
				System.out.println("Cuadrado Añadido");
				System.out.println("=====================");
				break;
			}
		}
		return e;
	}
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
	//Metodos Propios de la clase
	public void contarFiguras(ArrayList<Figura> fig) {
		int cont_cercles=0,cont_triangle=0,cont_quadrat=0;
		System.out.println("=======================");
		for (int i = 0; i < fig.size(); i++) {
			if (fig.get(i) instanceof Cercle) {
				cont_cercles++;
			}else if(fig.get(i) instanceof Quadrat) {
				cont_quadrat++;
			}else if (fig.get(i) instanceof Triangle) {
				cont_triangle++;
			}
		}
		System.out.println("=======================");
		System.out.println("Hay un total de "+cont_cercles + " Circulos ,"+cont_quadrat+" Quadrados ," +cont_triangle+" Triangles ");
		System.out.println("=======================");
	}
	public double sumarAreaCirculos(ArrayList<Figura> fig) {
		System.out.println("=======================");
		double res=0;
		for (int i = 0; i < fig.size(); i++) {
			if (fig.get(i) instanceof Cercle) {
				res = res+fig.get(i).getArea();
			}
		}
		System.out.println("El area total de todos los circulos es: "+res);
		System.out.println("=======================");
		return res;
	}
	public void mostrarDatos(ArrayList<Figura> fig) {
		System.out.println("=======================");
		for (int i = 0; i < fig.size(); i++) {
			System.out.println(fig.get(i));
		}
		System.out.println("=======================");
	}
}
