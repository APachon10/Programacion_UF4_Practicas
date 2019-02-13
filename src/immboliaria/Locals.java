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
		int preciobase  =2800;
		int precioFinal = 0;

		if (edad <15) {
			precioFinal = preciobase - (preciobase*(int)0.1);
			System.out.println("Precio siendo menor de 15  " + precioFinal);

			if (super.getNum_quadrats() > 50) {

				precioFinal = precioFinal + preciobase*(int)0.1;

				if (this.num_finestres <=1 && this.num_finestres >=0) {
					precioFinal = precioFinal - preciobase*(int)0.2;
					System.out.println("Precio con mas de 50 metros cuadrados y ninguna ventana/1 ventana "+ precioFinal);
				}else if(this.num_finestres >4) {
					precioFinal = precioFinal + preciobase*(int)0.2;
					System.out.println("Precio con mas de 50 metros cuadrados y por lo menos 4 ventanas "+ precioFinal);
				}

			}else if(super.getNum_quadrats() < 50){

				if (this.num_finestres <=1 && this.num_finestres >=0) {
					precioFinal = precioFinal - preciobase*(int)0.2;
					System.out.println("Precio con mas de 50 metros cuadrados y ninguna ventana/1 ventana "+ precioFinal);
				}else if(this.num_finestres >4) {
					precioFinal = precioFinal + preciobase*(int)0.2;
					System.out.println("Precio con mas de 50 metros cuadrados y por lo menos 4 ventanas "+ precioFinal);
				}
			}
		}else {
			precioFinal = preciobase - (preciobase*(int)0.2);
			System.out.println("Precio siendo mayor de 15 " + precioFinal);
			if (super.getNum_quadrats() > 50) {

				precioFinal = precioFinal + preciobase*(int)0.1;

				if (this.num_finestres <=1 && this.num_finestres >=0) {
					precioFinal = precioFinal - preciobase*(int)0.2;
					System.out.println("Precio con mas de 50 metros cuadrados y ninguna ventana/1 ventana "+ precioFinal);
				}else if(this.num_finestres >4) {
					precioFinal = precioFinal + preciobase*(int)0.2;
					System.out.println("Precio con mas de 50 metros cuadrados y por lo menos 4 ventanas "+ precioFinal);
				}

			}else if(super.getNum_quadrats() < 50){

				if (this.num_finestres <=1 && this.num_finestres >=0) {
					precioFinal = precioFinal - preciobase*(int)0.2;
					System.out.println("Precio con mas de 50 metros cuadrados y ninguna ventana/1 ventana "+ precioFinal);
				}else if(this.num_finestres >4) {
					precioFinal = precioFinal + preciobase*(int)0.2;
					System.out.println("Precio con mas de 50 metros cuadrados y por lo menos 4 ventanas "+ precioFinal);
				}
			}
		}
		return precioFinal;
	}
}
