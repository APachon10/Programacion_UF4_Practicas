package Ejercicio4;

import java.util.Arrays;

public class ArrayReals implements Estadistiques{
	private final int medida= 10;
	double [] valores = new double[medida];

	public ArrayReals(double[] valores) {
		this.valores = valores;
	}
	//Metodos para gestionar el Array 
	public double[] rellenarArray(double [] vals) {
		vals = new double[medida];
		for (int i = 0; i < vals.length; i++) {
			vals[i]=i;
		}
		return vals;
	}
	public void mostrarDatos(double [] vals) {
		System.out.println("Array --> "+Arrays.toString(vals));
	}
	//Metodos que vienen de la interface
	@Override
	public double maxim(double [] valores) {
		double numeroMayor=0;
		numeroMayor = valores[0];
		for (int i = 0; i < valores.length; i++) {
			if (valores[i]>numeroMayor) {
				numeroMayor= valores[i];
			}
		}
		return numeroMayor;
	}

	@Override
	public double minim(double[] valores) {
		double numeroMenor=0;
		numeroMenor = valores[0];
		for (int i = 0; i < valores.length; i++) {
			if (valores[i]<numeroMenor) {
				numeroMenor= valores[i];
			}
		}
		return numeroMenor;
	}

	@Override
	public double sumatori(double[] valores) {
		double suma=0;
		for (int i = 0; i < valores.length; i++) {
			suma = suma +valores[i];
		}
		return suma;
	}
}
