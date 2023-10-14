package Colas;
import Colas.Cliente;
import Colas.BilletesCaja3;
import Estructuras.pilas.Pilas;
import java.util.Random;
public class caja3 extends Thread {
    private boolean enOperacion = false;
    private Cliente cliente;
    private BilletesCaja3 billete;
    private Pilas monedasUnPeso;
    private Pilas monedasDosPesos;
    private Pilas monedasCincoPesos;
    private Pilas monedasDiezPesos;
    private Pilas billeteVeintePesos;
    private Pilas billeteCincuentaPesos;
    private Pilas billeteCienPesos;
    private Pilas billeteDoscientosPesos;
    private Pilas billeteQuinientosPesos;
    private Pilas billeteMilPesos;

    public caja3(Cliente cliente, BilletesCaja3 billete) {
        this.cliente = cliente;
        this.billete = billete;
        
        monedasUnPeso = billete.getMonedasUnPeso();
        monedasDosPesos = billete.getMonedasDosPesos();
        monedasCincoPesos = billete.getMonedasCincoPesos();
        monedasDiezPesos = billete.getMonedasDiezPesos();
        billeteVeintePesos = billete.getBilleteVeintePesos();
        billeteCincuentaPesos = billete.getBilleteCincuentaPesos();
        billeteCienPesos = billete.getBilleteCienPesos();
        billeteDoscientosPesos = billete.getBilleteDoscientosPesos();
        billeteQuinientosPesos = billete.getBilleteQuinientosPesos();
        billeteMilPesos = billete.getBilleteMilPesos();
    }
	public void run() {
		
		
		
		while (enOperacion) {
		}
		enOperacion = true;
		System.out.println("Caja 3:");

		if (cliente.getMovimiento().equals("Retiro")) {
			System.out.println("Cliente " + cliente.getNumeroCuenta() + " está realizando un Retiro de $" + cliente.getMonto());
			procesarRetiro(cliente);

			
			//billetera.realizarOperacion(cliente);
		} else {
			System.out.println("Cliente " + cliente.getNumeroCuenta() + " está realizando un Depósito de $" + cliente.getMonto());
			procesarDeposito(cliente);
		}
		try {
			Random random = new Random();
			int tiempoAleatorio = random.nextInt(10000) + 1000;
			Thread.sleep(tiempoAleatorio);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Cliente " + cliente.getNumeroCuenta() + " ha realizado la operación.");
		mostrarCantidadEnCaja();
		enOperacion = false;
	}
	public boolean estaEnOperacion() {
		return enOperacion;
	}
	private void procesarDeposito(Cliente cliente) {
		Pilas monedasDelCliente = cliente.getMonedasDelCliente();

		while (!monedasDelCliente.isEmpty()) {
			if (monedasDosPesos.size() == 100 || monedasUnPeso.size() == 100 || monedasCincoPesos.size() == 100 || monedasDiezPesos.size() == 100 || billeteVeintePesos.size() == 100 || billeteCincuentaPesos.size() == 100 || billeteCienPesos.size() == 100 || billeteQuinientosPesos.size() == 100 || billeteDoscientosPesos.size() == 100 || billeteMilPesos.size() == 100) {
				for (int i = 0; i < 10; i++) {
				    billeteDoscientosPesos.pop();
				    billeteQuinientosPesos.pop();
				    billeteMilPesos.pop();
				    billeteCienPesos.pop();
				    billeteCincuentaPesos.pop();
				    billeteVeintePesos.pop();
				    monedasUnPeso.pop();
				    monedasDosPesos.pop();
				    monedasCincoPesos.pop();
				    monedasDiezPesos.pop();
				}
			}
			double valorMoneda = ((Integer) monedasDelCliente.pop()).doubleValue();
			if (valorMoneda == 1.0) {
				monedasUnPeso.push(valorMoneda);
			} else if (valorMoneda == 2.0) {
				monedasDosPesos.push(valorMoneda);
			} else if (valorMoneda == 5.0) {
				monedasCincoPesos.push(valorMoneda);
			} else if (valorMoneda == 10.0) {
				monedasDiezPesos.push(valorMoneda);
			} else if (valorMoneda == 20.0) {
				billeteVeintePesos.push(valorMoneda);
			} else if (valorMoneda == 50.0) {
				billeteCincuentaPesos.push(valorMoneda);
			} else if (valorMoneda == 100.0) {
				billeteCienPesos.push(valorMoneda);
			} else if (valorMoneda == 200.0) {
				billeteDoscientosPesos.push(valorMoneda);
			} else if (valorMoneda == 500.0) {
				billeteQuinientosPesos.push(valorMoneda);
			} else if (valorMoneda == 1000.0) {
				billeteMilPesos.push(valorMoneda);
			}
		
		}
		billete.setMonedasUnPeso(monedasUnPeso);
		billete.setMonedasDosPesos(monedasDosPesos);
		billete.setMonedasCincoPesos(monedasCincoPesos);
		billete.setMonedasDiezPesos(monedasDiezPesos);
		billete.setBilleteVeintePesos(billeteVeintePesos);
		billete.setBilleteCincuentaPesos(billeteCincuentaPesos);
		billete.setBilleteCienPesos(billeteCienPesos);
		billete.setBilleteDoscientosPesos(billeteDoscientosPesos);
		billete.setBilleteQuinientosPesos(billeteQuinientosPesos);
		billete.setBilleteMilPesos(billeteMilPesos);
	}
	private void procesarRetiro(Cliente cliente) {
	    Pilas monedasDelCliente = cliente.getMonedasDelCliente();
	    double monto = cliente.getMonto();
	    
	    while (monto >= 0) {
	    	if (monedasDosPesos.isEmpty() || monedasUnPeso.isEmpty()||monedasCincoPesos.isEmpty() || monedasDiezPesos.isEmpty() ||billeteVeintePesos.isEmpty()|| billeteCincuentaPesos.isEmpty()  || billeteCienPesos.isEmpty() || billeteQuinientosPesos.isEmpty() || billeteDoscientosPesos.isEmpty() || billeteMilPesos.isEmpty() ){
				billeteDoscientosPesos.push(200.0);
				billeteDoscientosPesos.push(200.0);
				billeteDoscientosPesos.push(200.0);
				billeteDoscientosPesos.push(200.0);
				billeteDoscientosPesos.push(200.0);
				billeteDoscientosPesos.push(200.0);
				billeteDoscientosPesos.push(200.0);
				billeteDoscientosPesos.push(200.0);
				billeteDoscientosPesos.push(200.0);
				billeteDoscientosPesos.push(200.0);
				billeteQuinientosPesos.push(500.0);
				billeteQuinientosPesos.push(500.0);
				billeteQuinientosPesos.push(500.0);
				billeteQuinientosPesos.push(500.0);
				billeteQuinientosPesos.push(500.0);
				billeteQuinientosPesos.push(500.0);
				billeteQuinientosPesos.push(500.0);
				billeteQuinientosPesos.push(500.0);
				billeteQuinientosPesos.push(500.0);
				billeteQuinientosPesos.push(500.0);
				billeteMilPesos.push(1000.0);
				billeteMilPesos.push(1000.0);
				billeteMilPesos.push(1000.0);
				billeteMilPesos.push(1000.0);
				billeteMilPesos.push(1000.0);
				billeteMilPesos.push(1000.0);
				billeteMilPesos.push(1000.0);
				billeteMilPesos.push(1000.0);
				billeteMilPesos.push(1000.0);	   
				billeteMilPesos.push(1000.0);
				billeteCienPesos.push(100.0);
				billeteCienPesos.push(100.0);
				billeteCienPesos.push(100.0);
				billeteCienPesos.push(100.0);
				billeteCienPesos.push(100.0);
				billeteCienPesos.push(100.0);
				billeteCienPesos.push(100.0);
				billeteCienPesos.push(100.0);
				billeteCienPesos.push(100.0);
				billeteCienPesos.push(100.0);
				billeteCincuentaPesos.push(50.0);
				billeteCincuentaPesos.push(50.0);
				billeteCincuentaPesos.push(50.0);
				billeteCincuentaPesos.push(50.0);
				billeteCincuentaPesos.push(50.0);
				billeteCincuentaPesos.push(50.0);
				billeteCincuentaPesos.push(50.0);
				billeteCincuentaPesos.push(50.0);
				billeteCincuentaPesos.push(50.0);
				billeteCincuentaPesos.push(50.0);
				billeteVeintePesos.push(20.0);
				billeteVeintePesos.push(20.0);
				billeteVeintePesos.push(20.0);
				billeteVeintePesos.push(20.0);
				billeteVeintePesos.push(20.0);
				billeteVeintePesos.push(20.0);
				billeteVeintePesos.push(20.0);
				billeteVeintePesos.push(20.0);
				billeteVeintePesos.push(20.0);
				billeteVeintePesos.push(20.0);
				monedasUnPeso.push(1.0);
				monedasUnPeso.push(1.0);
				monedasUnPeso.push(1.0);
				monedasUnPeso.push(1.0);
				monedasUnPeso.push(1.0);
				monedasUnPeso.push(1.0);
				monedasUnPeso.push(1.0);
				monedasUnPeso.push(1.0);
				monedasUnPeso.push(1.0);
				monedasUnPeso.push(1.0);
				monedasDosPesos.push(2.0);
				monedasDosPesos.push(2.0);
				monedasDosPesos.push(2.0);
				monedasDosPesos.push(2.0);
				monedasDosPesos.push(2.0);
				monedasDosPesos.push(2.0);
				monedasDosPesos.push(2.0);
				monedasDosPesos.push(2.0);
				monedasDosPesos.push(2.0);
				monedasDosPesos.push(2.0);
				monedasCincoPesos.push(5.0);
				monedasCincoPesos.push(5.0);
				monedasCincoPesos.push(5.0);
				monedasCincoPesos.push(5.0);
				monedasCincoPesos.push(5.0);
				monedasCincoPesos.push(5.0);
				monedasCincoPesos.push(5.0);
				monedasCincoPesos.push(5.0);
				monedasCincoPesos.push(5.0);
				monedasCincoPesos.push(5.0);
				monedasDiezPesos.push(10.0);
				monedasDiezPesos.push(10.0);
				monedasDiezPesos.push(10.0);
				monedasDiezPesos.push(10.0);
				monedasDiezPesos.push(10.0);
				monedasDiezPesos.push(10.0);
				monedasDiezPesos.push(10.0);
				monedasDiezPesos.push(10.0);
				monedasDiezPesos.push(10.0);
				monedasDiezPesos.push(10.0);
	    	}
	        if (monto >= 1000.0 && !billeteMilPesos.isEmpty()) {
	            double moneda = (double) billeteMilPesos.pop();
	            monto -= moneda;
	        } else if (monto >= 500.0 && !billeteQuinientosPesos.isEmpty()) {
	            double moneda = (double) billeteQuinientosPesos.pop();
	            monto -= moneda;
	        } else if (monto >= 200.0 && !billeteDoscientosPesos.isEmpty()) {
	            double moneda = (double) billeteDoscientosPesos.pop();
	            monto -= moneda;
	        } else if (monto >= 100.0 && !billeteCienPesos.isEmpty()) {
	            double moneda = (double) billeteCienPesos.pop();
	            monto -= moneda;
	        } else if (monto >= 50.0 && !billeteCincuentaPesos.isEmpty()) {
	            double moneda = (double) billeteCincuentaPesos.pop();
	            monto -= moneda;
	        } else if (monto >= 20.0 && !billeteVeintePesos.isEmpty()) {
	            double moneda = (double) billeteVeintePesos.pop();
	            monto -= moneda;
	        } else if (monto >= 10.0 && !monedasDiezPesos.isEmpty()) {
	            double moneda = (double) monedasDiezPesos.pop();
	            monto -= moneda;
	        } else if (monto >= 5.0 && !monedasCincoPesos.isEmpty()) {
	            double moneda = (double) monedasCincoPesos.pop();
	            monto -= moneda;
	        } else if (monto >= 2.0 && !monedasDosPesos.isEmpty()) {
	            double moneda = (double) monedasDosPesos.pop();
	            monto -= moneda;
	        } else if (monto >= 1.0 && !monedasUnPeso.isEmpty()) {
	            double moneda = (double) monedasUnPeso.pop();
	            monto -= moneda;
	        } else {
	            // La pila está vacía, por lo que necesitas llenarla aquí.
	            // Llena la pila según tu lógica para agregar billetes o monedas.
	            break;
	        }
	    }
	    
	    billete.setMonedasUnPeso(monedasUnPeso);
	    billete.setMonedasDosPesos(monedasDosPesos);
	    billete.setMonedasCincoPesos(monedasCincoPesos);
	    billete.setMonedasDiezPesos(monedasDiezPesos);
	    billete.setBilleteVeintePesos(billeteVeintePesos);
	    billete.setBilleteCincuentaPesos(billeteCincuentaPesos);
	    billete.setBilleteCienPesos(billeteCienPesos);
	    billete.setBilleteDoscientosPesos(billeteDoscientosPesos);
	    billete.setBilleteQuinientosPesos(billeteQuinientosPesos);
	    billete.setBilleteMilPesos(billeteMilPesos);
	}
	private void mostrarCantidadEnCaja() {
		System.out.println("Cantidad de monedas en la caja 3:");
		System.out.println("Monedas de 1 peso: " + monedasUnPeso.size());
		System.out.println("Monedas de 2 pesos: " + monedasDosPesos.size());
		System.out.println("Monedas de 5 pesos: " + monedasCincoPesos.size());
		System.out.println("Monedas de 10 pesos: " + monedasDiezPesos.size());
		System.out.println("Billetes de 20 pesos: " + billeteVeintePesos.size());
		System.out.println("Billetes de 50 pesos: " + billeteCincuentaPesos.size());
		System.out.println("Billetes de 100 pesos: " + billeteCienPesos.size());
		System.out.println("Billetes de 1000 pesos: " + billeteMilPesos.size());
		System.out.println("Billetes de 500 pesos: " + billeteQuinientosPesos.size());
		System.out.println("Billetes de 200 pesos: " + billeteDoscientosPesos.size());
	}


}
