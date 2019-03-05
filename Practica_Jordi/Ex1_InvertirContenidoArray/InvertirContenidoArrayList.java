package Ex1_InvertirContenidoArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class InvertirContenidoArrayList {
	public static void main(String[] args) {
		InvertirContenidoArrayList programa = new InvertirContenidoArrayList();
		ArrayList<String> alumnos = new ArrayList<String>();
		//Metemos los elementos dentro del Array
		programa.rellenarArray(alumnos);
		//Los mostramos antes de invertirlos
		programa.mostrarArrayNormal(alumnos);
		//Invertimos el contenido del Arraylist
		programa.invertirArray(alumnos);
	}
	public ArrayList<String > rellenarArray(ArrayList<String > students){
		students.add("Alberto Pachon Moya,AMS1/AMS2");
		students.add("Sean Sanchez,AMS1/AMS2");
		students.add("David Garcia ,AMS2");
		students.add("David Uson ,AMS1/AMS2");
		students.add("Darius Soubouti ,AMS2");
		return students;
	}
	public ArrayList<String> invertirArray(ArrayList<String > students) {
		Collections.reverse(students);
		mostrarArrayListInvertido(students);
		return students;
	}
	public void mostrarArrayNormal(ArrayList<String > students) {
		System.out.println("==============");
		System.out.println("ArrayList Con orden Normal: ");
		System.out.println("==============");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		System.out.println("==============");
	}
	public void mostrarArrayListInvertido(ArrayList<String > students) {
		System.out.println("");
		System.out.println("==============");
		System.out.println("ArrayList Invertido: ");
		System.out.println("==============");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		System.out.println("==============");
	}
}
