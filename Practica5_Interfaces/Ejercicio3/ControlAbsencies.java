package Ejercicio3;

public class ControlAbsencies implements Usuari{
	private Usuari usuario;

	public ControlAbsencies(Usuari usuario) {
		this.usuario = usuario;
	}
	@Override
	public String absencies(int dias_faltados) {
		return usuario.absencies(5);
	}
	
}
