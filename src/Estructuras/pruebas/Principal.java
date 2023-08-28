package Estructuras.pruebas;
import Estructuras.pilas.Pilas;
import Estructuras.nodos.LinkedStack;
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
		palabraSinEspacios = palabra.replace(" ", ""); //Toma dos argumenos el primero lo que deseas remplazar y el segundo con lo que lo remplazaras
		if (esPalindromo(palabraSinEspacios)) {
            System.out.println("La palabra es un palíndromo.");
            
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
		System.out.println("Escribe una ecuacion: ");
		palabra=leer.nextLine();
        if (verificarParentesis(palabra)==true)
        {
        	System.out.println("Contiene bien los parentesis");	
        }
        else
        {
        	System.out.println("No contiene bien los parentesis");	
        	
        }

		
		System.out.println("¿Quieres poner otra palabra? Escribe 1 si es asi, si no escribe otro numero.");

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
	        palabraInvertida += pila.pop();  //Toma la parte superior de la pila y lo agrega a la variable , por lo que se construye la palabra invertida
	    }

	    return palabra.equalsIgnoreCase(palabraInvertida);   
	}
	public static boolean verificarParentesis(String palabra) {
	    int longitud = palabra.length();
	    Pilas pila = new Pilas(longitud);

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);

            if (caracter == '(') {
                pila.push(caracter);
            } else if (caracter == ')') {
                if (pila.isEmpty()) {
                    return false; // No hay paréntesis de apertura correspondiente
                }
                pila.pop();
            }
        }

        return pila.isEmpty(); // Si la pila está vacía, todos los paréntesis se cerraron correctamente
    }
	



}
