package Practica2;

public class testInstruments {
	public static void main(String[] args) {
		InstrumentCorda guitarra = new InstrumentCorda();
		InstrumentVent trompeta = new InstrumentVent();
		
		ManejoInstrument(guitarra);
		System.out.println("====================");
		ManejoInstrument(trompeta);
	}
	public static void ManejoInstrument(InstrumentMusical i1) {
		System.out.println("Tipo Instrumento: " + i1.tipusInstrument());
		i1.tocar();
		i1.afinar();
	}
}
