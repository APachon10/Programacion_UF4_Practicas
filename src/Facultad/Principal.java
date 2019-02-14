package Facultad;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		Estudiant e1 = new Estudiant("Alberto","Pachon","77749839H","Soltero",2);
		Estudiant e2 = new Estudiant("Federico","Garcia","78749889H","Relacion Estable",2);
		Estudiant e3 = new Estudiant("David","Garcia","76749736H","Casado",1);
		//Creamos el ArrayList donde los vamos a meter 
		ArrayList<Estudiant> estudiantes = new ArrayList<Estudiant>();
		//Añadimos a los estudiantes dentro del ArrayList 
		estudiantes.add(e1);
		estudiantes.add(e2);
		estudiantes.add(e3);
		//Mostramos la informacion de los estudiantes 
		for (int i = 0; i < estudiantes.size(); i++) {
			System.out.println(estudiantes.get(i));
		}
	}
}
