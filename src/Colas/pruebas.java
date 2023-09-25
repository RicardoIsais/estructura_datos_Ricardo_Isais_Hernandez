package Colas;
import Colas.BooleanPriorityQueue;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BooleanPriorityQueue cola=new BooleanPriorityQueue();
		cola.enqueue(1, false);
		cola.enqueue(2, false);
		cola.enqueue(3, false);
		cola.enqueue(4, false);
		cola.enqueue(5, true);
		
		
		System.out.print(cola.toString());
		

	}

}
