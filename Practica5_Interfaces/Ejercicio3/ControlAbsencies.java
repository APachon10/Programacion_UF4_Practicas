package Ejercicio3;

public class ControlAbsencies implements Usuari{
	private Usuari usuario;

	public ControlAbsencies(Usuari usuario) {
		this.usuario = usuario;
	}
	public void getAbsencies(int nombreDies) {
		
	}
	@Override
	public String absencies(int dias_faltados) {
		return usuario.absencies(5);
	}
	
}
