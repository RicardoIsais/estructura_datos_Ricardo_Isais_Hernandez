package NotacionPolaca;
import Estructuras.pilas.Pilas;
import Estructuras.nodos.LinkedStack;
import java.util.Scanner;

public class TareaNotacion {

	public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe una ecuación: ");
        String ecuacion = leer.nextLine();
        double resultado = evaluarExpresion(ecuacion);
        if (verificarParentesis(ecuacion)==true)
        {
        	if (resultado != -1) {
            	System.out.println("Ecuación inversa: " + obtenerEcuacionInversa(ecuacion));
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Error en la expresión.");
            }
        }
        else
        {
        	System.out.println("Error en los parentesis.");	
        }
        
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
		return pila.isEmpty(); // Si la pila está vacía, todos los paréntesis se cerraron correctamente
		}

	public static String obtenerEcuacionInversa(String ecuacion) {
	    String ecuacionInversaStr = ""; 

	    LinkedStack ecuacionInversa = new LinkedStack();
	    LinkedStack operadores = new LinkedStack();
	    int i = 0;
	    while (i < ecuacion.length()) {
	        char caracter = ecuacion.charAt(i);
	        if (Character.isDigit(caracter)) {
	            String numeroActual = "";
	            while (i < ecuacion.length() && (Character.isDigit(ecuacion.charAt(i)) || ecuacion.charAt(i) == '.')) {
	                numeroActual += ecuacion.charAt(i);
	                i++;
	            }
	            ecuacionInversa.push(numeroActual);
	        } else if (caracter == '(') {
	            operadores.push(caracter);
	            i++;
	        } else if (caracter == ')') {
	            while (!operadores.isEmpty() && (Character) operadores.peek() != '(') {
	                ecuacionInversa.push(operadores.pop().toString());
	            }
	            if (!operadores.isEmpty() && (Character) operadores.peek() == '(') {
	                operadores.pop();
	            } else {
	                ecuacionInversaStr = "Error en los paréntesis";
	            }
	            i++;
	        } else if (esOperador(caracter)) {
	            while (!operadores.isEmpty() && prioridad((Character) operadores.peek()) >= prioridad(caracter)) {
	                ecuacionInversa.push(operadores.pop().toString());
	            }
	            operadores.push(caracter);
	            i++;
	        } else if (caracter == ' ') {
	            i++;
	        } else {
	            ecuacionInversaStr = "Caracter no válido";
	        }
	    }

	    while (!operadores.isEmpty()) {
	        if ((Character) operadores.peek() == '(') {
	            ecuacionInversaStr = "Error en los paréntesis";
	        }
	        ecuacionInversa.push(operadores.pop().toString());
	    }

	    while (!ecuacionInversa.isEmpty()) {
	        ecuacionInversaStr += ecuacionInversa.pop() + " ";
	    }

	    return ecuacionInversaStr; 
	}
	public static double evaluarExpresion(String ecuacion) {
	    double respuesta = -1;
	    LinkedStack numeros = new LinkedStack();
	    LinkedStack operadores = new LinkedStack();
	    int i = 0;
	    String numeroActual = ""; 
	    while (i < ecuacion.length()) {
	        char caracter = ecuacion.charAt(i);
	        if (Character.isDigit(caracter) || caracter == '.') {
	            numeroActual += caracter; 
	            i++;
	        } else if (caracter==' ') {
	            i++;
	        } else {
	            if (!numeroActual.isEmpty()) {
	                numeros.push(Double.parseDouble(numeroActual));
	                numeroActual = ""; 
	            }
	            
	            if (caracter == '(') {
	                operadores.push(caracter);
	                i++;
	            } else if (caracter == ')') {
	                while (!operadores.isEmpty() && (Character) operadores.peek() != '(') {
	                    realizarOperacion(numeros, operadores);
	                }
	                if (!operadores.isEmpty() && (Character) operadores.peek() == '(') {
	                    operadores.pop();
	                } else {
	                    respuesta = -1; // Error en los paréntesis
	                }
	                i++;
	            } else if (esOperador(caracter)) {
	                while (!operadores.isEmpty() && prioridad((Character) operadores.peek()) >= prioridad(caracter)) {
	                    realizarOperacion(numeros, operadores);
	                }
	                operadores.push(caracter);
	                i++;
	            } else {
	                respuesta = -1; 
	                break; 
	            }
	        }
	    }

	    
	    if (!numeroActual.isEmpty()) {
	        numeros.push(Double.parseDouble(numeroActual));
	    }

	    while (!operadores.isEmpty()) {
	        if ((Character) operadores.peek() == '(') {
	            respuesta = -1; // Error en los paréntesis
	        }
	        realizarOperacion(numeros, operadores);
	    }

	    if (numeros.size() == 1 && operadores.isEmpty()) {
	        respuesta = (double) numeros.pop();
	    } else {
	        respuesta = -1; // Error en la expresión
	    }
	    
	    return respuesta;
	}

    public static boolean esOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static int prioridad(char operador) {
    	int prioridad=0;
        if (operador == '+' || operador == '-') {
            prioridad= 1;
        } else if (operador == '*' || operador == '/') {
            prioridad= 2;
        }
        return prioridad; 
    }

    public static void realizarOperacion(LinkedStack numeros, LinkedStack operadores) {
        if (numeros.size() >= 2 && !operadores.isEmpty()) {
            double numero2 = (double)numeros.pop();
            double numero1 = (double)numeros.pop();
            char operador = (Character) operadores.pop();
            double resultado = calcular(numero1, numero2, operador);
            numeros.push(resultado);
        }
    }

    public static double calcular(double numero1, double numero2, char operador) {
        double resultado = 0.0;
        
        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    resultado = -1; 
                }
                break;
                    }
        return resultado;
    }
}