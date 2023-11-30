package JuegoProyectoFinal;

public class Carta {
	private String valor;
	private String color;
	public Carta (String valor, String color) {
		this.valor=valor;
		this.color=color;
	}
	public String getValor() {
		return valor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String nuevoColor) {
		this.color=nuevoColor;
	}
	public void setValor(String nuevoValor) {
		this.valor=nuevoValor;
	}
	
}
