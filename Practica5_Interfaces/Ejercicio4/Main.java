package Ejercicio4;

public interface Main {
	public static void main(String[] args) {
		double [] valores = null;
		
		ArrayReals r = new ArrayReals(valores);
		System.out.println("Datos del Array: ");
		valores = r.rellenarArray(valores);
		System.out.println("=========================");
		r.mostrarDatos(valores);
		System.out.println("=========================");
		
		System.out.println("Valor Maximo: "+r.maxim(valores));
		System.out.println("=========================");
		System.out.println("Valor Minimo: "+r.minim(valores));
		System.out.println("=========================");
		System.out.println("Suma de todos los elementos del Array  "+r.sumatori(valores));
		System.out.println("=========================");
		
		System.out.println();
		System.out.println("Programa Finalizado");
	}
}
