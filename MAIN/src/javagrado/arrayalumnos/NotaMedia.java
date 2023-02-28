package javagrado.arrayalumnos;

public class NotaMedia {
	public static void main(String[] args) {
		//Creo alumno1
		Alumno alumno1 = new Alumno("Nombre1","Apellido1");
		
		Asignatura asignatura1 = new Asignatura ("Asignatura1",8.0);
		Asignatura asignatura2 = new Asignatura ("Asignatura2",6.0);
		Asignatura[] asignaturasAlumno = {asignatura1,asignatura2}; //Esto es un array es una lista que es inmutable
		alumno1.setAsignatura(asignaturasAlumno);
		
		//Creo alumno 2 
		Asignatura asignatura3 = new Asignatura ("Asignatura3",3.0);
		Asignatura asignatura4 = new Asignatura ("Asignatura4",9.0);
		Asignatura[] asignaturasAlumno2 = {asignatura3,asignatura4}; //Esto es un array es una lista que es inmutable
		Alumno alumno2 = new Alumno("Nombre2","Aellido2",asignaturasAlumno2);
		
		//Creo alumno3 
		Asignatura asignatura5 = new Asignatura ("Asignatura5",3.0);
		Asignatura asignatura6 = new Asignatura ("Asignatura6",9.0);
		Asignatura[] asignaturasAlumno3 = {asignatura5,asignatura6};
		Alumno alumno3 = new Alumno("Nombre2","Aellido2",asignaturasAlumno3);
		
		//Almaceno todos los alumnos para recorrerlos 
		Alumno[] aula = {alumno1,alumno2,alumno3};
		double notaMasAlta = 0;
		String nombreAlumnoNotaMasAlta = " ";
		//Inicializo la variable para guardar la nota mas alta
		for (Alumno alumno : aula) {
			//Cojo las asignaturas del alumno 
			Asignatura  [] asignaturaAlumno = alumno.getAsignatura();
			
			double notasAlumno = 0;
			for (Asignatura asignatura : asignaturaAlumno) { 
				notasAlumno +=asignatura.getNota();
				
						
			}
			double notaMedia = notasAlumno/asignaturasAlumno.length;
			System.out.println("Nota media del alumno" + alumno.getNombre()+ "es "+ notaMedia);
			
			if (notaMedia>notaMasAlta) {
				notaMasAlta = notaMedia;
				nombreAlumnoNotaMasAlta = alumno.getNombre();
				
			}
		}	System.out.println("La notra media mas alta es "+ notaMasAlta);
		
		
		
		
		
			
			
		
		
	}
	

}
