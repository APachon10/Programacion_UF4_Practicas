package Areas;

public class Rectangle {
	private double ample,height;
	

	//Constructors
	public Rectangle(double ample, double height) {
		this.ample = ample;
		this.height = height;
	}
	//Getters
	public double getAmple() {
		return ample;
	}
	public double getheight() {
		return height;
	}
	//Setters
	public void setAmple(double ample) {
		this.ample = ample;
	}
	public void setheight(double height) {
		this.height = height;
	}
	//To String
	@Override
	public String toString() {
		return "Rectangle [ample=" + ample + ", height=" + height + "]";
	}
	//Metodos
	public double calcularAreaRectangle() {
		double res  =0;
		res = ample*height;
		return res;
	}
	public double calcularPerimetroRectangle() {
		double res  =0;
		res = 2*(ample+height);
		return res;
	}
}
