package Vehicles;

public class Cotxer extends Vehicle{
	private boolean puertas;
	//Constructors 
	public Cotxer(int num_ocupants, int num_rodes, String data_matriculacio, String mitja_despl, boolean puertas) {
		super(num_ocupants, num_rodes, data_matriculacio, mitja_despl);
		this.puertas = puertas;
	}
	//Getter
	public boolean isPuertas() {
		return puertas;
	}
	//Setters
	public void setPuertas(boolean puertas) {
		this.puertas = puertas;
	}
	@Override
	public String toString() {
		return "Cotxer-->"+super.toString()+" [puertas=" + puertas + "]";
	}
	
	
}
