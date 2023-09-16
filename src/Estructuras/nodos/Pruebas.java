package Estructuras.nodos;
import Colas.LinkedQueue;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedQueue circulo = new LinkedQueue();
		circulo.enqueue(1);
		System.out.print(circulo.front());
		circulo.enqueue(2);
		System.out.print(circulo.front());
		circulo.enqueue(3);
		System.out.print(circulo.front());
		circulo.dequeue();
		System.out.print(circulo.front());
		circulo.dequeue();
		System.out.print(circulo.front());
		

	}

}
