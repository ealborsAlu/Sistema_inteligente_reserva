package entregable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Clase_secundaria {
	
	public static void muestraMenu() {
		//Se encargará de mostrar las opciones del menú , ademas de una peqña cortina separadora
		System.out.println("Las opciones son : \n Alquilar \n Devolver \n Consultar \n Salir");
		System.out.println("*******************************************************************");
	}

		
	public static String alquilada() {
		//método que a raiz de un random da verdadero o falso
		boolean opcion = false;
		opcion = Math.random() < 0.5;
		if (opcion == true)
			return " no se puede alquilar";
		else
			return " la pelicula está disponible";
	}

	public static String tiempoPasado() {
		boolean opcion = false;
		opcion = Math.random() < 0.5;
		if (opcion == true)
			return " Devolucion sin sobrecostes";
		else
			return " Debe pagar un sobrecoste por haberse pasado ";

	}

	public static void main(String[] args) {
		//programa principal
		
		//declaración de variables
		Scanner teclado = new Scanner(System.in);
		String op = "hola";
		String peli = "";
		String alquiler;

		//Impresión de saludo al usuario
		System.out.println("Bienvenido a BlockBuster ¿En que puedo ayudarle?");
		
	
		
		//Mientras que no se introduzca la palabra "Salir" , el bucle seguirá desarrollandose
		while (!op.equalsIgnoreCase("Salir")) {
			
			muestraMenu();

			op = teclado.next();

			switch (op) {

			case "Alquilar":
				System.out.println("Introduzca el nombre de la pelicula ...");
				teclado = new Scanner(System.in);
				alquiler = teclado.next();
				System.out.println("Pelicula registrada en el archivo de alquileres");
				System.out.println("################################################");
				break;

			case "Devolver":
				System.out.println("Introduzca el codigo de barras");
				teclado = new Scanner(System.in);
				int codigo = teclado.nextInt();
				System.out.println(tiempoPasado());
				System.out.println("################################################");
				break;
				
			case "Consultar":
				System.out.println("Introduzca el nombre de la pelicula");
				teclado = new Scanner(System.in);
				peli = teclado.next();
				System.out.println(peli + alquilada());
				System.out.println("################################################");
				break;
				
			case "Salir":
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Comando no implementado");
				break;

			}

		}

	}

}
