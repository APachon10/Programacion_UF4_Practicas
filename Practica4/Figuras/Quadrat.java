package Figuras;

public class Quadrat extends Figura{
	private double lado;
	//Constructors 
	public Quadrat() {

	}
	public Quadrat(String color,double area,double lado) {
		super(color,area);
		this.lado = lado;
	}
	//Getters
	public double getLado() {
		return lado;
	}
	//Setters
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public String toString() {
		return "Quadrat --> "+super.toString()+", lado=" + lado;
	}
	
	@Override
	public double calcularArea() {
		double res=0;
		res=lado*lado;
		super.setArea(res);
		return res;
	}
}
