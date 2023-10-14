package Colas;
import java.util.Random;
import Estructuras.pilas.Pilas;

public class Cliente {
	private long numeroCuenta;
	private String movimiento;
	private double monto;
	private boolean prioridad;
	private Pilas monedasDelCliente;

	public Cliente() {
		Random random = new Random();
		this.numeroCuenta = Math.abs(random.nextLong() % 1000000000000L);
		this.movimiento = random.nextBoolean() ? "Deposito" : "Retiro";

		if (this.movimiento.equals("Deposito")) {
			this.monedasDelCliente = new Pilas (30); 
			this.monto = generarMontoDeposito();
		} else {
			this.monto = Math.round(Math.random() * 9000);
		}

		this.prioridad = random.nextBoolean();
	}

	private double generarMontoDeposito() {
		Random random = new Random();
		int[] denominaciones = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
		double montoDeposito = 0;

		for (int i = 0; i < 5; i++) { 
			int denominacionAleatoria = denominaciones[random.nextInt(denominaciones.length)];
			monedasDelCliente.push(denominacionAleatoria);
			montoDeposito += denominacionAleatoria;
		}

		return montoDeposito;
	}

	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	public String getMovimiento() {
		return movimiento;
	}

	public double getMonto() {
		return monto;
	}

    public boolean Prioridad() {
        return prioridad;
    }

    public Pilas getMonedasDelCliente() {
        return monedasDelCliente;
    }
}
