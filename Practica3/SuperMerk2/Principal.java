package SuperMerk2;

public class Principal {
	public static void main(String[] args) {
		//Creamos un Objeto de la Clase Cajero 
		Caixer c = new Caixer("Alberto","Barcelona","Palleja",5);
		System.out.println("Cajero");
		System.out.println("========================");
		System.out.println("Lloc --> "+c.lloc());
		System.out.println("Ciutat Origen --> "+c.ciutatOritge());
		System.out.println("Horas Trabajadas -->"+c.getHoresTreballades());
		System.out.println("Salari Diari --> " +c.SalariDiari());
		System.out.println("========================");
		
		//Creamos un objeto de la clase Neteja
		Neteja n = new Neteja("Andrea","Madrid", "Sabadell");
		System.out.println("Personal de Neteja");
		System.out.println("========================");
		System.out.println("Lloc --> "+n.lloc());
		System.out.println("Ciutat Origen --> "+n.ciutatOritge());
		System.out.println("Salari Diari --> " +n.SalariDiari());
		System.out.println("========================");
		
		//Creamos un Objeto de la clase Mostrador
		Mostrador m= new Mostrador("Alberto","Madrid", "Barcelona",50);
		System.out.println("Mostrar");
		System.out.println("========================");
		System.out.println("Lloc --> "+m.lloc());
		System.out.println("Ciutat Origen --> "+m.ciutatOritge());
		System.out.println("Numero de Ventas: "+m.getVendes());
		System.out.println("Salari Diari --> " +m.SalariDiari());
		System.out.println("========================");
	}
}
