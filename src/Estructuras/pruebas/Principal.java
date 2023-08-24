package Estructuras.pruebas;
import Estructuras.pilas.Pilas;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		boolean respuesta=false;
	    int respuestaNumero;
      	String palabra,respuestaCadena,palabraSinEspacios;
      	do {
		System.out.print("Ingresar una palabra: ");
		palabra=leer.nextLine();
		palabraSinEspacios = palabra.replace(" ", "");
		if (esPalindromo(palabraSinEspacios)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
		System.out.print("\n¿Desea ejecutar el programa nuevamente? Poner 1 si es asi / poner otro numero diferente a 1: ");

		respuestaCadena= leer.nextLine();

		respuestaNumero = Integer.parseInt(respuestaCadena);

		if (respuestaNumero==1)

		{

		respuesta=true;

		}

		else

		{

		System.out.print("Fin del programa");

		respuesta=false;

		}
      	}while(respuesta==true);
		
		
		
		
		
		

		

	}

	public static boolean esPalindromo(String palabra) {
	    int longitud = palabra.length();
	    Pilas pila = new Pilas(longitud);

	    for (int i = 0; i < longitud; i++) {
	        pila.push(palabra.charAt(i));
	    }

	    String palabraInvertida = "";
	    while (!pila.isEmpty()) {
	        palabraInvertida += pila.pop();
	    }

	    return palabra.equalsIgnoreCase(palabraInvertida);
	}

}
