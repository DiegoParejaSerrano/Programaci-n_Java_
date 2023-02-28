package javagrado.menu;
import java.util.Scanner;

import javagrado.edu.ucjc.metodosestaticos.UtilidadesEjerciciosMenu;
import javagrado.utils.UtilidadesEjercicios;
public class menu {
	public static void main(String[] args) {
		int opcion = 0;
		do {
			String [] menu = ("Opcion1","Opcion2");
			UtilidadesEjerciciosMenu.pintamenu();
			System.out.println("Selecciona una opcion");
			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();

//			if (opcion==1) {
//				
//			}else if (opcion ==2) {
//				pintaCuadrado();
//			}

			switch (opcion) {
			case 1:
				UtilidadesEjercicios.validarEmail();
				break;
			case 2:
				pintaCuadrado();
				break;
			case 3:
				System.out.println("No hay datos sobre la persona ");
				break;
			case 4:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}

		} while (opcion != 4);

	}

	public static void pintaCuadrado() {
		System.out.println("Pintando cuadrado");
		int numLados = 5;
		for (int i = 0; i < numLados; i++) {// Filas
			for (int j = 0; j < numLados; j++) {// Columnas
				if (i == 0 || i == numLados - 1) {// Primera y Ãºltima fila
					System.out.print("*\t");
				} else {
					if (j == 0 || j == numLados - 1) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}
				}
			}
			System.out.println();
		}
	}

	// mÃ©todo mostrarDatos()
	// Crear clase Persona (nombre, apellidos,
	// dni (no se modifica), email)
	// 3 objetos de tipo de Persona
	// Metemos los objetos en un array
	// Mostrar los nombres de todas las personas del array
	


	

}
