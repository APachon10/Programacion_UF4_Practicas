package immboliaria;

public class immoble {
	private String adress;
	private int num_adress;
	private double num_quadrats;
	
	public immoble(String adress, int num_adress,double num_quadrats) {
		this.adress = adress;
		this.num_adress = num_adress;
		this.num_quadrats = num_quadrats;
	}
	//Getters
	public String getAdress() {
		return adress;
	}
	public int getNum_adress() {
		return num_adress;
	}
	public double getNum_quadrats() {
		return num_quadrats;
	}
	//Setters
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public void setNum_adress(int num_adress) {
		this.num_adress = num_adress;
	}
	public void setNum_quadrats(double num_quadrats) {
		this.num_quadrats = num_quadrats;
	}
	//To String 
	@Override
	public String toString() {
		return "immoble [adress=" + adress + ", num_adress=" + num_adress + "]";
	}
	
	
	
}
