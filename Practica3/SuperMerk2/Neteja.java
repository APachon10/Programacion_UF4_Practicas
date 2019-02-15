package SuperMerk2;

public class Neteja extends Tipus_Empleat{
	//Contructors
	public Neteja(String nom, String ciudatO, String lloc) {
		super(nom, ciudatO, lloc);
	}
	//Metodos de la Clase Madre
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
		int dias = 3;
		double sal = 0;
		for (int i = 0; i < dias; i++) {
			sal = sal + 35;
		}
		return sal;
	}

	//To String 
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
