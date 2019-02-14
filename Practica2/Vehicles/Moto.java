package Vehicles;

public class Moto extends Vehicle{
	private double cilindrada;
	//Constructors
	
	public Moto(int num_ocupants, int num_rodes, String data_matriculacio, String mitja_despl, double cilindrada) {
		super(num_ocupants, num_rodes, data_matriculacio, mitja_despl);
		this.cilindrada = cilindrada;
	}
	//Getters
	public double getCilindrada() {
		return cilindrada;
	}
	//Setters
	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	@Override
	public String toString() {
		return super.toString()+"Moto [cilindrada=" + cilindrada + "]";
	}
}
