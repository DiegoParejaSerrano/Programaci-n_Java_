package javagrado.utils;

public class Test {

	public static void main(String[] args) {
		UtilidadesEjercicios.variable1 = "Hola";
		
		UtilidadesEjercicios ues = new UtilidadesEjercicios();
		ues.variable1 = "Adios";
		
		UtilidadesEjercicios ues2 = new UtilidadesEjercicios();
		System.out.println(ues2.variable1);

	} //Al ser una variable estatica , la cual va cambiando segun cambiemos su valor en diferentes objetos

}


//Crear un menu , con sobrecarga de metodos y otro que te haga lo de dar los datos del menu