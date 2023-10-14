package Colas;
import Colas.NumericPriorityQueue;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumericPriorityQueue queue = new NumericPriorityQueue();

        // Agregar elementos a la cola con prioridad
        queue.enqueue("i", 7);

        
        queue.enqueue("B", 1);
        queue.enqueue("C", 5);
        queue.enqueue("D", 3);
        queue.enqueue("P", 8);
        queue.enqueue("T", 9);

        // Mostrar el contenido de la cola
        System.out.println("Contenido de la cola: " + queue.toString());

        // Extraer elementos de la cola


        // Mostrar el nuevo contenido de la cola
        System.out.println("Contenido de la cola después de extraer elementos: " + queue.toString());
		

	}

}
