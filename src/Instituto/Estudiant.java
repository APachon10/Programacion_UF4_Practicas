package Instituto;

public class Estudiant {
	private String name,surname,NIF,course_name;
	private int  course;
	//Constructor 
	public Estudiant(String name, String surname, String nIF, String course_name, int course) {
		this.name = name;
		this.surname = surname;
		NIF = nIF;
		this.course_name = course_name;
		this.course = course;
	}
	//Metodos
	boolean canviEstudis(String nouEstudi) {
		boolean ok = false;
		
		if (!nouEstudi.equals(null)) {
			if (this.course_name.equals(nouEstudi)) {
				ok=false;
			}else {
				String cicloAnterior =this.course_name;
				this.course_name = nouEstudi;
				System.out.println("El estudiante "+this.name +" Ha cambiado del ciclo  "+cicloAnterior + " al ciclo "+this.course_name);
				ok=true;
			}
		}else {
			System.out.println("String Vacio");
		}
		return ok;
	}
	boolean cambiarCurso(String nouCurs) {
		boolean cambio = false;
		if (!nouCurs.equals(null)) {
			int nouCurs2 = Integer.parseInt(nouCurs);
			if (nouCurs2!=this.course) {
				int añoAnterior = this.course; 
				this.course = nouCurs2;
				System.out.println("El estudiante "+this.name +" Ha cambiado del curso   "+añoAnterior + " al curso "+this.course);
				cambio  =true;
			}else {
				System.out.println("No ha cambiado de curso ");
				cambio  =false;
			}
		}
		return cambio;
	}
	@Override
	public String toString() {
		return "Estudiant [name=" + name + ", surname=" + surname + ", NIF=" + NIF + ", course_name=" + course_name
				+ ", course=" + course + "]";
	}
	//Getters && Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getNIF() {
		return NIF;
	}
	public void setNIF(String nIF) {
		NIF = nIF;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	
}
