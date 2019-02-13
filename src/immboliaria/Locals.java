package immboliaria;

public class Locals extends immoble{
	private int num_finestres;
	//Constructors
	public Locals(String adress, int num_adress,double num_quadrats, int num_finestres) {
		super(adress, num_adress,num_quadrats);
		this.num_finestres = num_finestres;
	}
	//Getter
	public int getNum_finestres() {
		return num_finestres;
	}
	//Setter
	public void setNum_finestres(int num_finestres) {
		this.num_finestres = num_finestres;
	}
	//To String 
	@Override
	public String toString() {
		return "Locals ["+super.toString()+"num_finestres=" + num_finestres + "]";
	}

	public int calcularPrecio(int edad) {
		int preciobase  =50000;
		int precioFinal = 0;

		if (edad <15) {
			precioFinal = preciobase - (int)((double)preciobase*0.1);
			System.out.println("Años del Local "+edad + " = "+precioFinal);
			if (super.getNum_quadrats() > 50) {
				precioFinal = precioFinal + (int)((double)preciobase*0.1);
				System.out.println("Metros Cuadrados del Local "+super.getNum_quadrats()+ " = "+precioFinal);
				if (this.num_finestres <=1 && this.num_finestres >=0) {
					precioFinal = precioFinal - (int)((double)preciobase*0.2);
				}else if(this.num_finestres >4) {
					precioFinal = precioFinal + (int)((double)preciobase*0.2);
				}
			}else if(super.getNum_quadrats() < 50){

				if (this.num_finestres <=1 && this.num_finestres >=0) {
					precioFinal = precioFinal - (int)((double)preciobase*0.2);
				}else if(this.num_finestres >4) {
					precioFinal = precioFinal + (int)((double)preciobase*0.2);
				}
			}
		}else {
			precioFinal = preciobase - (int)((double)preciobase*0.2);
			System.out.println("Años del Piso "+edad + " = "+precioFinal);
			if (super.getNum_quadrats() > 50) {

				precioFinal = precioFinal + (int)((double)preciobase*0.1);
				System.out.println("Metros Cuadrados del Local "+super.getNum_quadrats()+ " = "+precioFinal);
				if (this.num_finestres <=1 && this.num_finestres >=0) {
					System.out.println("Num Ventanas "+ this.num_finestres + " ="+precioFinal);
					precioFinal = precioFinal - (int)((double)preciobase*0.2);
				}else if(this.num_finestres >4) {
					System.out.println("Num Ventanas "+ this.num_finestres + " ="+precioFinal);
					precioFinal = precioFinal + (int)((double)preciobase*0.2);
				}

			}else if(super.getNum_quadrats() < 50){

				if (this.num_finestres <=1 && this.num_finestres >=0) {
					System.out.println("Num Ventanas "+ this.num_finestres + " ="+precioFinal);
					precioFinal = precioFinal - (int)((double)preciobase*0.2);
				}else if(this.num_finestres >4) {
					System.out.println("Num Ventanas "+ this.num_finestres + " ="+precioFinal);
					precioFinal = precioFinal + (int)((double)preciobase*0.2);
				}
			}
		}
		System.out.println("================================");
		System.out.println("El Precio del Local es: " + precioFinal);
		return precioFinal;
	}
}
