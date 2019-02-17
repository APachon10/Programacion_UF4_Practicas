package Areas;

public class Cercle {
	private double radi;
	//Constructors
	public Cercle(double radi) {
		this.radi = radi;
	}
	//Getters
	public double getRadi() {
		return radi;
	}
	//Setters 
	public void setRadi(double radi) {
		this.radi = radi;
	}
	//To String 
	@Override
	public String toString() {
		return "Cercle [radi=" + radi + "]";
	}
	//Metodos para Calcular area y perimetro 
	public double calcularAreaCercle() {
		double res =0;
		res =Math.PI * Math.pow(radi,2);
		return res;
	}
	public double calcularPerimetroCercle() {
		double res =0;
		res = 2*Math.PI*radi;
		return res;
	}

	
	
}
