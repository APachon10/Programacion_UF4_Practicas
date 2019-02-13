package immboliaria;

public class Pisos extends immoble{
	private int num_pis;
	//Constructors
	public Pisos(String adress, int num_adress,double num_quadrats, int num_pis) {
		super(adress, num_adress,num_quadrats);
		this.num_pis = num_pis;
	}
	//Getter
	public int getNum_pis() {
		return num_pis;
	}
	//Setter
	public void setNum_pis(int num_pis) {
		this.num_pis = num_pis;
	}
	//To String
	@Override
	public String toString() {
		return "Pisos ["+super.toString()+this.num_pis+"]";
	}
	//Metodos
	public int calcularPrecio(int edad) {
		int preciobase  =2800;
		int precioFinal = 0;
		
		if (edad <15) {
			precioFinal = preciobase - (preciobase*(int)0.1);
			System.out.println("Precio siendo menor de 15 y sin ser tercero " + precioFinal);
			if (this.num_pis > 3) {
				precioFinal = precioFinal + preciobase*(int)0.3;
				System.out.println("Precio siendo un tercero "+ precioFinal);
			}
		}else {
			precioFinal = preciobase - (preciobase*(int)0.2);
			System.out.println("Precio siendo mayor de 15 y sin ser tercero " + precioFinal);
			if (this.num_pis > 3) {
				precioFinal = precioFinal + preciobase*(int)0.3;
				System.out.println("Precio siendo un tercero "+ precioFinal);
			}
		}
		return precioFinal;
	}
	
	
}
