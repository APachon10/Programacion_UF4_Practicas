package Ex2_3_Vehicles;

public class Llanxa extends Vehicle{
	private String casco;
	
	public Llanxa(int num_ocupants, int num_rodes, String data_matriculacio, String mitja_despl, String casco) {
		super(num_ocupants, num_rodes, data_matriculacio, mitja_despl);
		this.casco = casco;
	}
	//Getters
	public String getCasco() {
		return casco;
	}
	//Setters
	public void setCasco(String casco) {
		this.casco = casco;
	}
	@Override
	public String toString() {
		return "Llanxa--> "+super.toString()+" [casco=" + casco + "]";
	}
	
	
}
