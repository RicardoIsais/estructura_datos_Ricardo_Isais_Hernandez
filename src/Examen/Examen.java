
package Examen;
import java.util.Scanner;
import java.util.Random;
import Colas.CircularQueue;
import Estructuras.pilas.Pilas;
public class Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroAleatorio;
		Random aleatorio = new Random();
		System.out.println("Actividad 1: ");
		sumarNumerosAleatorios();
		System.out.println("Actividad 2: ");
		Pilas pilaNumeros = new Pilas (100);
		for (int i = 0; i <=10; i++) {
			System.out.println("Los numeros aleatorios son: ");
			numeroAleatorio = aleatorio.nextInt(100);
			System.out.println(i+". "+numeroAleatorio + " ");  
			pilaNumeros.push(numeroAleatorio);
		}
		realizarOperaciones(sumarParejas(pilaNumeros));
		System.out.println("Actividad 3: ");
		CircularQueue colaNumeros=new CircularQueue(50);
		for (int i = 0; i <=50; i++) {
			System.out.println("Los numeros aleatorios son: ");
			numeroAleatorio = aleatorio.nextInt(50);
			System.out.println(i+". "+numeroAleatorio + " "); 
			colaNumeros.enqueue(numeroAleatorio);
		}
		System.out.println("Números no repetidos:");
	    for (int numero : numerosNoRepetidos(colaNumeros)) {
	        System.out.print(numero + " ");
	    }
	    System.out.print(" ");
	    System.out.println("Actividad 4: ");
	    CircularQueue colaNumeros2=new CircularQueue(50);
		for (int i = 0; i <=50; i++) {
			System.out.println("Los numeros aleatorios son: ");
			numeroAleatorio = aleatorio.nextInt(50);
			System.out.println(i+". "+numeroAleatorio + " "); 
			colaNumeros2.enqueue(numeroAleatorio);
		}
		System.out.println("contador de numeros 25: "+numeros25(colaNumeros2));
	}
	
	public static void sumarNumerosAleatorios() {
		Pilas pila = new Pilas (100);
		Random aleatorio = new Random();
		int numeroAleatorio=0;
		int suma = 0;
		for (int i = 0; i <100; i++) {
			System.out.println("Los numeros aleatorios son: ");
			numeroAleatorio = aleatorio.nextInt(100);
			if (numeroAleatorio!=50) {
				System.out.println(i+". "+numeroAleatorio + " "); 
				pila.push(numeroAleatorio);	
			}
			if (numeroAleatorio==50)
			{
				System.out.println("Se encontro un 50");
				while (!pila.isEmpty()) {
					suma =suma+(int) pila.pop();
					
				}
				System.out.println("Suma: "+suma);
				break;
			}
			
		}
    }
	public static Pilas sumarParejas(Pilas pila) {
        Pilas nuevaPila = new Pilas(10);

        while ((int) pila.size() >= 2) {
            int numero1 =(int) pila.pop();
            int numero2 = (int)pila.pop();
            int suma = numero1 + numero2;
            nuevaPila.push(suma);
        }

        if (!pila.isEmpty()) {
            nuevaPila.push(pila.pop());
        }

        return nuevaPila;
    }
	public static void realizarOperaciones(Pilas pila) {
        int resultado = 0;
        if (pila.size() >= 2) {
            int numero1 = (int)pila.pop();
            int numero2 = (int)pila.pop();
            int valorCima = (int)pila.peek();
            System.out.println("Operación: "+"("+numero1 +"-"+ numero2+")"+"*"+valorCima);
            resultado = (numero1 - numero2) * valorCima;
            pila.pop();
            System.out.println("Operación: "+resultado +"+"+ (int)pila.peek());
            resultado +=  (int)pila.peek();
            pila.pop();
            System.out.println("Operación: "+resultado +"-"+ (int)pila.peek());
            resultado -= (int) pila.peek();
            pila.pop();
        }
        System.out.println("resultado final: "+resultado);
    }
	public static int[] numerosNoRepetidos(CircularQueue cola) {
		int[] arreglo = new int[50];
		int[] lista = new int[50];
		int contador = 0;
		for (int i = 0; i < cola.size(); i++) {
			int numero = (int) cola.dequeue();

			boolean repetido = false;
			for (int j = 0; j < i; j++) {
				if (numero == arreglo[j]) {
					repetido = true;
					break;
				}
			}

			if (!repetido) {
				arreglo[i] = numero;
				lista[contador] = numero;
				contador++;
			} else {

				cola.enqueue(numero);
			}
		}
		int[] numerosNoRepetidos = new int[contador];
		System.arraycopy(lista, 0, numerosNoRepetidos, 0, contador);
		return numerosNoRepetidos;
	}
	public static int numeros25(CircularQueue cola) {
		int contador=0;
		for (int i = 0; i < cola.size(); i++) {
			int numero=(int)cola.dequeue();
			if (numero==25) {
				cola.dequeue();
				cola.dequeue();
				cola.dequeue();
				contador++;
			}
			else {
				numero=(int)cola.dequeue();
				
			}
			
		}
		return contador;	
	}
}
