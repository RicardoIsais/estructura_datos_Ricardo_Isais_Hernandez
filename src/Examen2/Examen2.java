package Examen2;
import Colas.CircularQueue;
import java.util.Scanner;

import ArrayList.ArrayList;
import ArrayList.LinkedList;
import java.util.Random;

public class Examen2 {

	public static void main(String[] args) throws Exception {
		Scanner leer = new Scanner(System.in);

		// Ejercicio 1
		System.out.println("Escribe 5 palabras");
		String[] palabras = new String[5];
		for (int i = 0; i < 5; i++) {
			palabras[i] = leer.nextLine();
		}
		CircularQueue colaVocales = new CircularQueue(30);
		CircularQueue colaConsonantes = new CircularQueue(30);
		for (String palabra : palabras) {
			procesarPalabra(palabra, colaVocales, colaConsonantes);
		}
		contarYMostrarFrecuencia("Vocales", colaVocales);
		contarYMostrarFrecuencia("Consonantes", colaConsonantes);
		//Ejercicio 2
		System.out.print("Los numeros aleatorios son: ");
		LinkedList listaNumerosNoRepetidos = new LinkedList();
		CircularQueue colaNumeros = new CircularQueue(50);
		Random random = new Random();
		for (int i = 0; i <50; i++) {
			int numero = random.nextInt(50) + 1;
			colaNumeros.enqueue(numero);
			System.out.print(numero + " "); 
		}
		System.out.println("Lista de números no repetidos:");
		LinkedList listaNumerosNoRepetidos1 = obtenerNumerosNoRepetidos(colaNumeros);
		for (int i = 0; i < listaNumerosNoRepetidos1.size(); i++) {
			int numero = (int) listaNumerosNoRepetidos1.get(i);
			System.out.print(numero + " ");
		}
		// Ejercicio 3
		System.out.print("\nLos numeros aleatorios son: ");
		LinkedList listaNumeros = new LinkedList();
		for (int i = 0; i < 50; i++) {
			int numeroEjercicio3 = random.nextInt(50) + 1;
			listaNumeros.add(numeroEjercicio3);
			System.out.print(numeroEjercicio3 + " ");
		}
		ordenacionShellSort(listaNumeros);
		System.out.println("\nLista ordenada:");
		for (int i = 0; i < listaNumeros.size(); i++) {
			int numero = (int) listaNumeros.get(i);
			System.out.print(numero + " ");
		}
		double mediana = calcularMediana(listaNumeros);
		System.out.println("Mediana: " + mediana);
		LinkedList moda = calcularModa(listaNumeros);
		System.out.print("Moda: ");
		for (int i = 0; i < moda.size(); i++) {
			System.out.print(moda.get(i) + " ");
		}
		double media = calcularMediaAritmetica(listaNumeros);
		System.out.println("Media: " + media);
		//Ejercicio4
		int contador;
		System.out.print("Los numeros aleatorios son: ");
		CircularQueue colaNumerosEjercicio4 = new CircularQueue(50);
		for (int i = 0; i <50; i++) {
			int numero = random.nextInt(50) + 1;
			colaNumeros.enqueue(numero);
			System.out.print(numero + " "); 
		}
		contador=contadorNumeros25(colaNumeros);
		System.out.print("Contador:"+ contador);
		System.out.println("Cola al final:");
        imprimirCola(colaNumerosEjercicio4);


	}
	private static void imprimirCola(CircularQueue cola) {
        while (!cola.isEmpty()) {
            System.out.print(cola.dequeue() + " ");
        }
        System.out.println();
    }


	private static void procesarPalabra(String palabra, CircularQueue colaVocales, CircularQueue colaConsonantes) {
		char[] letras = palabra.toCharArray();
		int length = letras.length;
		for (int i = 0; i < length; i++) {
			char letra = letras[i];
			if (esVocal(letra)) {
				colaVocales.enqueue(letra);
			} else if (esConsonante(letra)) {
	            colaConsonantes.enqueue(letra);
	        }
		}
	}
	private static void contarYMostrarFrecuencia(String tipo, CircularQueue cola) {
		System.out.println("Frecuencia de " + tipo + ":");
		int[] frecuencia = new int[256];
		while (!cola.isEmpty()) {
			char letra = (char) cola.dequeue(); 
			frecuencia[letra]++;
		}
		for (int i = 0; i < frecuencia.length; i++) {
			if (frecuencia[i] > 0) {
				System.out.println((char) i + ": " + frecuencia[i] + " veces");
			}
		}
		System.out.println();
	}
	private static boolean esConsonante(char letra) {
	    return Character.isLetter(letra) && !esVocal(letra);
	}
	private static boolean esVocal(char letra) {
		return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
				letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U';
	}
	  private static LinkedList obtenerNumerosNoRepetidos(CircularQueue colaNumeros) throws Exception {
	        LinkedList listaNumeros = new LinkedList();

	        while (!colaNumeros.isEmpty()) {
	            int numero =(int) colaNumeros.dequeue();

	            if (!contieneNumero(listaNumeros, numero)) {
	                listaNumeros.add(numero);
	            }
	        }

	        return listaNumeros;
	    }

	    private static boolean contieneNumero(LinkedList lista, int numero)throws Exception {
	        for (int i = 0; i < lista.size(); i++) {
	            if ( (int) lista.get(i) == numero) {
	                return true;
	            }
	        }
	        return false;
	    }
	private static double calcularMediaAritmetica(LinkedList numeros)throws Exception {
		int suma = 0;
		int size = numeros.size();
		for (int i = 0; i < size; i++) {
			int numero =(int) numeros.get(i);
			suma += numero;
		}
		return (double) suma / size;
	}
	private static LinkedList calcularModa(LinkedList numeros)throws Exception {
		int[] frecuencia = new int[51]; 
		for (int i = 0; i < numeros.size(); i++) {
			int numero =(int) numeros.get(i);
			frecuencia[numero]++;
		}
		int maxFrecuencia = 0;
		for (int i = 1; i <= 50; i++) {
			if (frecuencia[i] > maxFrecuencia) {
				maxFrecuencia = frecuencia[i];
			}
		}
		LinkedList modaList = new LinkedList();
		for (int i = 1; i <= 50; i++) {
			if (frecuencia[i] == maxFrecuencia) {
				modaList.add(i);
			}
		}
		return modaList;
	}
	public static void ordenacionShellSort(LinkedList lista)throws Exception {
		int intervalo = lista.size() / 2;
		while (intervalo > 0) {
			for (int i = intervalo; i < lista.size(); i = i + 1) {
				int elemento = (int) lista.get(i);
				int j = i;
				while (j >= intervalo && (int) lista.get(j - intervalo) > elemento) {
					lista.set(j, lista.get(j - intervalo));
					j = j - intervalo;
				}
				lista.set(j, elemento);
			}
			intervalo = intervalo / 2; 
		}
	}
	private static double calcularMediana(LinkedList numeros) throws Exception {

	    int tamaño = numeros.size();
	    if (tamaño % 2 == 0) {
	        int mediana1 =(int) numeros.get(tamaño / 2 - 1);
	        int mediana2 = (int)numeros.get(tamaño / 2);
	        return (double) (mediana1 + mediana2) / 2;
	    } else {
	        return (double) numeros.get(tamaño / 2);
	    }
	}
	private static int contadorNumeros25(CircularQueue cola) {
	    int contador = 0;
	    int tamaño = cola.size();  
	    for (int i = 0; i < tamaño; i++) {
	        int numero = (int) cola.dequeue();
	        if (numero == 25) {
	            contador++;
	            cola.dequeue();
	            cola.dequeue();
	            cola.dequeue();
	        } else {
	            cola.enqueue(numero);  
	        }
	    }
	    return contador;
	}

}