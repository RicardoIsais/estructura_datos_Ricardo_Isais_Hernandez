package JuegoProyectoFinal;
import java.util.Scanner;
import java.util.Random;

import Estructuras.pilas.Pilas;
import JuegoProyectoFinal.BarajaDeCartas;
import JuegoProyectoFinal.Carta;
import java.util.Scanner;
public class JuegoPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner scanner = new Scanner(System.in);
	        BarajaDeCartas baraja = new BarajaDeCartas();
	        Pilas mazoCartasTotal = baraja.mazoDeCartas();
	        Pilas mazoMezclado = baraja.mezclarMazo(mazoCartasTotal);
	        Pilas mazoJugador1 = baraja.mazoJugador(mazoMezclado);
	        Pilas mazoJugador2 = baraja.mazoJugador(mazoMezclado);
	        Carta[] mazoJugador1Arreglo = new Carta[24];
	        Carta[] mazoJugador2Arreglo = new Carta[24];
	        for (int i = 0; i < 7; i++) {
	            mazoJugador1Arreglo[i] = (Carta) mazoJugador1.pop();
	            mazoJugador2Arreglo[i] = (Carta) mazoJugador2.pop();
	        }
	        Carta cartaInicial = null;
	        Carta cartaJuego = null;
	        boolean cartaInicialAceptada = true;
	        boolean turnoJugador1 = true;
	        while (cartaInicialAceptada) {
	            Carta carta = (Carta) mazoMezclado.pop();
	            if (!carta.getValor().equals("+4") && !carta.getValor().equals("Cambio de color")
	                    && !carta.getValor().equals("Saltar") && !carta.getValor().equals("Reversa")
	                    && !carta.getValor().equals("+2")) {
	                cartaInicial = carta;
	                cartaInicialAceptada = false;
	            }
	            mazoMezclado.push(carta);
	        }
	        
	        while (true) {
	        	cartaJuego=cartaInicial;
	            System.out.println("Carta Actual: ");
	            System.out.println(cartaJuego.getValor() + " " + cartaJuego.getColor());
	            if (turnoJugador1) {
	            	System.out.println("Turno del Jugador 1:");
	                jugarTurno(mazoJugador1Arreglo, mazoMezclado, cartaInicial, scanner,mazoJugador2Arreglo,cartaJuego);
	            } else {
	            	System.out.println("Turno del Jugador 2:");
	                jugarTurno(mazoJugador2Arreglo, mazoMezclado, cartaInicial, scanner,mazoJugador1Arreglo,cartaJuego);
	            }
	            turnoJugador1 = !turnoJugador1;
	        }
	    }
	public static int contarCartas(Object[] arreglo) {
	    int contador = 0;
	    for (int i = 0; i < arreglo.length; i++) {
	        if (arreglo[i] != null) {
	            contador++;
	        }
	    }
	    return contador;
	}
	 public static void jugarTurno(Carta[] mazoJugadorArreglo, Pilas mazoMezclado, Carta cartaInicial, Scanner scanner,Carta[] mazoJugadorArregloRival,Carta cartaJuego ) {
	        System.out.println("Cartas del Jugador:");
	        for (int i = 0; i < mazoJugadorArreglo.length; i++) {
	            if (mazoJugadorArreglo[i] != null) {
	                System.out.println(i + ")" + " " + mazoJugadorArreglo[i].getValor() + " "
	                        + mazoJugadorArreglo[i].getColor());
	            }
	        }
	        System.out.println("Seleccione una carta para jugar (0-" + (contarCartas(mazoJugadorArreglo) - 1)
	                + ") o -1 para tomar una carta: ");
	        int seleccion = scanner.nextInt();
	        if (seleccion == -1) {
	            Carta cartaTomada1 = (Carta) mazoMezclado.pop();
	            for (int i = 0; i < mazoJugadorArreglo.length; i++) {
	                if (mazoJugadorArreglo[i] == null) {
	                    mazoJugadorArreglo[i] = cartaTomada1;
	                    System.out.println("Carta tomada:" + " " + cartaTomada1.getValor() + " " + cartaTomada1.getColor());
	                    break;
	                }
	            }
	        } else if (seleccion >= 0) {
	            Carta cartaJugada = mazoJugadorArreglo[seleccion];
	            if (cartaJugada.getValor().equals("+4")) {
	                mazoJugadorArreglo[seleccion] = null;
	                System.out.println("+4: ");
	                System.out.println("Que color deseas que sea: \n1)Rojo\n2)Amarillo\n3)Azul\n4)Verde");
	                int opcionColor = scanner.nextInt();
	                switch (opcionColor) {
	                    case 1:
	                        System.out.println("Rojo");
	                        Carta cartaNueva = new Carta("0", "Rojo");
	                        cartaInicial = cartaNueva;
	                        System.out.println(cartaInicial.getValor() + " " + cartaInicial.getColor());
	                        break;
	                    case 2:
	                        System.out.println("Amarillo");
	                        Carta cartaNueva2 = new Carta("0", "Amarillo");
	                        cartaInicial = cartaNueva2;
	                        System.out.println(cartaInicial.getValor() + " " + cartaInicial.getColor());
	                        break;
	                    case 3:
	                        System.out.println("Azul");
	                        Carta cartaNueva3 = new Carta("0", "Azul");
	                        cartaInicial = cartaNueva3;
	                        break;
	                    case 4:
	                        System.out.println("Verde");
	                        Carta cartaNueva4 = new Carta("0", "Verde");
	                        cartaInicial = cartaNueva4;
	                        break;
	                    default:
	                        System.out.println("Opción no válida. Inténtalo de nuevo");
	                        break;
	                }
	                for (int i = 0; i < 4; i++) {
	                    Carta cartaTomada2 = (Carta) mazoMezclado.pop();
	                    for (int j = 0; j < mazoJugadorArregloRival.length; j++) {
	                        if (mazoJugadorArregloRival[j] == null) {
	                            mazoJugadorArregloRival[j] = cartaTomada2;
	                            System.out.println("Carta agregada al rival: " + cartaTomada2.getValor() + " " + cartaTomada2.getColor());
	                            break;
	                        }
	                    }
	                }
	            }
	    		else if (cartaJugada.getValor().equals("Cambio de color")) {
	    			System.out.println("Cambio de color: ");
	    			System.out.println("Que color deseas que sea: \n1)Rojo\n2)Amarillo\n3)Azul\n4)Verde");
	    			int opcionColor=scanner.nextInt();
	    		    switch (opcionColor) {
	    	        case 1:
	    	        	System.out.println("Rojo");
	    	        	Carta cartaNueva = new Carta("0", "Rojo");
	    	        	cartaInicial=cartaNueva;
	    	            break;
	    	        case 2:
	    	        	System.out.println("Amarillo");
	    	        	Carta cartaNueva2 = new Carta("0","Amarillo");
	    	        	cartaInicial=cartaNueva2;
	    	            break;
	    	        case 3:
	    	        	System.out.println("Azul");
	    	        	Carta cartaNueva3 = new Carta("0","Azul");
	    	        	cartaInicial=cartaNueva3;
	    	            break;
	    	        case 4:
	    	        	System.out.println("Verde");
	    	        	Carta cartaNueva4 = new Carta("0","Verde");
	    	        	cartaInicial=cartaNueva4;
	    	            break;
	    	        default:
	    	            System.out.println("Opción no válida.Intentalo de nuevo");
	    	            break;
	    	    }
	    			mazoJugadorArreglo[seleccion]=null;
	    		}
	    		else if(cartaJugada.getValor().equals("Saltar") &&  cartaJugada.getColor()==cartaInicial.getColor()  ) {
	    			System.out.println("Saltar");
	    			mazoJugadorArreglo[seleccion]=null;
	    			cartaInicial=cartaJugada;
	    		}
	    		else if (cartaJugada.getValor().equals("+2")&& cartaJugada.getColor()==cartaInicial.getColor() ) {
	    		    System.out.println("+2 ");
	    		    for (int i = 0; i < 2; i++) {
	    		        Carta cartaTomada = (Carta) mazoMezclado.pop();
	    		        for (int j = 0; j < mazoJugadorArregloRival.length; j++) {
	    		            if (mazoJugadorArregloRival[j] == null) {
	    		                mazoJugadorArregloRival[j] = cartaTomada;
	    		                System.out.println("Carta agregada al rival: " + cartaTomada.getValor() + " " + cartaTomada.getColor());
	    		                break;
	    		            }
	    		        }
	    		    }
	    		    mazoJugadorArreglo[seleccion] = null;
	    		    cartaInicial = cartaJugada;   
	    		}
	    		else if (cartaJugada.getValor().equals("Reversa")&& cartaJugada.getColor()==cartaInicial.getColor() ) {
	    			System.out.println("Reversa");
	    			mazoJugadorArreglo[seleccion]=null;
	    			cartaInicial=cartaJugada;
	    		}
	    		else if (cartaJugada.getValor()==cartaInicial.getValor()  || cartaJugada.getColor()==cartaInicial.getColor()) {
	    			System.out.println("Numero o color");
	    			mazoJugadorArreglo[seleccion]=null;
	    			cartaInicial=cartaJugada;
	    		} else {
	                System.out.println("La carta seleccionada no es válida. Inténtalo de nuevo.");
	                
	            }
	            cartaJuego=cartaInicial;
	            System.out.println("Valor de cartaJugada: " + cartaJugada.getValor());
	            System.out.println("Valor de cartaInicial: " + cartaInicial.getValor());
	            System.out.println("Color de cartaJugada: " + cartaJugada.getColor());
	            System.out.println("Color de cartaInicial: " + cartaInicial.getColor());
	    	}
	        }
}