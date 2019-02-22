package ArrayList_Ejercicios;

public class Producte {
	//Atributos
	private int code,stock;
	private String name,tipe;
	private double price;
	//Constructors
	public Producte(int code, int stock, String name, String tipe, double price) {
		this.code = code;
		this.stock = stock;
		this.name = name;
		this.tipe = tipe;
		this.price = price;
	}
	//Getters
	public int getCode() {
		return code;
	}
	public int getStock() {
		return stock;
	}
	public String getName() {
		return name;
	}
	public String getTipe() {
		return tipe;
	}
	public double getPrice() {
		return price;
	}
	//Setters
	public void setCode(int code) {
		this.code = code;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTipe(String tipe) {
		this.tipe = tipe;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Producte--> code=" + code + ", stock=" + stock + ", name=" + name + ", tipe=" + tipe + ", price=" + price;
	}

	
}
