package javagrado.arrayalumnos;

public class Alumno {
	private String nombre; 
	private String apellido;
	private Asignatura [ ] asignatura;
	//Constructores 
	 	Alumno(String nombre , String apellido , Asignatura[] asignatura){
	 		this.nombre = nombre; // El this va a hacer referencia a los atriburtos distancia que esten creados en la clase 
	 		this.apellido = apellido;
	 		this.asignatura = asignatura;
	 	
	 	}
	 	Alumno(String nombre , String apellido ){
	 		this.nombre = nombre; // El this va a hacer referencia a los atriburtos distancia que esten creados en la clase 
	 		this.apellido = apellido;
	 		
	 		
	 		
	 	}
	public String getNombre() { // Para obtener
		return this.nombre;
		
	}
	 public void setNombre(String nombre) { //Para modificar 
		 this.nombre = nombre;
	 }
	public String getApellido() {
		return this.apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;

	}
	public Asignatura[] getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(Asignatura[] asignatura) {
		this.asignatura = asignatura;
	}



}
 