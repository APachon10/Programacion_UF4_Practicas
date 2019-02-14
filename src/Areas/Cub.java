package Areas;

public class Cub{
	private double costat;
	//Constructor
	public Cub(double costat) {
		super();
		this.costat = costat;
	}
	//Getters
	public double getCostat() {
		return costat;
	}
	//Setters
	public void setCostat(double costat) {
		this.costat = costat;
	}
	//To String 
	public String toString() {
		return "Cub [costat=" + costat + "]";
	}
	//Metodos 
	public double calcularAreaCubo() {
		double res = 0;
		res= 6*Math.pow(this.costat,2);
		return res;
	}
	public double calcularVolumenCubo() {
		double res = 0;
		res= Math.pow(this.costat, 3);
		return res;
	}
}
