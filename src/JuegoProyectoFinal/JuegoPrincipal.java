package JuegoProyectoFinal;
import java.util.Scanner;
import java.util.Random;
import Estructuras.pilas.Pilas;
import JuegoProyectoFinal.BarajaDeCartas;
import JuegoProyectoFinal.Carta;
import java.util.Scanner;
public class JuegoPrincipal {

	public static void main(String[] args) {
		System.out.println("JUEGO DEL UNO, ¡BIENVENIDO!");
		boolean seguirJugando=true;
		BarajaDeCartas baraja = new BarajaDeCartas();
		Pilas mazoCartasTotal = baraja.mazoDeCartas();
		Pilas mazoMezclado = baraja.mezclarMazo(mazoCartasTotal);
		Pilas mazoJugador1 = baraja.mazoJugador(mazoMezclado);
		Pilas mazoJugador2 = baraja.mazoJugador(mazoMezclado);
		Carta[] mazoJugador1Arreglo = new Carta[104];
		Carta[] mazoJugador2Arreglo = new Carta[104];
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
			if (contarCartas(mazoJugador1Arreglo) == 0) {
				System.out.println("¡Jugador 1 ha ganado!\n Fin del juego :)");
				break;
			} else if (contarCartas(mazoJugador2Arreglo) == 0) {
				System.out.println("¡Jugador 2 ha ganado!\n Fin del juego :)");
				break;
			}
			if (turnoJugador1) {
				System.out.println("Turno del Jugador 1:");
				cartaInicial = jugarTurno(mazoJugador1Arreglo, mazoMezclado, cartaInicial, mazoJugador2Arreglo, cartaJuego);
				if (cartaInicial.getValor().equals("Saltar") ) {
					turnoJugador1=true;
				} else {
					turnoJugador1 = !turnoJugador1;

				}

			} else {
				System.out.println("Turno del Jugador 2:");
				cartaInicial = jugarTurno(mazoJugador2Arreglo, mazoMezclado, cartaInicial, mazoJugador1Arreglo, cartaJuego);
				if (cartaInicial.getValor().equals("Saltar")) {
					turnoJugador1=true;
				} else {
					turnoJugador1 = !turnoJugador1;

				}
			}

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

	public static boolean validarEntero(String valor) {
		boolean respuesta;
		try {
			Integer.parseInt(valor);
			respuesta = true;
		} catch (Exception ex) {
			respuesta = false;
		}
		return respuesta;
	}
	public static Carta jugarTurno(Carta[] mazoJugadorArreglo, Pilas mazoMezclado, Carta cartaInicial, Carta[] mazoJugadorArregloRival, Carta cartaJuego) {
		boolean seleccionValida = false;
		int seleccion;
		boolean uno=false;
		Scanner scanner = new Scanner(System.in);
		while (!seleccionValida) {
			System.out.println("Cartas del Jugador:");
			for (int i = 0; i < mazoJugadorArreglo.length; i++) {
				if (mazoJugadorArreglo[i] != null) {
					System.out.println(i + ")" + " " + mazoJugadorArreglo[i].getValor() + " "
							+ mazoJugadorArreglo[i].getColor());
				}
			}
			System.out.println("Seleccione una carta para jugar (0-" + (contarCartas(mazoJugadorArreglo) - 1) + ") o -1 para tomar una carta o -2 si solamente te falta tirar una carta: ");
			String seleccionCadena = scanner.nextLine();

			if (!seleccionCadena.isEmpty() && validarEntero(seleccionCadena)==true) {
				seleccion = Integer.parseInt(seleccionCadena);
				if (seleccion==-1 || seleccion==-2 || seleccion >= 0 && seleccion <= contarCartas(mazoJugadorArreglo) ) {	            	
				}
				else {
					System.out.println("Por favor, ingresa un número válido o -1 para tomar una carta.");
					continue; 
				}

			} else {
				System.out.println("Por favor, ingresa un número válido o -1 para tomar una carta.");
				continue; 
			}
			//Validar cuando ya no tenga que cartas sacar , si la pila se queda vacia
			if(seleccion==-2) {
				System.out.println("¡Uno!");
				if (contarCartas(mazoJugadorArreglo)==1) {
					System.out.println("Bien,¡Ya casi ganas!");
					uno=true;
					seleccionValida = true;
				}
				else
				{
					System.out.println("No tienes uno, se te agregaran +2 cartas ");
					for (int i = 0; i < 2; i++) {
						Carta cartaTomada = (Carta) mazoMezclado.pop();
						for (int j = 0; j < mazoJugadorArreglo.length; j++) {
							if (mazoJugadorArreglo[j] == null) {
								mazoJugadorArreglo[j] = cartaTomada;
								System.out.println("Carta agregadas: " + cartaTomada.getValor() + " " + cartaTomada.getColor());
								break;
							}
						}
					}
					seleccionValida = true;
					cartaJuego = cartaInicial;
				}
			}
			else if (seleccion == -1) {
				Carta cartaTomada1 = (Carta) mazoMezclado.pop();
				for (int i = 0; i < mazoJugadorArreglo.length; i++) {
					if (mazoJugadorArreglo[i] == null) {
						mazoJugadorArreglo[i] = cartaTomada1;
						seleccionValida = true;
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
					String opcionColorCadena;
					int opcionColor=0;
					opcionColorCadena = scanner.nextLine();
					if (!opcionColorCadena.isEmpty() && validarEntero(opcionColorCadena)==true) {
						opcionColor = Integer.parseInt(opcionColorCadena);
					}else
					{
						System.out.println("No es un numero, color aleatorio");
			            Random random = new Random();
			            opcionColor = random.nextInt(4) + 1;
						
					}
					switch (opcionColor) {
					case 1:
						System.out.println("Rojo");
						Carta cartaNueva = new Carta("0", "rojo");
						cartaInicial = cartaNueva;              
						cartaJuego = cartaInicial;
						seleccionValida = true;
						break;
					case 2:
						System.out.println("Amarillo");
						Carta cartaNueva2 = new Carta("0", "amarillo");
						cartaInicial = cartaNueva2;
						seleccionValida = true;
						cartaJuego=cartaInicial;
						break;
					case 3:
						System.out.println("Azul");
						Carta cartaNueva3 = new Carta("0", "azul");
						cartaInicial = cartaNueva3;
						seleccionValida = true;
						cartaJuego=cartaInicial;
						break;
					case 4:
						System.out.println("Verde");
						Carta cartaNueva4 = new Carta("0", "verde");
						cartaInicial = cartaNueva4;
						seleccionValida = true;
						cartaJuego=cartaInicial;
						break;
					default:
						System.out.println("Opción no válida. color aleatorio");
			            Random random = new Random();
			            opcionColor = random.nextInt(4) + 1;
						switch (opcionColor) {
						case 1:
							System.out.println("Rojo");
							Carta cartaNueva5 = new Carta("0", "rojo");
							cartaInicial = cartaNueva5;              
							cartaJuego = cartaInicial;
							seleccionValida = true;
							break;
						case 2:
							System.out.println("Amarillo");
							Carta cartaNueva6 = new Carta("0", "amarillo");
							cartaInicial = cartaNueva6;
							seleccionValida = true;
							cartaJuego=cartaInicial;
							break;
						case 3:
							System.out.println("Azul");
							Carta cartaNueva7 = new Carta("0", "azul");
							cartaInicial = cartaNueva7;
							seleccionValida = true;
							cartaJuego=cartaInicial;
							break;
						case 4:
							System.out.println("Verde");
							Carta cartaNueva8 = new Carta("0", "verde");
							cartaInicial = cartaNueva8;
							seleccionValida = true;
							cartaJuego=cartaInicial;
							break;
						}
	
					}
					for (int i = 0; i < 4; i++) {
						Carta cartaTomada2 = (Carta) mazoMezclado.pop();
						for (int j = 0; j < mazoJugadorArregloRival.length; j++) {
							if (mazoJugadorArregloRival[j] == null) {
								mazoJugadorArregloRival[j] = cartaTomada2;
								System.out.println("Carta agregada al rival: " + cartaTomada2.getValor() + " " + cartaTomada2.getColor());
								seleccionValida = true;                        
								break;
							}
						}
					}
					seleccionValida = true;
				}
				else if (cartaJugada.getValor().equals("Cambio de color")) {
					System.out.println("Cambio de color: ");
					System.out.println("Que color deseas que sea: \n1)Rojo\n2)Amarillo\n3)Azul\n4)Verde");
					String opcionColorCadena;
					int opcionColor=0;
					opcionColorCadena = scanner.nextLine();
					if (!opcionColorCadena.isEmpty() && validarEntero(opcionColorCadena)==true) {
						opcionColor = Integer.parseInt(opcionColorCadena);
					}else
					{
						System.out.println("No es un numero, color aleatorio");
			            Random random = new Random();
			            opcionColor = random.nextInt(4) + 1;
						
					}
					switch (opcionColor) {
					case 1:
						System.out.println("Rojo");
						Carta cartaNueva = new Carta("0", "rojo");
						cartaInicial=cartaNueva;
						cartaJuego=cartaInicial;
						seleccionValida = true;
						break;
					case 2:
						System.out.println("Amarillo");
						Carta cartaNueva2 = new Carta("0","amarillo");
						cartaInicial=cartaNueva2;
						seleccionValida = true;
						cartaJuego=cartaInicial;
						break;
					case 3:
						System.out.println("Azul");
						Carta cartaNueva3 = new Carta("0","azul");
						cartaInicial=cartaNueva3;
						seleccionValida = true;
						cartaJuego=cartaInicial;
						break;
					case 4:
						System.out.println("Verde");
						Carta cartaNueva4 = new Carta("0","verde");
						cartaInicial=cartaNueva4;
						seleccionValida = true;
						cartaJuego=cartaInicial;
						break;
					default:
						System.out.println("Opción no válida. color aleatorio");
			            Random random = new Random();
			            opcionColor = random.nextInt(4) + 1;
						switch (opcionColor) {
						case 1:
							System.out.println("Rojo");
							Carta cartaNueva5 = new Carta("0", "rojo");
							cartaInicial = cartaNueva5;              
							cartaJuego = cartaInicial;
							seleccionValida = true;
							break;
						case 2:
							System.out.println("Amarillo");
							Carta cartaNueva6 = new Carta("0", "amarillo");
							cartaInicial = cartaNueva6;
							seleccionValida = true;
							cartaJuego=cartaInicial;
							break;
						case 3:
							System.out.println("Azul");
							Carta cartaNueva7 = new Carta("0", "azul");
							cartaInicial = cartaNueva7;
							seleccionValida = true;
							cartaJuego=cartaInicial;
							break;
						case 4:
							System.out.println("Verde");
							Carta cartaNueva8 = new Carta("0", "verde");
							cartaInicial = cartaNueva8;
							seleccionValida = true;
							cartaJuego=cartaInicial;
							break;
						}
					}
					mazoJugadorArreglo[seleccion]=null;
					seleccionValida = true;

				}
				else if(cartaJugada.getValor().equals("Saltar") &&  cartaJugada.getColor()==cartaInicial.getColor()  ) {
					System.out.println("Saltar");
					mazoJugadorArreglo[seleccion]=null;
					cartaInicial=cartaJugada;
					cartaJuego=cartaInicial;
					seleccionValida = true;
				}
				else if (cartaJugada.getValor().equals("+2") && cartaJugada.getColor() == cartaInicial.getColor()  ) {
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
					cartaJuego = cartaInicial;
					seleccionValida = true;
				}
				else if (cartaJugada.getValor().equals("+2") && cartaInicial.getValor().equals("+2")  ) {
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
					cartaJuego = cartaInicial;
					seleccionValida = true;
				}

				else if (cartaJugada.getValor().equals("Reversa")&& cartaJugada.getColor()==cartaInicial.getColor() ) {
					System.out.println("Reversa");
					mazoJugadorArreglo[seleccion]=null;
					cartaInicial=cartaJugada;
					cartaJuego=cartaInicial;
					seleccionValida = true;
				}

				else if (cartaJugada.getValor().equals(cartaInicial.getValor()) || cartaJugada.getColor().equals(cartaInicial.getColor())) {
					System.out.println("Numero o color");
					mazoJugadorArreglo[seleccion]=null;
					cartaInicial=cartaJugada;
					cartaJuego=cartaInicial;
					seleccionValida = true;
				} else {
					System.out.println("La carta seleccionada no es válida. Inténtalo de nuevo.");

				}
				cartaJuego=cartaInicial;
			}
		}
		return cartaInicial;
	}
}