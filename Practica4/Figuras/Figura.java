package Figuras;

public abstract class Figura {
	private String color;
	private double area;
	/*Constructors */
	public Figura() {

	}
	public Figura(String color, double area) {
		this.color = color;
		this.area = area;
	}
	//Getters
	public String getColor() {
		return color;
	}
	public double getArea() {
		return area;
	}
	//Setters
	public void setColor(String color) {
		this.color = color;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "color=" + color + ", area=" + area;
	}
	
	public abstract double calcularArea();
}
