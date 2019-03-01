package Ex1_InvertirContenidoArray;

import java.util.ArrayList;
import java.util.Scanner;

public class LeerNotasAlumnops {
	public static void main(String[] args) {
		LeerNotasAlumnops programa = new LeerNotasAlumnops();
		ArrayList<ArrayList<Float>> notas = new ArrayList<>();
		programa.recogerNotas(notas);
		programa.mostrarDatos(notas);
	}
	public void recogerNotas(ArrayList<ArrayList<Float>> notes) {
		int num_alumnos = 10;
		boolean salir = true;
		int i = 0;
		for (int j = 1; j <= num_alumnos; j++) {
			notes.add(new ArrayList<Float>());
			while (salir) {
				System.out.print("Introduce notas:");
				String notas = recogerCadenas();
				String notess [] = notas.split(" ");
				for (int k = 0; k < notess.length; k++) {
					float nota = Float.parseFloat(notess[k]);
					if (nota < 0) {
						System.out.println("Siguiente alumno");
						salir = false;
					} else {
						notes.get(i).add(nota);
					}
				}
			}
			salir = true;
			i++;
		}
		
	}
	public void mostrarDatos(ArrayList<ArrayList<Float>> notes) {
		System.out.println("==============");
		System.out.println("Notas Alumnos");
		System.out.println("==============");
		for (int h = 0; h < notes.size(); h++) {
			System.out.println(notes.get(h));
		}
		System.out.println("==============");
	}
	//Metodos para recoger Datos
	public  Float recogerFloats() {
		Scanner scan  =new Scanner(System.in);
		float number= scan.nextFloat();
		return number;
	}
	public String recogerCadenas() {
		Scanner scan =new Scanner(System.in);
		String cadena = scan.nextLine();
		return cadena;
	}
}
