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
		int preciobase  =100000;
		int precioFinal = 0;
		
		if (edad <15) {
			precioFinal = preciobase - (int)((double)preciobase*0.1 );
			System.out.println("Edad del Piso "+edad + " = "+precioFinal);
			if (this.num_pis > 3) {
				
				precioFinal = precioFinal + (int)((double)preciobase*0.3);
				System.out.println("Num Pis "+this.num_pis + " = "+precioFinal);
			}
		}else {
			precioFinal = preciobase - (int)((double)preciobase*0.2);
			System.out.println("Edad del Piso "+edad + " = "+precioFinal);
			if (this.num_pis > 3) {
				precioFinal = precioFinal + (int)((double)preciobase*0.3);
				System.out.println("Num Pis "+this.num_pis + " = "+precioFinal);
			}
		}
		System.out.println("================================");
		System.out.println("El precio del Piso es: "+precioFinal);
		return precioFinal;
	}
	
	
}
