package Colas;

import Colas.BooleanPriorityQueue;
import Colas.Cliente;

import java.util.Random;

class FilaHilo extends Thread {
	BooleanPriorityQueue queue = new BooleanPriorityQueue();


	public void run() {
		while(true) {
			try {
				Cliente cliente = new Cliente();
				queue.enqueue(cliente, cliente.Prioridad());
				//System.out.println("Cliente formado: " + cliente.getNumeroCuenta()+" |"+"Prioridad: "+cliente.Prioridad() +" |"+"Movimiento: "+ cliente.getMovimiento()+" |"+"Monto: "+cliente.getMonto()+" |"+"Monedas: "+ cliente.getMonedasDelCliente());

				Random random = new Random();
				int tiempoAleatorio = random.nextInt(1) + 1000; 
				Thread.sleep(tiempoAleatorio);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// while (!queue.isEmpty()) {
		//   Cliente cliente = (Cliente) queue.dequeue();
		// System.out.println("Fila: " + cliente.getNumeroCuenta() + cliente.getMovimiento() + cliente.getMonto()+ cliente.Prioridad());
		//}
	}
	public BooleanPriorityQueue getQueue() {
		return queue;
	}

	public String getFilaClientesEnEspera() {
	    String result = "";
	    int originalSize = queue.size();
	    BooleanPriorityQueue tempQueue = new BooleanPriorityQueue(); 

	    for (int i = 0; i < originalSize; i++) {
	        Cliente cliente = (Cliente) queue.dequeue(); 
	        result += "Cliente: " + cliente.getNumeroCuenta() +
	                  " | Prioridad: " + cliente.Prioridad() +
	                  " | Movimiento: " + cliente.getMovimiento() +
	                  " | Monto: " + cliente.getMonto() +
	                  " | Monedas: " + cliente.getMonedasDelCliente() + System.lineSeparator();

	        tempQueue.enqueue(cliente, cliente.Prioridad()); 
	    }

	    
	    for (int i = 0; i < originalSize; i++) {
	        Cliente cliente = (Cliente) tempQueue.dequeue();
	        queue.enqueue(cliente, cliente.Prioridad());
	    }

	    return result;
	}
}
