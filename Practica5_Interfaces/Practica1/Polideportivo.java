package Practica1;

public class Polideportivo extends Edifici implements ITipoInstalacion,ISuperficie{
	public Polideportivo() {
		
	}
	public Polideportivo(String nom, double superficie) {
		super(nom, superficie);
	}
	@Override
	public double getSuperficie(double superficie) {
		return superficie;
	}
	@Override
	public int getTipusInstalacio() {
		return 1;
	}
	@Override
	public String toString() {
		return "Polideportivo--> "+super.toString();
	}
	
	
}
