package Practica1;

public class Edifici_oficines extends Edifici implements ISuperficie,ITipoInstalacion{
	private int num_oficinas;
	public Edifici_oficines() {
		
	}
	public Edifici_oficines(String nom, double superficie, int num_oficinas) {
		super(nom, superficie);
		this.num_oficinas = num_oficinas;
	}
	//Getters
	public int getNum_oficinas() {
		return num_oficinas;
	}
	//Setters
	public void setNum_oficinas(int num_oficinas) {
		this.num_oficinas = num_oficinas;
	}
	@Override
	public String toString() {
		return "Edifici_oficines -->" + super.toString()+", num_oficinas=" + num_oficinas;
	}
	@Override
	public int getTipusInstalacio() {
		return 0;
	}
	@Override
	public double getSuperficie(double superficie) {
		return superficie;
	}
}