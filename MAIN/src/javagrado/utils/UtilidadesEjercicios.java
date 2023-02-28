package javagrado.utils;

import java.util.Scanner;

public class UtilidadesEjercicios {
	 static String variable1;//Esto es una variable de instacia -> Cuando esta sin el static , ahora es una que ya se crea en la memoria y se puede meter en los metodos de validar email, si queremos que funvione en otra clase del mismo paquete quitamos el private
										//Se utilizaba el this para sacar un objeto
	
	
	//Las variables estaticas son variables que van a compartir todos los objetos que se creen de esa clase
	
	
	
	
	
	/**
	 * Se utiliza para validar email dado como parametro
	 * @param email
	 */
	public static void validarEmail(String email) { //Si le pasamos sin parametros es como llamamos por su nombre pero sin apellidos , en cambio si tiene parametros es como si tuviese nombre y apellidos , a eso denominamos sobrecarga de metodos
		String mensajeError = "";
		
		// email=" bhshsg@xc.vxv.es "
		// Quito espacioes en blanco a izqda y dcha
		email = email.trim();

		// Controlamos el numero de @
		if (email.indexOf("@") == -1) {
			mensajeError += "El email debe tener una @. ";
		} else if (email.indexOf("@") != email.lastIndexOf("@")) {
			mensajeError += "Solo debe de haber una @. ";
		}

		// No puede tener espacios en blanco
		if (email.contains(" ")) {
			mensajeError += "No puede tener espacios en blanco. ";
		}

		// Despues de la @ tiene que haber al menos un punto
		// Primer forma
/*		if (email.lastIndexOf(".") < email.lastIndexOf("@")) {
			mensajeError += "Despues de la @ tiene que haber un punto. ";
		}*/

		// Segunda forma
		int posicionArroba = email.indexOf("@");
		String dominio = email.substring(posicionArroba+1);
		if (email.contains("@") && !dominio.contains(".")) {
			mensajeError += "Despues de la @ tiene que haber un punto. ";
		} else {
			//Miramos la longitud desde el Ãºltimo punto
			int posicionUltimoPunto = dominio.lastIndexOf(".");
			String subdominio = dominio.substring(posicionUltimoPunto + 1);
			if (subdominio.length() < 2 || subdominio.length() > 6) {
				mensajeError += "Despues del Ãºltimo punto no puede "
						+ "haber menos de 2 ni mas de 6 caracteres. ";
			}
		}
		
		
		if (mensajeError.equals("")){
			System.out.println("El email "+email+ " es correcto");
		}else {
			System.out.println("El email "+email+ " no es correcto: "+mensajeError);
		}									
	}
	
	//Metodo que me solicita el email y lo comprueba
	public static void validarEmail() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un email");
		String email = scan.nextLine();

		validarEmail(email);

	}

}
