package NotacionPolaca;
import Estructuras.pilas.Pilas;
import Estructuras.nodos.LinkedStack;
import java.util.Scanner;
public class TareaNotacion {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        String ecuacion, ecuacionSinEspacios, postfija = "", postfijaUno = "";
        char caracter, auxiliar;
        double resultado, numeroUnoD, numeroDosD, resultadoCalculo;
        System.out.println("Escribe una ecuación: ");
        ecuacion = leer.nextLine();
        ecuacionSinEspacios = ecuacion.replaceAll(" ", "");
        if (verificarParentesis(ecuacionSinEspacios)) {
            LinkedStack resultadoRPN = new LinkedStack();
            StringBuilder numeroActual = new StringBuilder();
            for (int i = 0; i < ecuacionSinEspacios.length(); i++) {
                caracter = ecuacionSinEspacios.charAt(i);
                if (prioridad(caracter) > 0) {
                    while (!resultadoRPN.isEmpty() && prioridad((Character) resultadoRPN.peek()) >= prioridad(caracter)) {
                        postfijaUno += resultadoRPN.pop() + " ";
                    }
                    resultadoRPN.push(caracter);
                } else if (caracter == '(') {
                    resultadoRPN.push(caracter);
                } else if (caracter == ')') {
                    auxiliar = (Character) resultadoRPN.pop();
                    while (auxiliar != '(') {
                        postfijaUno += auxiliar + " ";
                        auxiliar = (Character) resultadoRPN.pop();
                    }
                } else {
                    numeroActual.append(caracter);
                    if (i + 1 >= ecuacionSinEspacios.length() || !Character.isDigit(ecuacionSinEspacios.charAt(i + 1))) {
                        postfijaUno += numeroActual.toString() + " ";
                        numeroActual.setLength(0);
                    }
                }
            }
            while (!resultadoRPN.isEmpty()) {
                postfijaUno += resultadoRPN.pop() + " ";
            }
            System.out.println("Notacion polaca inversa: " + postfijaUno);
            postfija = postfijaUno.replaceAll(" ", "");

            // Solucion
            for (int i = 0; i < postfija.length(); i++) {
                caracter = postfija.charAt(i);
                if (prioridad(caracter) > 0) {
                    double numeroUno = (double) resultadoRPN.pop();
                    double numeroDos = (double) resultadoRPN.pop();
                    resultadoCalculo = calculo(numeroUno, numeroDos, caracter);
                    resultadoRPN.push(resultadoCalculo);
                } else if (Character.isDigit(caracter)) {
                    resultadoRPN.push((double) (Character.getNumericValue(caracter)));
                }
            }
            resultado = (double) resultadoRPN.pop();
            System.out.println("Resultado: " + resultado);

		} else {
			System.out.println("Error en los paréntesis o en la expresión.");
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
		return pila.isEmpty(); // Si la pila está vacía, todos los paréntesis se cerraron correctamente
	}

	public static int prioridad(char operador) {
		int prioridad = 0;

		if (operador == '+' || operador == '-') {
			prioridad = 1;
		} else if (operador == '*' || operador == '/') {
			prioridad = 2;
		}

		return prioridad;
	}

	public static double calculo(double numeroUno, double numeroDos, char operador) {
		double resultado = 0.0;

		switch (operador) {
		case '+':
			resultado = numeroUno + numeroDos;
			break;
		case '-':
			resultado = numeroDos - numeroUno;
			break;
		case '*':
			resultado = numeroUno * numeroDos;
			break;
		case '/':
			if(numeroUno!=0)
			{
				resultado = numeroDos / numeroUno;
				break;
				
			}
			else {
				break;
			}
			
		}
		return resultado;
	}
}
