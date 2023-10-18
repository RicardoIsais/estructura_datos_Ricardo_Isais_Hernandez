package Colas;
import Colas.FilaHilo;
import Colas.caja1;
import java.util.Random;
import Estructuras.pilas.Pilas;
import java.util.Scanner;
public class TareaBanco {
	public static void main(String[] args) {
		System.out.println("Banco");
	    System.out.println("Menu: \nPresione 1 para salir \nPresione 2 para ver el estado del banco");

        Pilas monedasUnPesoCaja1 = new Pilas(100);
        Pilas monedasDosPesosCaja1 = new Pilas(100);
        Pilas monedasCincoPesosCaja1 = new Pilas(100);
        Pilas monedasDiezPesosCaja1 = new Pilas(100);
        Pilas billeteVeintePesosCaja1 = new Pilas(100);
        Pilas billeteCincuentaPesosCaja1 = new Pilas(100);
        Pilas billeteCienPesosCaja1 = new Pilas(100);
        Pilas billeteDoscientosPesosCaja1 = new Pilas(100);
        Pilas billeteQuinientosPesosCaja1 = new Pilas(100);
        Pilas billeteMilPesosCaja1Caja1 = new Pilas(50);
        Billetes billete = new Billetes(monedasUnPesoCaja1, monedasDosPesosCaja1, monedasCincoPesosCaja1, monedasDiezPesosCaja1,
                                        billeteVeintePesosCaja1, billeteCincuentaPesosCaja1, billeteCienPesosCaja1,
                                        billeteMilPesosCaja1Caja1, billeteQuinientosPesosCaja1, billeteDoscientosPesosCaja1);

        caja1 caja = new caja1(null, billete);
        //
        Pilas monedasUnPesoCaja2 = new Pilas(100);
        Pilas monedasDosPesosCaja2 = new Pilas(100);
        Pilas monedasCincoPesosCaja2 = new Pilas(100);
        Pilas monedasDiezPesosCaja2 = new Pilas(100);
        Pilas billeteVeintePesosCaja2 = new Pilas(100);
        Pilas billeteCincuentaPesosCaja2 = new Pilas(100);
        Pilas billeteCienPesosCaja2 = new Pilas(100);
        Pilas billeteDoscientosPesosCaja2 = new Pilas(100);
        Pilas billeteQuinientosPesosCaja2 = new Pilas(100);
        Pilas billeteMilPesosCaja1Caja2 = new Pilas(50);
        BilletesCaja2 billeteCaja2 = new BilletesCaja2(monedasUnPesoCaja2, monedasDosPesosCaja2, monedasCincoPesosCaja2, monedasDiezPesosCaja2,
                                        billeteVeintePesosCaja2, billeteCincuentaPesosCaja2, billeteCienPesosCaja2,
                                        billeteMilPesosCaja1Caja2, billeteQuinientosPesosCaja2, billeteDoscientosPesosCaja2);

        caja2 caja2 = new caja2(null, billeteCaja2);
        //
        Pilas monedasUnPesoCaja3 = new Pilas(100);
        Pilas monedasDosPesosCaja3 = new Pilas(100);
        Pilas monedasCincoPesosCaja3 = new Pilas(100);
        Pilas monedasDiezPesosCaja3 = new Pilas(100);
        Pilas billeteVeintePesosCaja3 = new Pilas(100);
        Pilas billeteCincuentaPesosCaja3 = new Pilas(100);
        Pilas billeteCienPesosCaja3 = new Pilas(100);
        Pilas billeteDoscientosPesosCaja3 = new Pilas(100);
        Pilas billeteQuinientosPesosCaja3 = new Pilas(100);
        Pilas billeteMilPesosCaja1Caja3 = new Pilas(50);
        BilletesCaja3 billeteCaja3 = new BilletesCaja3(monedasUnPesoCaja3, monedasDosPesosCaja3, monedasCincoPesosCaja3, monedasDiezPesosCaja3,
                                        billeteVeintePesosCaja3, billeteCincuentaPesosCaja3, billeteCienPesosCaja3,
                                        billeteMilPesosCaja1Caja3, billeteQuinientosPesosCaja3, billeteDoscientosPesosCaja3);

        caja3 caja3 = new caja3(null, billeteCaja3);
        //
        Pilas monedasUnPesoCaja4 = new Pilas(100);
        Pilas monedasDosPesosCaja4 = new Pilas(100);
        Pilas monedasCincoPesosCaja4 = new Pilas(100);
        Pilas monedasDiezPesosCaja4 = new Pilas(100);
        Pilas billeteVeintePesosCaja4 = new Pilas(100);
        Pilas billeteCincuentaPesosCaja4 = new Pilas(100);
        Pilas billeteCienPesosCaja4 = new Pilas(100);
        Pilas billeteDoscientosPesosCaja4 = new Pilas(100);
        Pilas billeteQuinientosPesosCaja4 = new Pilas(100);
        Pilas billeteMilPesosCaja1Caja4 = new Pilas(50);
        BilletesCaja4 billeteCaja4 = new BilletesCaja4(monedasUnPesoCaja4, monedasDosPesosCaja4, monedasCincoPesosCaja4, monedasDiezPesosCaja4,
                                        billeteVeintePesosCaja4, billeteCincuentaPesosCaja4, billeteCienPesosCaja4,
                                        billeteMilPesosCaja1Caja4, billeteQuinientosPesosCaja4, billeteDoscientosPesosCaja4);

        caja4 caja4 = new caja4(null,billeteCaja4);
        
        
        
        FilaHilo hilo = new FilaHilo();
        hilo.start();
        BooleanPriorityQueue cola = hilo.getQueue();
	    Thread menu = new Thread(new Runnable() {
	        public void run() {
	            Scanner scanner = new Scanner(System.in);
	            String opcion;
	            while (true) {
	                opcion = scanner.nextLine();
	                if (opcion.equals("1")) {
	                	
	                    System.out.println("Fin del programa");
	                    System.exit(0); 
	                }
	                else if (opcion.equals("2")) {
	                	System.out.println("Informacion del banco:");
	                    String filaClientesEnEspera = hilo.getFilaClientesEnEspera();
	                    System.out.println("Fila de clientes en espera:");
	                    System.out.println(filaClientesEnEspera);
	                    if (!caja.estaEnOperacion()) {
                            System.out.println("Caja 1 está ocupada.");
                        } else {
                            System.out.println("Caja 1 no está ocupada.");
                            }
	                    if (!caja2.estaEnOperacion()) {
                            System.out.println("Caja 2 está ocupada.");
                        } else {
                            System.out.println("Caja 2 no está ocupada.");
                            }
	                    if (!caja3.estaEnOperacion()) {
                            System.out.println("Caja 3 está ocupada.");
                        } else {
                            System.out.println("Caja 3 no está ocupada.");
                            }
	                    if (!caja4.estaEnOperacion()) {
                            System.out.println("Caja 4 está ocupada.");
                        } else {
                            System.out.println("Caja 4 no está ocupada.");
                            }
	                    caja.mostrarCantidadEnCaja();
	                    caja2.mostrarCantidadEnCaja();
	                    caja3.mostrarCantidadEnCaja();
	                    caja4.mostrarCantidadEnCaja();
	                    
	                }
	                


	                
	            }
	        }
	    });

	    menu.start();
	    cajas(cola,caja,caja2,caja3,caja4,billete,billeteCaja2,billeteCaja3,billeteCaja4);
	}
	public static void cajas(BooleanPriorityQueue cola, caja1 caja, caja2 caja2, caja3 caja3, caja4 caja4, Billetes billete, BilletesCaja2 billeteCaja2, BilletesCaja3 billeteCaja3, BilletesCaja4 billeteCaja4) {
	    while (true) {
	        if (!cola.isEmpty()) {
	            Cliente cliente = (Cliente) cola.dequeue();
                
	            if (!caja.estaEnOperacion()) {
	                caja = new caja1(cliente, billete);
	                caja.start();
	            } else if (!caja2.estaEnOperacion()) {
	                caja2 = new caja2(cliente, billeteCaja2);
	                caja2.start();
	            } else if (!caja3.estaEnOperacion()) {
	                caja3 = new caja3(cliente, billeteCaja3);
	                caja3.start();
	            } else if (!caja4.estaEnOperacion()) {
	                caja4 = new caja4(cliente, billeteCaja4);
	                caja4.start();
	            }
	        }

	        try {
	            Random random = new Random();
	            int tiempoAleatorio = random.nextInt(10); 
	            Thread.sleep(tiempoAleatorio);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}
}
