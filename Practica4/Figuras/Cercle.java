package Figuras;

public class Cercle extends Figura{
	private double radi;
	//Constructors
	public Cercle() {}

	public Cercle(String color, double area,double radi) {
		super(color, area);
		this.radi=radi;
	}
	//Getters
	public double getRadi() {
		return radi;
	}
	//Setters
	public void setRadi(double radi) {
		this.radi = radi;
	}
	@Override
	public String toString() {
		return "Cercle --> "+super.toString()+", radi=" + radi ;
	}
	@Override
	public double calcularArea() {
		double res=0;
		res = Math.PI*(radi*radi);
		super.setArea(res);
		return res;
		
	}
	
	
}
