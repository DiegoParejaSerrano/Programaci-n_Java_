package javagrado.edu.ucjc.metodosestaticos;

public class metodosEstaticos {
	
	public static void main(String[] args) {
		for (String arg : args) {
			System.out.println(arg);
		}
		metodosEstaticos pme = new metodosEstaticos();
		pme.metodo1();
		metodo2();
	}
	public void metodo1 () {
		System.out.println("Llamando al metodo1 no estático");
	}
	public static void metodo2 () {
		System.out.println("Llamando metodo 2 estatico");
		utilidades.metodo3();
		utilidades utils = new utilidades();
		utils.metodo4(); // Se crea un objeto utilidades para acceder al metodo 4 que esta en otra clase , en el metodo 2
		String numero = "4";
		int num = Integer.parseInt(numero); //Pasa un numero de string a int 
		Math.random(); //Genera un numero aleatorio del 1-2
	}
} 

//Un estatico no puede acceder a un dinamico pero un dinamico si puede llegar a un statico
