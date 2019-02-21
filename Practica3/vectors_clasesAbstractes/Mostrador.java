package vectors_clasesAbstractes;

public class Mostrador extends Tipus_Empleat{
	private int vendes;
	//Contructors
	public Mostrador(String nom, String ciudatO, String lloc, int vendes) {
		super(nom, ciudatO, lloc);
		this.vendes = vendes;
	}
	//Metodos Propios de la Clase 
	public int getVendes() {
		return vendes;
	}
	public void setVendes(int vendes) {
		this.vendes = vendes;
	}
	//Metodos Heredados de la clase Madre
	@Override
	public String lloc() {
		return super.getlloc();
	}
	@Override
	public String ciutatOritge() {
		return super.getCiutatO();
	}
	@Override
	public double SalariDiari() {
		double sal =0;
		double sal_base = 50;
		sal = sal_base + getVendes()*0.15;
		return sal;
	}
	@Override
	public String toString() {
		return "Mostrador-->" +super.toString()+"[vendes=" + vendes + "]";
	}
	
	
	
	


	
	
}
