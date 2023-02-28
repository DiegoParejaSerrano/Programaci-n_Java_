package javagrado.edu.ucjc.metodosestaticos;

import java.util.Scanner;

import javagrado.utils.UtilidadesEjercicios;

public class UtilidadesEjerciciosMenu {
	public static void pintamenu(){
		System.out.println("1. Validar email");
		System.out.println("2. Pintar Cuadrado");
		System.out.println("3. Mostrar datos");
		System.out.println("4. Salir");
}
public static void pintamenu(String [] menu) {
	for (String opcion : menu ) {
		System.out.println(opcion);
	}
}
public static void pintamenu(String menu) {
	pintamenu(menu.split("\n"));
	
}
	
}
