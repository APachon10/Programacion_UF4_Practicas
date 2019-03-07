package Practica2;

public class InstrumentCorda implements InstrumentMusical{

	@Override
	public void tocar() {
		System.out.println("Estoi tocando un intrumento de cuerda ");
	}
	@Override
	public void afinar() {
		System.out.println("Estoi afinando un intrumento de Cuerda");
	}

	@Override
	public String tipusInstrument() {
		return "Intrumento de Cuerda";
	}

}
