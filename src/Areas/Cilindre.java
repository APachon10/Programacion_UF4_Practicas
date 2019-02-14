package Areas;

public class Cilindre {
	private double radi,altura;
	//Constructor
	public Cilindre(double radi, double altura) {
		this.radi = radi;
		this.altura = altura;
	}
	//Getters
	public double getRadi() {
		return radi;
	}
	public double getAltura() {
		return altura;
	}
	//Setters
	public void setRadi(double radi) {
		this.radi = radi;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	//To String +
	@Override
	public String toString() {
		return "Cilindre [radi=" + radi + ", altura=" + altura + "]";
	}
	//Metodos 
	public double calcularAreaCilindro() {
		double res = 0;
		res = 2*Math.PI*radi*(radi+altura);
		return res;
	}
	public double calcularVolumenCilindro() {
		double res = 0;
		res =Math.PI*(radi*radi)*altura;
		return res;
	}

}
