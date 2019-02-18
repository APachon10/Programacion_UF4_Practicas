package vectors_clasesAbstractes;

import java.util.Arrays;

public class Principal {
	public static void main(String[] args) {
		Tipus_Empleat empleados [] = new Tipus_Empleat[5];
		Nomina m = new Nomina(empleados);
		System.out.println(Arrays.toString(empleados));
	}
}
