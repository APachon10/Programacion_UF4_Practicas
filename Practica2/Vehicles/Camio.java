package Vehicles;

public class Camio extends Vehicle{
	private int height;

	public Camio(int num_ocupants, int num_rodes, String data_matriculacio, String mitja_despl, int height) {
		super(num_ocupants, num_rodes, data_matriculacio, mitja_despl);
		this.height = height;
	}
	
}
