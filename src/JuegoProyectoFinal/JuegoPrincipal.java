package JuegoProyectoFinal;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import Estructuras.pilas.Pilas;
import JuegoProyectoFinal.BarajaDeCartas;
import JuegoProyectoFinal.Carta;
import java.util.Scanner;
public class JuegoPrincipal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("JUEGO DEL UNO, ¡BIENVENIDO!");
		System.out.println("Instrucciones: "+"\r\n"+"Desarrollo del Juego:\r\n" + "Se elige una carta inicial del mazo mezclado, asegurándose de que no sea una carta especial como \"+4\", \"Cambio de color\", \"Saltar\", \"Reversa\" o \"+2\".\r\n" + "Los jugadores alternan turnos.\r\n"+ "En cada turno, el jugador debe coincidir con la carta en juego por valor o color.\r\n"+ "Si un jugador no puede jugar una carta válida, debe tomar una carta del mazo.\r\n" + "Cartas Especiales:\r\n" + "\"+4\": El jugador elige un nuevo color y el siguiente jugador toma 4 cartas.\r\n" + "\"Cambio de color\": El jugador elige un nuevo color.\r\n" + "\"Saltar\": Cambia el sentido del juego si se juega en una carta del mismo color.\r\n" + "\"+2\": El siguiente jugador toma 2 cartas. Se puede apilar con otra carta \"+2\".\r\n"+ "Fin del Juego:\r\n"+ "El juego continúa hasta que un jugador se queda sin cartas.\r\n"+ "El jugador que se queda sin cartas primero gana.\r\n"+ "Se muestra un mensaje indicando qué jugador ganó.\r\n"+ "Turnos y Estado del Juego:\r\n"+ "Se muestra el estado actual del juego, incluida la carta en juego y las cartas de cada jugador.\r\n"+ "Los jugadores reciben mensajes sobre sus turnos y acciones permitidas.\r\n"+ "UNO y Toma de Decisiones:\r\n"+ "Los jugadores pueden decir \"¡Uno!\" cuando les queda una carta.\r\n"+ "Si no dicen \"¡Uno!\" antes de que el siguiente jugador comience su turno, deben tomar dos cartas."+ "\n¡Disfruta del juego!\r\n");
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
		int turnoJugador1 = 1;
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
			if (contarCartas(mazoJugador1Arreglo)==0) {
				System.out.println("Gano el jugador 1");
				break;
			}
			if (contarCartas(mazoJugador2Arreglo)==0) {
				System.out.println("Gano el jugador 2");
				break;
			}
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Carta Actual: ");
			System.out.println(cartaJuego.getValor() + " " + cartaJuego.getColor());
			
			if (turnoJugador1 == 1) {
			    System.out.println("Turno del Jugador 1:");
			    cartaInicial = jugarTurno(mazoJugador1Arreglo, mazoMezclado, cartaInicial, mazoJugador2Arreglo, cartaJuego);

			    if (cartaInicial.getValor().equals("Saltar")) {
			        turnoJugador1 = 1;
			    } else {
			        turnoJugador1 = 2;
			    }
			    if (contarCartas(mazoJugador1Arreglo)==2 || contarCartas(mazoJugador1Arreglo)==1) {
				    boolean seleccionValida = false;
				    do {
				        System.out.println("Total de cartas: " + contarCartas(mazoJugador1Arreglo));
				        System.out.println("¿Tienes una carta?  1)Si 2)No");
				        String seleccionUnoCadena = scanner.nextLine();
				        if (!seleccionUnoCadena.isEmpty() && validarEntero(seleccionUnoCadena)) {
				            int seleccion = Integer.parseInt(seleccionUnoCadena);
				            if (seleccion == 1) {
				                System.out.println("¡Uno!");
				                if (contarCartas(mazoJugador1Arreglo) == 1) {
				                	seleccionValida = true;
				                    System.out.println("¡Bien, ya casi ganas!");
				                    break; 
				                } else {
				                    System.out.println("No tienes una carta para decir uno, se te agregarán +2 cartas ");
				                    for (int i = 0; i < 2; i++) {
				                        Carta cartaTomada = (Carta) mazoMezclado.pop();
				                        for (int j = 0; j < mazoJugador1Arreglo.length; j++) {
				                            if (mazoJugador1Arreglo[j] == null) {
				                                mazoJugador1Arreglo[j] = cartaTomada;
				                                System.out.println("Carta agregada: " + cartaTomada.getValor() + " " + cartaTomada.getColor());
				                                seleccionValida = true;
				                                break;
				                            }
				                        }
				                    }
				                }
				            } else if (seleccion == 2) {
				                if (contarCartas(mazoJugador1Arreglo) == 1) {
				                    System.out.println("¡Bien, ya casi ganas!, si tienes uno");
				                    seleccionValida = true;
				                    break; 
				                } else {
				                	System.out.println("¡Vamos, falta poco!");
				                	seleccionValida = true;
				                    break;
				                }
				            } else {
				                System.out.println("Por favor, ingresa un número válido del 1 al 2");
				                
				                
				            }
				        } else {
				            System.out.println("Por favor, ingresa un número válido");
				            
				        }
				        if (contarCartas(mazoJugador1Arreglo) == 0) {
							System.out.println("¡Jugador 1 ha ganado!\n Fin del juego :)");
							break;
						} else if (contarCartas(mazoJugador2Arreglo) == 0) {
							System.out.println("¡Jugador 2 ha ganado!\n Fin del juego :)");
							break;
						}
				    } while (!seleccionValida);
			    	
			    }
			} else {
				if(turnoJugador1==2) {
					System.out.println("Turno del Jugador 2:");
					cartaInicial = jugarTurno(mazoJugador2Arreglo, mazoMezclado, cartaInicial, mazoJugador1Arreglo, cartaJuego);
					if (cartaInicial.getValor().equals("Saltar")) {
						turnoJugador1=2;
					} else {
						turnoJugador1 =1;
					}
				    if (contarCartas(mazoJugador2Arreglo)==2 || contarCartas(mazoJugador2Arreglo)==1) {
					    boolean seleccionValida = false;
					    do {
					        System.out.println("Total de cartas: " + contarCartas(mazoJugador2Arreglo));
					        System.out.println("¿Tienes una carta?  1)Si 2)No");
					        String seleccionUnoCadena = scanner.nextLine();
					        if (!seleccionUnoCadena.isEmpty() && validarEntero(seleccionUnoCadena)) {
					            int seleccion = Integer.parseInt(seleccionUnoCadena);
					            if (seleccion == 1) {
					                System.out.println("¡Uno!");
					                if (contarCartas(mazoJugador2Arreglo) == 1) {
					                	seleccionValida = true;
					                    System.out.println("¡Bien, ya casi ganas!");
					                    break; 
					                } else {
					                    System.out.println("No tienes una carta para decir uno, se te agregarán +2 cartas ");
					                    for (int i = 0; i < 2; i++) {
					                        Carta cartaTomada = (Carta) mazoMezclado.pop();
					                        for (int j = 0; j < mazoJugador2Arreglo.length; j++) {
					                            if (mazoJugador2Arreglo[j] == null) {
					                                mazoJugador2Arreglo[j] = cartaTomada;
					                                System.out.println("Carta agregada: " + cartaTomada.getValor() + " " + cartaTomada.getColor());
					                                seleccionValida = true;
					                                break;
					                            }
					                        }
					                    }
					                }
					            } else if (seleccion == 2) {
					                if (contarCartas(mazoJugador2Arreglo) == 1) {
					                    System.out.println("¡Bien, ya casi ganas!, si tienes uno");
					                    seleccionValida = true;
					                    break; 
					                } else {
					                	System.out.println("¡Vamos, falta poco!");
					                	seleccionValida = true;
					                    break;
					                }
					            } else {
					                System.out.println("Por favor, ingresa un número válido del 1 al 2");
					                
					                
					            }
					        } else {
					            System.out.println("Por favor, ingresa un número válido");
					            
					        }
					    } while (!seleccionValida);
				    	
				    }

					
				}
			}
			boolean cartas=false;			
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
			int[] indicesConCartas = obtenerIndicesConCartas(mazoJugadorArreglo);
			if (indicesConCartas.length > 0) {
				System.out.print("Índices de las cartas: ");
				for (int i = 0; i < indicesConCartas.length - 1; i++) {
					System.out.print(indicesConCartas[i] + ", ");
				}
				System.out.println(indicesConCartas[indicesConCartas.length - 1]);
			} else {
				System.out.println("No hay cartas en el arreglo.");
			}
			System.out.println("Seleccione una carta de los indices de arriba para jugar o -1 para tomar una carta:");
			String seleccionCadena = scanner.nextLine();
			if (!seleccionCadena.isEmpty() && validarEntero(seleccionCadena)==true) {
				seleccion = Integer.parseInt(seleccionCadena);
				if (seleccion==-1 || seleccion >= 0 && seleccion <=104 && !verificarSiEsNulo(seleccion,mazoJugadorArreglo)) {	            	
				}
				else {
					System.out.println("Por favor, ingresa un número válido o -1 para tomar una carta.");
					continue; 
				}
			} else {
				System.out.println("Por favor, ingresa un número válido o -1 para tomar una carta.");
				continue; 
			}
			if (seleccion == -1) {
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
	public static boolean verificarSiEsNulo(int i, Carta[] mazoJugadorArreglo) {
		boolean respuesta=false;
		if (mazoJugadorArreglo[i]==null) {
			respuesta=true;
		}
		return respuesta;
	}
	public static int[] obtenerIndicesConCartas(Carta[] arreglo) {
		int contador = 0;
		for (Carta carta : arreglo) {
			if (carta != null) {
				contador++;
			}
		}
		int[] indicesConCartas = new int[contador];
		int index = 0;

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != null) {
				indicesConCartas[index++] = i;
			}
		}
		return indicesConCartas;
	}
}