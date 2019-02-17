package Areas;

public class Principal {
	public static void main(String[] args) {
		//Ahora calcularemos el area y volumen de las figuras tridimensionales
		System.out.println("Figuras Tridimensionales");
		System.out.println("=========================");
		
		//Creamos un Objeto de la clase Cubo y calculamos su area y su perimetro 
		Cub b1 = new Cub(6);
		System.out.println("Cubo");
		System.out.println("============");
		System.out.println("Area del Cubo: "+ b1.calcularAreaCubo());
		System.out.println("Volumen del Cubo: "+b1.calcularVolumenCubo());
		System.out.println("============");
		
		//Creamos un Objeto de la clase Cilindro y calculamos su Area
		Cilindre cl = new Cilindre(5,5);
		System.out.println("Cilindro");
		System.out.println("============");
		System.out.println("Area del Cilindro: "+ cl.calcularAreaCilindro());
		System.out.println("Volumen del Circulo: "+cl.calcularVolumenCilindro());
		System.out.println("============");
		
		// Ahora calcularemos el area y perimetro de las figuras bidimensionales
		Rectangle r = new Rectangle(10, 5);
		System.out.println("Figuras Bidimensionales");
		System.out.println("============");
		System.out.println("Rectangle");
		System.out.println("============");
		System.out.println("Area del Rectangle: "+ r.calcularAreaRectangle());
		System.out.println("Perimetro del Rectangle: "+r.calcularPerimetroRectangle());
		System.out.println("============");
		
		//Ahora calculamos el area y el perimetro del Circulo
		Cercle cr  = new Cercle(5);
		System.out.println("Cercle");
		System.out.println("============");
		System.out.println("Area del Cercle: "+ cr.calcularAreaCercle());
		System.out.println("Perimetro del Cercle: "+cr.calcularPerimetroCercle());
		System.out.println("============");
		System.out.println("Programa Finalizado ");
	}
}
