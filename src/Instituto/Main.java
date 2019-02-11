package Instituto;

import javax.naming.directory.ModificationItem;

public class Main {
	public static void main(String[] args) {
		//Metodos de la Clase Estudiante 
		Estudiant e1  = new Estudiant("Alberto", "Pachon", "77749839H", "AMS", 2);
		Estudiant e2  = new Estudiant("Antonio", "Ventoso", "76748839H", "AWS", 1);

		System.out.println("Estudiante 1 " + e1.toString());
		System.out.println("==============");
		System.out.println("Estudiante 2 "+ e2.toString());
		
		System.out.println("==============");
		System.out.println("Vamos a modificar los datos del Estudiante 2 ");
		System.out.println("==============");
		modificarDatosEstudiante(e2);
		System.out.println("==============");
		//Printamosm los Datoa del Estudiante Modificado
		System.out.println("Datos Estudiante 2: "+e2.toString());
		
		System.out.println("==============");
		//Ahora Pasamos a mirar lo que hace la clase Profesor 
		Profesor p = new Profesor("Leandro", "Zabala", "78949834A", "M6:Acceso a Datos",1500, 8);
		Profesor p1 = new Profesor("Enric", "Nieza", "78789839A", "M8:Aplicaciones Mobiles ", 2000, 6);

		System.out.println("Profesor 1 " + p.toString());
		System.out.println("==============");
		System.out.println("Profesor 2 "+ p1.toString());
		
		System.out.println("==============");
		System.out.println("Vamos a modificar los datos del Profesor 2 ");
		System.out.println("==============");
		modificarDatosProfesor(p1);
		System.out.println("==============");
		//Printamosm los Datoa del Profesor Modificado
		System.out.println("Datos Profesor 2: "+p1.toString());
		
		System.out.println("==============");
		//Metodos de la Clase Administrativos 
		Administrativos ad1 = new Administrativos("Federico", "Garcia", "97949839O", 800);
		Administrativos ad2 = new Administrativos("David", "Garcia", "74549839S", 1500);
		
		System.out.println("Administrativo 1 " + ad1.toString());
		System.out.println("==============");
		System.out.println("Administrativo 2 "+ ad2.toString());
		
		System.out.println("==============");
		System.out.println("Vamos a modificar los datos del Administrativo 2 ");
		System.out.println("==============");
		modificarDatosAdministrativo(ad1);
		modificarDatosAdministrativo(ad2);
		System.out.println("==============");
		//Printamosm los Datoa del Estudiante Modificado
		System.out.println("Datos Administrativo 1: "+ad1.toString());
		System.out.println("==============");
		System.out.println("Datos Administrativo 2: "+ad2.toString());
	}
	public static Estudiant modificarDatosEstudiante(Estudiant e2) {
		//De esta forma no peta el codigo 
		e2.canviEstudis("SIS");
		e2.cambiarCurso("2");
		
		//De esta forma Peta el codigo ya que es incorrecto
		//e2.cambiarCurso(null);
		//e2.canviEstudis(null);
		return e2;
	}
	public static Profesor modificarDatosProfesor(Profesor p2) {
		p2.cambiarHorario("4");
		return p2;
	}
	public static Administrativos modificarDatosAdministrativo(Administrativos admin) {
		//Bajamos el Sueldo del Administrativo 1 
		admin.modificarSueldo(500);
//		Subimos el Suelod del Administrativo 2 
//		admin.modificarSueldo(1500);
		return admin;
	}

}
