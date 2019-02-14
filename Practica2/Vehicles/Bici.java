package Vehicles;

public class Bici extends Vehicle{
	private String tipo_bici;
	//Constructors 
	public Bici(int num_ocupants, int num_rodes, String data_matriculacio, String mitja_despl, String tipo_bici) {
		super(num_ocupants, num_rodes, data_matriculacio, mitja_despl);
		this.tipo_bici = tipo_bici;
	}
	//Getters
	public String getTipo_bici() {
		return tipo_bici;
	}
	//Setters
	public void setTipo_bici(String tipo_bici) {
		this.tipo_bici = tipo_bici;
	}
	@Override
	public String toString() {
		return super.toString()+"Bici [tipo_bici=" + tipo_bici + "]";
	}
	
	
}
