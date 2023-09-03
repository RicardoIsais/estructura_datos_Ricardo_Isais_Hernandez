package NotacionPolaca;
import Estructuras.pilas.Pilas;
import Estructuras.nodos.LinkedStack;
import java.util.Scanner;
public class TareaNotacion {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String ecuacion, ecuacionSinEspacios, postfija = "";
		char caracter,auxiliar;
		double resultado,operacionUno,operacionDos,resultadoCalculo;
		System.out.println("Escribe una ecuación: ");
		ecuacion = leer.nextLine();
		ecuacionSinEspacios = ecuacion.replaceAll(" ", "");
		if (verificarParentesis(ecuacionSinEspacios)) {
			LinkedStack resultadoRPN = new LinkedStack();
			for (int i = 0; i < ecuacionSinEspacios.length(); i++) {
				caracter = ecuacionSinEspacios.charAt(i);
				if (prioridad(caracter) > 0) {
					while (resultadoRPN.isEmpty() == false && prioridad((Character) resultadoRPN.peek()) >= prioridad(caracter)) {
						postfija += resultadoRPN.pop();
					}
					resultadoRPN.push(caracter);
				} else if (caracter == ')') {
					auxiliar = (Character) resultadoRPN.pop();
					while (auxiliar != '(') {
						postfija += auxiliar;
						auxiliar = (Character) resultadoRPN.pop();
					}
				} else if (caracter == '(') {
					resultadoRPN.push(caracter);
				} else {
					postfija += caracter;
				}
			}
			for (int i = 0; i < resultadoRPN.size(); i++) {
				postfija += resultadoRPN.pop();
			}
			System.out.println("Notacion polaca inversa: " + postfija);
			// Solucion
			for (int i = 0; i < postfija.length(); i++) {
				caracter = postfija.charAt(i);
				if (prioridad(caracter) > 0) {
					Object objOperacionUno = resultadoRPN.pop();
					Object objOperacionDos = resultadoRPN.pop();
					if (objOperacionUno instanceof Double && objOperacionDos instanceof Double) { //Devuelve un valor boleano, verifica que ambos objectos son de tipo double antes de realizar alguna operacion
						operacionUno = (Double) objOperacionUno;
						operacionDos = (Double) objOperacionDos;
						resultadoCalculo = calculo(operacionUno, operacionDos, caracter);
						resultadoRPN.push(resultadoCalculo);
					}
				} else {
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

	public static double calculo(double operacionUno, double operacionDos, char operador) {
		double resultado = 0.0;

		switch (operador) {
		case '+':
			resultado = operacionUno + operacionDos;
			break;
		case '-':
			resultado = operacionDos - operacionUno;
			break;
		case '*':
			resultado = operacionUno * operacionDos;
			break;
		case '/':
			resultado = operacionDos / operacionUno;
			break;
		}
		return resultado;
	}
}



