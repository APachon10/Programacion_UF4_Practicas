package Vehicles;

public class Vehicle {
	private int num_ocupants,num_rodes;
	private String data_matriculacio,mitja_despl;
	//Constructors 
	public Vehicle(int num_ocupants, int num_rodes, String data_matriculacio, String mitja_despl) {
		this.num_ocupants = num_ocupants;
		this.num_rodes = num_rodes;
		this.data_matriculacio = data_matriculacio;
		this.mitja_despl = mitja_despl;
	}
	//Getters
	public int getNum_ocupants() {
		return num_ocupants;
	}
	public int getNum_rodes() {
		return num_rodes;
	}
	public String getData_matriculacio() {
		return data_matriculacio;
	}
	public String getMitja_despl() {
		return mitja_despl;
	}
	//Setters
	public void setNum_ocupants(int num_ocupants) {
		this.num_ocupants = num_ocupants;
	}
	public void setNum_rodes(int num_rodes) {
		this.num_rodes = num_rodes;
	}
	public void setData_matriculacio(String data_matriculacio) {
		this.data_matriculacio = data_matriculacio;
	}
	public void setMitja_despl(String mitja_despl) {
		this.mitja_despl = mitja_despl;
	}
	//To String 
	@Override
	public String toString() {
		return "Vehicle [num_ocupants=" + num_ocupants + ", num_rodes=" + num_rodes + ", data_matriculacio="
				+ data_matriculacio + ", mitja_despl=" + mitja_despl + "]";
	}
	
}
