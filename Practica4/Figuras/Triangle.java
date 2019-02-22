package Figuras;

public class Triangle extends Figura{
	private double base,height;
	//Constructors
	public Triangle() {};
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	//Getters
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
	//Setters
	public void setBase(double base) {
		this.base = base;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Triangle --> "+super.toString()+", base=" + base + ", height=" + height;
	}
	@Override
	public double calcularArea() {
		double res=0;
		res=base*height/2;
		super.setArea(res);
		return res;
	}
	
	
}
