package CentreCultural;


public class Principal {
	public static void main(String[] args) {
		//Creamos 2 Objetos de la clase Libro 
		Llibres l1 = new Llibres(1,"Nanatsu No taizai Chapter 300: The Demon King, Meliodas:" , "Nakaba Suzuki",22);
		Llibres l2 = new Llibres(2,"The Rising of the Shield Vol.TBD Chapter 51: Spirit Turtle" , "Kyu Aiya y Yusagi Aneko",36);
		//Creamos 2 Objetos de la clase Discos 
		Discs d1 = new Discs(3, "Zapatillas", "El canto del Loco", "Ariola Records"); 
		Discs d2 = new Discs(4, "Awake", "Skillet", "Atlantic Records"); 
		//Mostramos la informacion de los objetos 
		System.out.println("Libro 1: "+l1.toString());
		System.out.println("===============");
		System.out.println("Libro 2: "+l2.toString());
		System.out.println("===============");
		System.out.println("Disco 1: "+d1.toString());
		System.out.println("===============");
		System.out.println("Disco 2: "+d2.toString());
	}
}
