package superMerk2;

public class Caixer extends Tipus_Empleat{
	private int horesTreballades;
	//Contructors
	public Caixer(String nom, String ciudatO, String lloc, int horesTreballades) {
		super(nom, ciudatO, lloc);
		this.horesTreballades = horesTreballades;
	}
	//Setters
	public void setHoresTreballades(int horesTreballades) {
		this.horesTreballades = horesTreballades;
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

	//Metodo toString 
	@Override
	public String toString() {
		return "Caixer--> "+super.toString()+"[horesTreballades=" + horesTreballades + "]";
	}

	//Metodos Propios de la Clase
	public int getHoresTreballades() {
		return horesTreballades;
	}
	@Override
	public double SalariDiari() {
		int horas = getHoresTreballades();
		double sal = 0.0;
		sal = horas*15;
		return sal;
	}



}
