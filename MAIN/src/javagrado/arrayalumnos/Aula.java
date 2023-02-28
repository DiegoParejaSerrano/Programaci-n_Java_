package javagrado.arrayalumnos;

public class Aula {
	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Nombre1","Apellido1");
		
		Asignatura asignatura1 = new Asignatura ("Asignatura1",8.0);
		Asignatura asignatura2 = new Asignatura ("Asignatura2",6.0);
		Asignatura asignatura3 = new Asignatura ("Asinatura3",5.0);
		Asignatura[] asignaturas = {asignatura1,asignatura2}; //Esto es un array es una lista que es inmutable
		alumno1.setAsignatura(asignaturas);
		
		System.out.println(alumno1.getAsignatura()[0].getNota()); //Aqui sabemos que posicion tiene la asignatura
		
		Asignatura [] asignaturasalumno1 = alumno1.getAsignatura();
		boolean asignaturaEncontrada = false;
		for (Asignatura asignatura : asignaturasalumno1) { //Aprender foreach
			if (asignatura.getNombre().equals("Asignatura1")) {
				System.out.println("La nota es " + asignatura.getNota());
				asignaturaEncontrada = true;
				break;
			
			}
		if (!asignaturaEncontrada) { // Esto significa que si la asignatura = false , diga lo siguiente 
				System.out.println("No se ha encontrado la asigntaura");
			}
		}
		
		
		
		

	}



}
