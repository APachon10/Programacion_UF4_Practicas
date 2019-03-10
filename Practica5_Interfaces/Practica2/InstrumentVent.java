package Practica2;

public class InstrumentVent implements InstrumentMusical{

	@Override
	public void tocar() {
		System.out.println("Estoi tocnaod un intrumento de Viento");
	}

	@Override
	public void afinar() {
		System.out.println("Estoi afinando un intrumento de Viento");
		
	}

	@Override
	public String tipusInstrument() {
		
		return "Intrumenot de Viento";
	}

}
