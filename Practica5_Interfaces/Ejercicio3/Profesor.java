package Ejercicio3;

public class Profesor implements Usuari{
	private String nombre;
	private int dias_falta;
	
	public Profesor(String nombre, int dias_falta) {
		this.nombre = nombre;
		this.dias_falta = dias_falta;
	}

	@Override
	public String absencies(int dias_faltados) {
		int horas=0;
		String mensaje ="";
		for (int i = 0; i <= dias_faltados; i++) {
			horas = i*24;
		}
		System.out.println("Horas Faltadas : "+horas);
		if (horas >56) {
			mensaje = "El profesor ha superado el % de faltas ";
		}
		return mensaje;
	}
}
