package JuegoProyectoFinal;
import Estructuras.pilas.Pilas;
import java.util.Random;
import java.util.ArrayList;



public class BarajaDeCartas {
	
	public Pilas mazoDeCartas() {
		Pilas mazoCartasTotal = new Pilas(104);
		mazoCartasTotal.push(new Carta("1","rojo"));
		mazoCartasTotal.push(new Carta("2","rojo"));
		mazoCartasTotal.push(new Carta("3","rojo"));
		mazoCartasTotal.push(new Carta("4","rojo"));
		mazoCartasTotal.push(new Carta("5","rojo"));
		mazoCartasTotal.push(new Carta("6","rojo"));
		mazoCartasTotal.push(new Carta("7","rojo"));
		mazoCartasTotal.push(new Carta("8","rojo"));
		mazoCartasTotal.push(new Carta("9","rojo"));
		mazoCartasTotal.push(new Carta("Saltar","rojo"));
		mazoCartasTotal.push(new Carta("+2","rojo"));
		mazoCartasTotal.push(new Carta("Reversa","rojo"));
		mazoCartasTotal.push(new Carta("1","amarillo"));
		mazoCartasTotal.push(new Carta("2","amarillo"));
		mazoCartasTotal.push(new Carta("3","amarillo"));
		mazoCartasTotal.push(new Carta("4","amarillo"));
		mazoCartasTotal.push(new Carta("5","amarillo"));
		mazoCartasTotal.push(new Carta("6","amarillo"));
		mazoCartasTotal.push(new Carta("7","amarillo"));
		mazoCartasTotal.push(new Carta("8","amarillo"));
		mazoCartasTotal.push(new Carta("9","amarillo"));
		mazoCartasTotal.push(new Carta("Saltar","amarillo"));
		mazoCartasTotal.push(new Carta("+2","amarillo"));
		mazoCartasTotal.push(new Carta("Reversa","amarillo"));
		mazoCartasTotal.push(new Carta("1","azul"));
		mazoCartasTotal.push(new Carta("2","azul"));
		mazoCartasTotal.push(new Carta("3","azul"));
		mazoCartasTotal.push(new Carta("4","azul"));
		mazoCartasTotal.push(new Carta("5","azul"));
		mazoCartasTotal.push(new Carta("6","azul"));
		mazoCartasTotal.push(new Carta("7","azul"));
		mazoCartasTotal.push(new Carta("8","azul"));
		mazoCartasTotal.push(new Carta("9","azul"));
		mazoCartasTotal.push(new Carta("Saltar","azul"));
		mazoCartasTotal.push(new Carta("+2","azul"));
		mazoCartasTotal.push(new Carta("Reversa","azul"));
		mazoCartasTotal.push(new Carta("1","verde"));
		mazoCartasTotal.push(new Carta("2","verde"));
		mazoCartasTotal.push(new Carta("3","verde"));
		mazoCartasTotal.push(new Carta("4","verde"));
		mazoCartasTotal.push(new Carta("5","verde"));
		mazoCartasTotal.push(new Carta("6","verde"));
		mazoCartasTotal.push(new Carta("7","verde"));
		mazoCartasTotal.push(new Carta("8","verde"));
		mazoCartasTotal.push(new Carta("9","verde"));
		mazoCartasTotal.push(new Carta("Saltar","verde"));
		mazoCartasTotal.push(new Carta("+2","verde"));
		mazoCartasTotal.push(new Carta("Reversa","verde"));
		mazoCartasTotal.push(new Carta("Cambio de color"," "));
		mazoCartasTotal.push(new Carta("Cambio de color"," "));
		mazoCartasTotal.push(new Carta("+4"," "));
		mazoCartasTotal.push(new Carta("+4",""));
		mazoCartasTotal.push(new Carta("1","rojo"));
		mazoCartasTotal.push(new Carta("2","rojo"));
		mazoCartasTotal.push(new Carta("3","rojo"));
		mazoCartasTotal.push(new Carta("4","rojo"));
		mazoCartasTotal.push(new Carta("5","rojo"));
		mazoCartasTotal.push(new Carta("6","rojo"));
		mazoCartasTotal.push(new Carta("7","rojo"));
		mazoCartasTotal.push(new Carta("8","rojo"));
		mazoCartasTotal.push(new Carta("9","rojo"));
		mazoCartasTotal.push(new Carta("Saltar","rojo"));
		mazoCartasTotal.push(new Carta("+2","rojo"));
		mazoCartasTotal.push(new Carta("Reversa","rojo"));
		mazoCartasTotal.push(new Carta("1","amarillo"));
		mazoCartasTotal.push(new Carta("2","amarillo"));
		mazoCartasTotal.push(new Carta("3","amarillo"));
		mazoCartasTotal.push(new Carta("4","amarillo"));
		mazoCartasTotal.push(new Carta("5","amarillo"));
		mazoCartasTotal.push(new Carta("6","amarillo"));
		mazoCartasTotal.push(new Carta("7","amarillo"));
		mazoCartasTotal.push(new Carta("8","amarillo"));
		mazoCartasTotal.push(new Carta("9","amarillo"));
		mazoCartasTotal.push(new Carta("Saltar","amarillo"));
		mazoCartasTotal.push(new Carta("+2","amarillo"));
		mazoCartasTotal.push(new Carta("Reversa","amarillo"));
		mazoCartasTotal.push(new Carta("1","azul"));
		mazoCartasTotal.push(new Carta("2","azul"));
		mazoCartasTotal.push(new Carta("3","azul"));
		mazoCartasTotal.push(new Carta("4","azul"));
		mazoCartasTotal.push(new Carta("5","azul"));
		mazoCartasTotal.push(new Carta("6","azul"));
		mazoCartasTotal.push(new Carta("7","azul"));
		mazoCartasTotal.push(new Carta("8","azul"));
		mazoCartasTotal.push(new Carta("9","azul"));
		mazoCartasTotal.push(new Carta("Saltar","azul"));
		mazoCartasTotal.push(new Carta("+2","azul"));
		mazoCartasTotal.push(new Carta("Reversa","azul"));
		mazoCartasTotal.push(new Carta("1","verde"));
		mazoCartasTotal.push(new Carta("2","verde"));
		mazoCartasTotal.push(new Carta("3","verde"));
		mazoCartasTotal.push(new Carta("4","verde"));
		mazoCartasTotal.push(new Carta("5","verde"));
		mazoCartasTotal.push(new Carta("6","verde"));
		mazoCartasTotal.push(new Carta("7","verde"));
		mazoCartasTotal.push(new Carta("8","verde"));
		mazoCartasTotal.push(new Carta("9","verde"));
		mazoCartasTotal.push(new Carta("Saltar","verde"));
		mazoCartasTotal.push(new Carta("+2","verde"));
		mazoCartasTotal.push(new Carta("Reversa","verde"));
		mazoCartasTotal.push(new Carta("Cambio de color"," "));
		mazoCartasTotal.push(new Carta("Cambio de color"," "));
		mazoCartasTotal.push(new Carta("+4",""));
		mazoCartasTotal.push(new Carta("+4",""));
		return mazoCartasTotal;	
	}
	public Pilas mezclarMazo(Pilas mazoCartasTotal) {
	    Random rand = new Random();
	    Pilas mazoMezclado = new Pilas(mazoCartasTotal.size());
	    ArrayList cartasOriginales = new ArrayList(mazoCartasTotal.size());
	    while (!mazoCartasTotal.isEmpty()) {
	        Carta carta =(Carta) mazoCartasTotal.pop();
	        cartasOriginales.add(carta);
	    }
	    while (!cartasOriginales.isEmpty()) {
	        int randomIndex = rand.nextInt(cartasOriginales.size());
	        Carta carta =(Carta) cartasOriginales.remove(randomIndex);
	        mazoMezclado.push(carta);
	    }
	    return mazoMezclado;
	}
	
	public Pilas mazoJugador(Pilas mazoCartasMezclado) {
		Pilas mazoJugador = new Pilas(24);
		for (int i=0;i<7;i++) {
			Carta carta = (Carta) mazoCartasMezclado.pop();
			mazoJugador.push(carta);			
		}
		return mazoJugador;
	}

	
	
	

}
