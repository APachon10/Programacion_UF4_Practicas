package Figuras;

import java.util.ArrayList;
import java.util.Scanner;

public class FRmFigures {
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		FRmFigures programa = new FRmFigures();
	}
	public void menu() {
		System.out.println("Que Quieres Hacer?"
				+ "\n1 - Crear Figura "
				+ "\n2 -");
	}
	public Figura insertarFigura(ArrayList<Figura> fig,Figura e ) {
		if (fig.size() >10 ) {
			System.out.println("No se pueden añadir mas Elementos ");
		}else {
			String color;
			double base,altura,r,lado;
			boolean salir=false;
			do {
				System.out.println("Que Figura quieres crear? "
						+ "\n1 - Cercle"
						+ "\n2 - Triangle"
						+ "\n3 - Quadrat");
				String tipo="";
				switch (tipo) {
				case "Cercle":
					System.out.print("Color de la Figura: ");
					color= recogerCadenas();
					
					System.out.print("Radio:");
					r=recogerDecimales();
					
					e = new Cercle(color,0,r);
					fig.add(e);
					System.out.println("=====================");
					System.out.println("Circulo Añadido");
					System.out.println("=====================");
					break;
				case "Triangle":
					System.out.print("Color de la Figura: ");
					color= recogerCadenas();
					System.out.print("Base: ");
					base= recogerDecimales();
					System.out.print("Altura: ");
					altura=recogerDecimales();
					
					e= new Triangle(color,0,base,altura);
					fig.add(e);
					System.out.println("=====================");
					System.out.println("Triangulo Añadido");
					System.out.println("=====================");
					break;
				case "Quadrat":
					System.out.print("Color de la Figura: ");
					color= recogerCadenas();
					System.out.println("Lado:");
					lado = recogerDecimales();
					
					e= new Quadrat(color,0,lado);
					e.calcularArea();
					fig.add(e);
					
					System.out.println("=====================");
					System.out.println("Cuadrado Añadido");
					System.out.println("=====================");
					break;
				}
			} while (!salir);
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
	public void contarFiguras(ArrayList<Figura> fig) {
		for (int i = 0; i < fig.size(); i++) {
			if (fig.get(i) instanceof Cercle) {
				
			}else if(fig.get(i) instanceof Quadrat) {
				
			}else if (fig.get(i) instanceof Triangle) {
				
			}
		}
	}
	public double sumarAreaCirculos() {
		
	}
}
