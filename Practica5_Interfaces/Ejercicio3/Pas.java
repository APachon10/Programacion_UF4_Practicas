package Ejercicio3;

public class Pas implements Usuari{
	private String nombre;
	private int horas_faltadas;
	
	public Pas(String nombre, int horas_faltadas) {
		this.nombre = nombre;
		this.horas_faltadas = horas_faltadas;
	}
	@Override
	public String absencies(int horas_faltadas) {
		String mensaje ="";
		System.out.println("Horas Faltadas : "+horas_faltadas);
		if (horas_faltadas >40) {
			mensaje = "El Alumno "+nombre+" ha superado el 15% de faltas ";
		}else {
			mensaje = "El Alumno "+nombre+" Esta por debajo de l5 de faltas";
		}
		return mensaje;
	}
	//Getters
	public String getNombre() {
		return nombre;
	}
	public int getHoras_faltadas() {
		return horas_faltadas;
	}
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setHoras_faltadas(int horas_faltadas) {
		this.horas_faltadas = horas_faltadas;
	}
	@Override
	public String toString() {
		return "Pas --> nombre=" + nombre + ", horas_faltadas=" + horas_faltadas;
	}
	
	
	
}
