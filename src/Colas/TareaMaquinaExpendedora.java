package Colas;
import Estructuras.pilas.Pilas;
import javax.swing.JOptionPane;
import Colas.CircularQueue;
import java.util.Scanner;

public class TareaMaquinaExpendedora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		CircularQueue cocaCola=new CircularQueue(10);
		CircularQueue fanta=new CircularQueue(10);
		CircularQueue galletasOreo=new CircularQueue(10);
		CircularQueue jugo=new CircularQueue(10);
		CircularQueue snikers=new CircularQueue(10);
		CircularQueue sprite=new CircularQueue(10);
		Pilas monedasUnPeso = new Pilas(30);
		Pilas monedasDosPesos = new Pilas(30);
		Pilas monedasCincoPesos = new Pilas(30);
		Pilas monedasDiezPesos = new Pilas(30);
		Pilas monedasCincuentaCentavos = new Pilas(30);
		Pilas monedasVeintePesos = new Pilas(30);
		cocaCola.enqueue(1);
		cocaCola.enqueue(1);
		fanta.enqueue(1);
		fanta.enqueue(1);
		galletasOreo.enqueue(1);
		galletasOreo.enqueue(1);
		jugo.enqueue(1);
		jugo.enqueue(1);
		snikers.enqueue(1);
		snikers.enqueue(1);
		sprite.enqueue(1);
		sprite.enqueue(1);
		monedasVeintePesos.push(20.0);
		monedasVeintePesos.push(20.0);
		monedasVeintePesos.push(20.0);
		monedasVeintePesos.push(20.0);
		monedasVeintePesos.push(20.0);
		monedasVeintePesos.push(20.0);
		monedasVeintePesos.push(20.0);
		monedasVeintePesos.push(20.0);
		monedasVeintePesos.push(20.0);
		monedasVeintePesos.push(20.0);
		monedasCincuentaCentavos.push(0.50);
		monedasCincuentaCentavos.push(0.50);
		monedasCincuentaCentavos.push(0.50);
		monedasCincuentaCentavos.push(0.50);
		monedasCincuentaCentavos.push(0.50);
		monedasCincuentaCentavos.push(0.50);
		monedasCincuentaCentavos.push(0.50);
		monedasCincuentaCentavos.push(0.50);
		monedasCincuentaCentavos.push(0.50);
		monedasCincuentaCentavos.push(0.50);
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

		String respuestaCadena;
		boolean respuesta=true;
		int respuestaNumero;
		do {
			//JOptionPane.showMessageDialog(null, "Hello World");
			System.out.println("Maquina expendedora de alimentos");
			System.out.println("Menu: "+"\n"+"1)Agregar Productos"+"\n"+"2)Retirar Productos"+"\n"+"3)Agregar Monedas"+"\n"+"4)Retirar Monedas"+"\n"+"5)Estado Maquina"+"\n"+"6)Comprar"+"\n"+"7)Salir"+"\n"+"Escoge una opcion:");
			respuestaCadena = leer.nextLine();
			respuestaNumero = Integer.parseInt(respuestaCadena);
			switch (respuestaNumero) {
			case 1:
				System.out.println("Agregar Productos");
				System.out.println("Que producto agregara: "+"\n"+"1)Coca Cola (1111)"+"\n"+"2)Fanta(1234)"+"\n"+"3)Galletas Oreo(3333)"+"\n"+"4)Jugo (1478)"+"\n"+"5)Snikers (7894)"+"\n"+"6)Sprite (9999)");
				System.out.println("7 8 9"+"\n"+"4 5 6"+"\n"+"1 2 3");
				System.out.println("Agregar los digitos del producto deseado");
				String numeroProducto="";
				for (int i = 0; i < 4; i++) {
					System.out.print("Ingresa el dígito " + (i + 1) + ": ");
					respuestaCadena = leer.nextLine();
					if (respuestaCadena.length() == 1 && Character.isDigit(respuestaCadena.charAt(0))) {
						numeroProducto += respuestaCadena; // Concatenar el dígito
					} else {
						System.out.println("Entrada no válida. Ingresa un solo dígito.");
						i--; 
					}
				}

				int productoSeleccionado=Integer.parseInt(numeroProducto);
				switch (productoSeleccionado) {
				case 1111:
					System.out.println("Agrega la cantidad de productos");
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (cocaCola.size()<10 && respuestaNumero>0)
					{
						for (int i=0;i<respuestaNumero && cocaCola.size()<10;i++) {
							cocaCola.enqueue(i+1);	
						}	
					}
					else
					{
						System.out.println("No hay espacio para esos productos");
					}	
					System.out.println("Productos que hay: "+cocaCola.size());
					break;
				case 1234:
					System.out.println("Agrega la cantidad de productos");
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (fanta.size()<10 && respuestaNumero>0)
					{
						for (int i=0;i<respuestaNumero && fanta.size()<10;i++) {
							fanta.enqueue(i+1);	
						}	
					}
					else
					{
						System.out.println("No hay espacio para esos productos");
					}	
					System.out.println("Productos que hay: "+fanta.size());
					break;
				case 3333:
					System.out.println("Agrega la cantidad de productos");
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (galletasOreo.size()<10 && respuestaNumero>0)
					{
						for (int i=0;i<respuestaNumero && galletasOreo.size()<10;i++) {
							galletasOreo.enqueue(i+1);	
						}	
					}
					else
					{
						System.out.println("No hay espacio para esos productos");
					}	
					System.out.println("Productos que hay: "+galletasOreo.size());
					break;
				case 1478:
					System.out.println("Agrega la cantidad de productos");
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (jugo.size()<10 && respuestaNumero>0)
					{
						for (int i=0;i<respuestaNumero && jugo.size()<10;i++) {
							jugo.enqueue(i+1);	
						}	
					}
					else
					{
						System.out.println("No hay espacio para esos productos");
					}	
					System.out.println("Productos que hay: "+jugo.size());
					break;
				case 7894:
					System.out.println("Agrega la cantidad de productos");
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (snikers.size()<10 && respuestaNumero>0)
					{
						for (int i=0;i<respuestaNumero && snikers.size()<10;i++) {
							snikers.enqueue(i+1);	
						}	
					}
					else
					{
						System.out.println("No hay espacio para esos productos");
					}	
					System.out.println("Productos que hay: "+ snikers.size());
					break;
				case 9999:
					System.out.println("Agrega la cantidad de productos");
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (sprite.size()<10 && respuestaNumero>0)
					{
						for (int i=0;i<respuestaNumero && sprite.size()<10;i++) {
							sprite.enqueue(i+1);	
						}	
					}
					else
					{
						System.out.println("No hay espacio para esos productos");
					}	
					System.out.println("Productos que hay: "+sprite.size());
					break;
				default:
					System.out.println("No existe ese producto");
					break;

				}

				break;



			case 2:
				System.out.println("Retirar Productos");
				System.out.println("Que producto desea retirar: "+"\n"+"1)Coca Cola (1111)"+"\n"+"2)Fanta(1234)"+"\n"+"3)Galletas Oreo(3333)"+"\n"+"4)Jugo (1478)"+"\n"+"5)Snikers (7894)"+"\n"+"6)Sprite (9999)");
				System.out.println("7 8 9"+"\n"+"4 5 6"+"\n"+"1 2 3");
				System.out.println("Agregar los digitos del producto deseado");
				numeroProducto="";
				for (int i = 0; i < 4; i++) {
					System.out.print("Ingresa el dígito " + (i + 1) + ": ");
					respuestaCadena = leer.nextLine();
					if (respuestaCadena.length() == 1 && Character.isDigit(respuestaCadena.charAt(0))) {
						numeroProducto += respuestaCadena; // Concatenar el dígito
					} else {
						System.out.println("Entrada no válida. Ingresa un solo dígito.");
						i--; 
					}
				}

				productoSeleccionado=Integer.parseInt(numeroProducto);
				switch (productoSeleccionado) {
				case 1111:
					System.out.println("Agrega la cantidad de productos que va a retirar");
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (respuestaNumero<=10 && respuestaNumero-cocaCola.size()<=0)
					{
						for (int i=0;i<respuestaNumero;i++) {
							cocaCola.dequeue();	
						}	
					}
					else
					{
						System.out.println("No se puede quitar esa cantidad de productos");
					}	
					System.out.println("Productos que hay: "+cocaCola.size());
					break;
				case 1234:
					System.out.println("Agrega la cantidad de productos que va a retirar");
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (respuestaNumero<=10 && respuestaNumero-fanta.size()<=0)
					{
						for (int i=0;i<respuestaNumero;i++) {
							fanta.dequeue();	
						}	
					}
					else
					{
						System.out.println("No se puede quitar esa cantidad de productos");
					}	
					System.out.println("Productos que hay: "+fanta.size());
					break;
				case 3333:
					System.out.println("Agrega la cantidad de productos que va a retirar");
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (respuestaNumero<=10 && respuestaNumero-galletasOreo.size()<=0)
					{
						for (int i=0;i<respuestaNumero;i++) {
							galletasOreo.dequeue();	
						}	
					}
					else
					{
						System.out.println("No se puede quitar esa cantidad de productos");
					}	
					System.out.println("Productos que hay: "+galletasOreo.size());
					break;
				case 1478:
					System.out.println("Agrega la cantidad de productos");
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (respuestaNumero<=10 && respuestaNumero-jugo.size()<=0)
					{
						for (int i=0;i<respuestaNumero;i++) {
							jugo.dequeue();	
						}	
					}
					else
					{
						System.out.println("No se puede quitar esa cantidad de productos");
					}	
					System.out.println("Productos que hay: "+jugo.size());
					break;
				case 7894:
					System.out.println("Agrega la cantidad de productos");
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (respuestaNumero<=10 && respuestaNumero-snikers.size()<=0)
					{
						for (int i=0;i<respuestaNumero;i++) {
							snikers.dequeue();	
						}	
					}
					else
					{
						System.out.println("No se puede quitar esa cantidad de productos");
					}	
					System.out.println("Productos que hay: "+snikers.size());
					break;
				case 9999:
					System.out.println("Agrega la cantidad de productos");
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (respuestaNumero<=10 && respuestaNumero-sprite.size()<=0)
					{
						for (int i=0;i<respuestaNumero;i++) {
							sprite.dequeue();	
						}	
					}
					else
					{
						System.out.println("No se puede quitar esa cantidad de productos");
					}	
					System.out.println("Productos que hay: "+sprite.size());
					break;

				default:
					System.out.println("No existe ese producto");

				}
				break;
			case 3:
				System.out.println("Agregar Monedas");
				System.out.println("Que moneda agregara: "+"\n"+"1)0.5"+"\n"+"2)1"+"\n"+"3)2"+"\n"+"4)5"+"\n"+"5)10"+"\n"+"6)20"+"\n"+"Escoge una opcion:");
				respuestaCadena = leer.nextLine();
				respuestaNumero = Integer.parseInt(respuestaCadena);
				switch (respuestaNumero) {
				case 1:
					System.out.println("Agrega la cantidad de monedas");
					double moneda=0.5;
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (monedasCincuentaCentavos.size()<30 && respuestaNumero>0) {
						for (int i=0;i<respuestaNumero && monedasCincuentaCentavos.size()<30;i++) {
							monedasCincuentaCentavos.push(moneda);
						}	
					}
					else
					{
						System.out.println("No hay espacio para esas monedas");
					}
					System.out.println("Monedas que hay: "+monedasCincuentaCentavos.size());
					break;
				case 2:
					System.out.println("Agrega la cantidad de monedas");
					moneda=1;
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (monedasUnPeso.size()<30 && respuestaNumero>0) {
						for (int i=0;i<respuestaNumero && monedasUnPeso.size()<30;i++) {
							monedasUnPeso.push(moneda);
						}	
					}
					else
					{
						System.out.println("No hay espacio para esas monedas");
					}
					System.out.println("Monedas que hay: "+monedasUnPeso.size());
					break;
				case 3:
					System.out.println("Agrega la cantidad de monedas");
					moneda=2;
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (monedasDosPesos.size()<30 && respuestaNumero>0) {
						for (int i=0;i<respuestaNumero && monedasDosPesos.size()<30;i++) {
							monedasDosPesos.push(moneda);
						}	
					}
					else
					{
						System.out.println("No hay espacio para esas monedas");
					}
					System.out.println("Monedas que hay: "+monedasDosPesos.size());
					break;
				case 4:
					System.out.println("Agrega la cantidad de monedas");
					moneda=5;
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (monedasCincoPesos.size()<30 && respuestaNumero>0) {
						for (int i=0;i<respuestaNumero && monedasCincoPesos.size()<30;i++) {
							monedasCincoPesos.push(moneda);
						}	
					}
					else
					{
						System.out.println("No hay espacio para esas monedas");
					}
					System.out.println("Monedas que hay: "+monedasCincoPesos.size());
					break;
				case 5:
					System.out.println("Agrega la cantidad de monedas");
					moneda=10;
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (monedasDiezPesos.size()<30 && respuestaNumero>0) {
						for (int i=0;i<respuestaNumero && monedasDiezPesos.size()<30;i++) {
							monedasDiezPesos.push(moneda);
						}	
					}
					else
					{
						System.out.println("No hay espacio para esas monedas");
					}
					System.out.println("Monedas que hay: "+monedasDiezPesos.size());
					break;
				case 6:
					System.out.println("Agrega la cantidad de monedas");
					moneda=20;
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (monedasVeintePesos.size()<30 && respuestaNumero>0) {
						for (int i=0;i<respuestaNumero && monedasVeintePesos.size()<30;i++) {
							monedasVeintePesos.push(moneda);
						}	
					}
					else
					{
						System.out.println("No hay espacio para esas monedas");
					}
					System.out.println("Monedas que hay: "+monedasVeintePesos.size());
					break;
				default:
					System.out.println("Escoge un numero del 1 al 7");
					break;
				}
				break;
			case 4:
				System.out.println("Retirar monedas");
				System.out.println("Que moneda desea retirar: "+"\n"+"1)0.5"+"\n"+"2)1"+"\n"+"3)2"+"\n"+"4)5"+"\n"+"5)10"+"\n"+"6)20"+"\n"+"Escoge una opcion:");
				respuestaCadena = leer.nextLine();
				respuestaNumero = Integer.parseInt(respuestaCadena);
				switch (respuestaNumero) {
				case 1:
					System.out.println("Agrega la cantidad de monedas que va a retirar");
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (respuestaNumero>=0 && respuestaNumero-monedasCincuentaCentavos.size()<=0)
					{
						for (int i=0;i<respuestaNumero;i++) {
							monedasCincuentaCentavos.pop();	
						}
					}
					else
					{
						System.out.println("No se puede quitar esa cantidad de monedass");
					}	
					System.out.println("Monedas que hay: "+monedasCincuentaCentavos.size());	
					break;
				case 2:
					System.out.println("Agrega la cantidad de monedas que va a retirar");
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (respuestaNumero>=0 && respuestaNumero-monedasUnPeso.size()<=0)
					{
						for (int i=0;i<respuestaNumero;i++) {
							monedasUnPeso.pop();	
						}
					}
					else
					{
						System.out.println("No se puede quitar esa cantidad de monedass");
					}	
					System.out.println("Monedas que hay: "+monedasUnPeso.size());	
					break;
				case 3:
					System.out.println("Agrega la cantidad de monedas que va a retirar");
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (respuestaNumero>=0 && respuestaNumero-monedasDosPesos.size()<=0)
					{
						for (int i=0;i<respuestaNumero;i++) {
							monedasDosPesos.pop();	
						}
					}
					else
					{
						System.out.println("No se puede quitar esa cantidad de monedass");
					}	
					System.out.println("Monedas que hay: "+monedasDosPesos.size());	
					break;
				case 4:
					System.out.println("Agrega la cantidad de monedas que va a retirar");
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (respuestaNumero>=0 && respuestaNumero-monedasCincoPesos.size()<=0)
					{
						for (int i=0;i<respuestaNumero;i++) {
							monedasCincoPesos.pop();	
						}
					}
					else
					{
						System.out.println("No se puede quitar esa cantidad de monedass");
					}	
					System.out.println("Monedas que hay: "+monedasCincoPesos.size());	
					break;
				case 5:
					System.out.println("Agrega la cantidad de monedas que va a retirar");
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (respuestaNumero>=0 && respuestaNumero-monedasDiezPesos.size()<=0)
					{
						for (int i=0;i<respuestaNumero;i++) {
							monedasDiezPesos.pop();	
						}
					}
					else
					{
						System.out.println("No se puede quitar esa cantidad de monedass");
					}	
					System.out.println("Monedas que hay: "+monedasDiezPesos.size());	
					break;
				case 6:
					System.out.println("Agrega la cantidad de monedas que va a retirar");
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);
					if (respuestaNumero>=0 && respuestaNumero-monedasVeintePesos.size()<=0)
					{
						for (int i=0;i<respuestaNumero;i++) {
							monedasVeintePesos.pop();	
						}
					}
					else
					{
						System.out.println("No se puede quitar esa cantidad de monedass");
					}	
					System.out.println("Monedas que hay: "+monedasVeintePesos.size());	
					break;

				default:
					System.out.println("Escoge un numero del 1 al 7");
					break;

				}
				break;
			case 5:
				System.out.println("Estado Maquina");
				System.out.println("Monedas:");
				System.out.println("Pila de monedas de 0.50: "+monedasCincuentaCentavos.toString());
				System.out.println("Total de monedas de 0.50: "+monedasCincuentaCentavos.size());
				System.out.println("Pila de monedas de 1: "+monedasUnPeso.toString());
				System.out.println("Total de monedas de 0.1: "+monedasUnPeso.size());
				System.out.println("Pila de monedas de 2: "+monedasDosPesos.toString());
				System.out.println("Total de monedas de 2: "+monedasDosPesos.size());
				System.out.println("Pila de monedas de 5: "+monedasCincoPesos.toString());
				System.out.println("Total de monedas de 5: "+monedasCincoPesos.size());
				System.out.println("Pila de monedas de 10: "+monedasDiezPesos.toString());
				System.out.println("Total de monedas de 10: "+monedasDiezPesos.size());
				System.out.println("Pila de monedas de 20: "+monedasVeintePesos.toString());
				System.out.println("Total de monedas de 20: "+monedasVeintePesos.size());
				System.out.println("Productos");
				System.out.println("Total de productos de Coca cola: "+cocaCola.size());
				System.out.println("Total de productos de Fanta: "+fanta.size());
				System.out.println("Total de productos de Galletas Oreo: "+galletasOreo.size());
				System.out.println("Total de productos de Jugo: "+jugo.size());
				System.out.println("Total de productos de Snikers: "+snikers.size());
				System.out.println("Total de productos de Sprite "+sprite.size());

				break;
			case 6:
				double saldo = 0;
				boolean continuarIngresando = true;

				System.out.println("Comprar");

				while (continuarIngresando) {
					System.out.println("Agrega las monedas:");
					System.out.println("Que moneda insertara: "+"\n"+"1)0.5"+"\n"+"2)1"+"\n"+"3)2"+"\n"+"4)5"+"\n"+"5)10"+"\n"+"6)20"+"\n"+"7)Dejar de insertar monedas"+"\n"+"Escoge una opcion:");
					respuestaCadena = leer.nextLine();
					respuestaNumero = Integer.parseInt(respuestaCadena);

					switch (respuestaNumero) {
					case 1:
						double moneda = 0.5;
						if (monedasCincuentaCentavos.size() < 30) {
							monedasCincuentaCentavos.push(moneda);
							saldo += moneda;
						} else {
							System.out.println("No hay espacio para esas monedas");
						}
						break;
					case 2:
						moneda = 1;
						if (monedasUnPeso.size() <30) {
							monedasUnPeso.push(moneda);
							saldo += moneda;
						} else {
							System.out.println("No hay espacio para esas monedas");
						}
						break;
					case 3:
						moneda = 2;
						if (monedasDosPesos.size() < 30) {
							monedasDosPesos.push(moneda);
							saldo += moneda;
						} else {
							System.out.println("No hay espacio para esas monedas");
						}
						break;
					case 4:
						moneda = 5;
						if (monedasCincoPesos.size() < 30) {
							monedasCincoPesos.push(moneda);
							saldo += moneda;
						} else {
							System.out.println("No hay espacio para esas monedas");
						}
						break;
					case 5:
						moneda = 10;
						if (monedasDiezPesos.size() < 30) {
							monedasDiezPesos.push(moneda);
							saldo += moneda;
						} else {
							System.out.println("No hay espacio para esas monedas");
						}
						break;
					case 6:
						moneda = 20;
						if (monedasVeintePesos.size() < 30) {
							monedasVeintePesos.push(moneda);
							saldo += moneda;
						} else {
							System.out.println("No hay espacio para esas monedas");
						}
						break;
					case 7:
						continuarIngresando = false; // Dejar de insertar monedas
						break;
					default:
						System.out.println("Opción no válida, escoge un numero del 1 al 7");
						break;
					}
				}

				// Mostrar el saldo al final
				System.out.println("Saldo: " + saldo+"$");
				if (saldo>=10) {
					System.out.println("Que producto desea comprar: "+"\n"+"1)Coca Cola (1111) (15$)"+"\n"+"2)Fanta(1234) (20$)"+"\n"+"3)Galletas Oreo(3333) (10$)"+"\n"+"4)Jugo (1478) (10$)"+"\n"+"5)Snikers (7894)(12$)"+"\n"+"6)Sprite (9999) (18$)");
					System.out.println("7 8 9"+"\n"+"4 5 6"+"\n"+"1 2 3");
					System.out.println("Agregar los digitos del producto deseado");
					numeroProducto="";
					for (int i = 0; i < 4; i++) {
						System.out.print("Ingresa el dígito " + (i + 1) + ": ");
						respuestaCadena = leer.nextLine();
						if (respuestaCadena.length() == 1 && Character.isDigit(respuestaCadena.charAt(0))) {
							numeroProducto += respuestaCadena; // Concatenar el dígito
						} else {
							System.out.println("Entrada no válida. Ingresa un solo dígito.");
							i--; 
						}
					}
					productoSeleccionado=Integer.parseInt(numeroProducto);
					switch (productoSeleccionado) {
					case 1111:
						if (saldo>=15) {
							if (cocaCola.size()!=0) {
								Double cambioProducto=saldo-15;
								Pilas cambioPila = new Pilas(30);

								while (cambioProducto >= 0) {
									if (cambioProducto >= 20.0 && !monedasVeintePesos.isEmpty()) {
										double moneda = (double) monedasVeintePesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 10.0 && !monedasDiezPesos.isEmpty()) {
										double moneda = (double) monedasDiezPesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 5.0 && !monedasCincoPesos.isEmpty()) {
										double moneda = (double)monedasCincoPesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 2.0 && !monedasDosPesos.isEmpty()) {
										double moneda = (double) monedasDosPesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 1.0 && !monedasUnPeso.isEmpty()) {
										double moneda = (double) monedasUnPeso.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 0.5 && !monedasCincuentaCentavos.isEmpty()) {
										double moneda = (double) monedasCincuentaCentavos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else {
										System.out.println("No se puede dar el cambio completo. Por favor, recoja su dinero.");
										break;
									}
								}
								// Mostrar el cambio dado
								System.out.println("Cambio dado:");
								while (!cambioPila.isEmpty()) {
									double moneda = (double)cambioPila.pop();
									System.out.println(moneda + "$");
								}
								System.out.println("Disfruta de tu coca cola");
								cocaCola.dequeue();
								break;
							}
							else {
								System.out.println("No hay productos");
								break;
							}
						}
						else
						{
							System.out.println("No tienes suficiente saldo para comprarlo");
							break;
						}
						/////
					case 1234:
						if (saldo>=20) {
							if (fanta.size()!=0) {
								Double cambioProducto=saldo-20;
								Pilas cambioPila = new Pilas(30);
								while (cambioProducto > 0) {
									if (cambioProducto >= 20.0 && !monedasVeintePesos.isEmpty()) {
										double moneda = (double) monedasVeintePesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 10.0 && !monedasDiezPesos.isEmpty()) {
										double moneda = (double) monedasDiezPesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 5.0 && !monedasCincoPesos.isEmpty()) {
										double moneda = (double)monedasCincoPesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 2.0 && !monedasDosPesos.isEmpty()) {
										double moneda = (double) monedasDosPesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 1.0 && !monedasUnPeso.isEmpty()) {
										double moneda = (double) monedasUnPeso.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 0.5 && !monedasCincuentaCentavos.isEmpty()) {
										double moneda = (double) monedasCincuentaCentavos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else {
										System.out.println("No se puede dar el cambio completo. Por favor, recoja su dinero.");
										break;
									}
								}
								// Mostrar el cambio dado
								System.out.println("Cambio dado:");
								while (!cambioPila.isEmpty()) {
									double moneda = (double)cambioPila.pop();
									System.out.println(moneda + "$");
								}
								System.out.println("Disfruta de tu fanta");
								fanta.dequeue();
								break;
							}
							else {
								System.out.println("No hay productos");
								break;
							}
						}
						else
						{
							System.out.println("No tienes suficiente saldo para comprarlo");
							break;
						}
						/////
					case 3333:
						if (saldo>=10) {
							if (galletasOreo.size()!=0) {
								Double cambioProducto=saldo-10;
								Pilas cambioPila = new Pilas(30);
								while (cambioProducto > 0) {
									if (cambioProducto >= 20.0 && !monedasVeintePesos.isEmpty()) {
										double moneda = (double) monedasVeintePesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 10.0 && !monedasDiezPesos.isEmpty()) {
										double moneda = (double) monedasDiezPesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 5.0 && !monedasCincoPesos.isEmpty()) {
										double moneda = (double)monedasCincoPesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 2.0 && !monedasDosPesos.isEmpty()) {
										double moneda = (double) monedasDosPesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 1.0 && !monedasUnPeso.isEmpty()) {
										double moneda = (double) monedasUnPeso.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 0.5 && !monedasCincuentaCentavos.isEmpty()) {
										double moneda = (double) monedasCincuentaCentavos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else {
										System.out.println("No se puede dar el cambio completo. Por favor, recoja su dinero.");
										break;
									}
								}
								// Mostrar el cambio dado
								System.out.println("Cambio dado:");
								while (!cambioPila.isEmpty()) {
									double moneda = (double)cambioPila.pop();
									System.out.println(moneda + "$");
								}
								System.out.println("Disfruta de tus galletas oreo");
								galletasOreo.dequeue();
								break;
							}
							else {
								System.out.println("No hay productos");
								break;
							}
						}
						else
						{
							System.out.println("No tienes suficiente saldo para comprarlo");
							break;
						}
						/////
					case 1478:
						if (saldo>=10) {
							if (jugo.size()!=0) {
								Double cambioProducto=saldo-10;
								Pilas cambioPila = new Pilas(30);
								while (cambioProducto > 0) {
									if (cambioProducto >= 20.0 && !monedasVeintePesos.isEmpty()) {
										double moneda = (double) monedasVeintePesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 10.0 && !monedasDiezPesos.isEmpty()) {
										double moneda = (double) monedasDiezPesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 5.0 && !monedasCincoPesos.isEmpty()) {
										double moneda = (double)monedasCincoPesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 2.0 && !monedasDosPesos.isEmpty()) {
										double moneda = (double) monedasDosPesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 1.0 && !monedasUnPeso.isEmpty()) {
										double moneda = (double) monedasUnPeso.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 0.5 && !monedasCincuentaCentavos.isEmpty()) {
										double moneda = (double) monedasCincuentaCentavos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else {
										System.out.println("No se puede dar el cambio completo. Por favor, recoja su dinero.");
										break;
									}
								}
								// Mostrar el cambio dado
								System.out.println("Cambio dado:");
								while (!cambioPila.isEmpty()) {
									double moneda = (double)cambioPila.pop();
									System.out.println(moneda + "$");
								}
								System.out.println("Disfruta de tu jugo");
								jugo.dequeue();
								break;
							}
							else {
								System.out.println("No hay productos");
								break;
							}
						}
						else
						{
							System.out.println("No tienes suficiente saldo para comprarlo");
							break;
						}
						/////
					case 7894:
						if (saldo>=12) {
							if (snikers.size()!=0) {
								Double cambioProducto=saldo-12;
								Pilas cambioPila = new Pilas(30);
								while (cambioProducto > 0) {
									if (cambioProducto >= 20.0 && !monedasVeintePesos.isEmpty()) {
										double moneda = (double) monedasVeintePesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 10.0 && !monedasDiezPesos.isEmpty()) {
										double moneda = (double) monedasDiezPesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 5.0 && !monedasCincoPesos.isEmpty()) {
										double moneda = (double)monedasCincoPesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 2.0 && !monedasDosPesos.isEmpty()) {
										double moneda = (double) monedasDosPesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 1.0 && !monedasUnPeso.isEmpty()) {
										double moneda = (double) monedasUnPeso.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 0.5 && !monedasCincuentaCentavos.isEmpty()) {
										double moneda = (double) monedasCincuentaCentavos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else {
										System.out.println("No se puede dar el cambio completo. Por favor, recoja su dinero.");
										break;
									}
								}
								// Mostrar el cambio dado
								System.out.println("Cambio dado:");
								while (!cambioPila.isEmpty()) {
									double moneda = (double)cambioPila.pop();
									System.out.println(moneda + "$");
								}
								System.out.println("Disfruta de tu sniker");
								snikers.dequeue();
								break;
							}
							else {
								System.out.println("No hay productos");
								break;
							}
						}
						else
						{
							System.out.println("No tienes suficiente saldo para comprarlo");
							break;
						}
						/////
					case 9999:
						if (saldo>=18) {
							if (sprite.size()!=0) {
								Double cambioProducto=saldo-18;
								Pilas cambioPila = new Pilas(30);
								while (cambioProducto > 0) {
									if (cambioProducto >= 20.0 && !monedasVeintePesos.isEmpty()) {
										double moneda = (double) monedasVeintePesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 10.0 && !monedasDiezPesos.isEmpty()) {
										double moneda = (double) monedasDiezPesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 5.0 && !monedasCincoPesos.isEmpty()) {
										double moneda = (double)monedasCincoPesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 2.0 && !monedasDosPesos.isEmpty()) {
										double moneda = (double) monedasDosPesos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 1.0 && !monedasUnPeso.isEmpty()) {
										double moneda = (double) monedasUnPeso.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else if (cambioProducto >= 0.5 && !monedasCincuentaCentavos.isEmpty()) {
										double moneda = (double) monedasCincuentaCentavos.pop();
										cambioPila.push(moneda);
										cambioProducto -= moneda;
									} else {
										System.out.println("No se puede dar el cambio completo. Por favor, recoja su dinero.");
										break;
									}
								}
								// Mostrar el cambio dado
								System.out.println("Cambio dado:");
								while (!cambioPila.isEmpty()) {
									double moneda = (double)cambioPila.pop();
									System.out.println(moneda + "$");
								}
								System.out.println("Disfruta de tu sprite");
								sprite.dequeue();
								break;
							}
							else {
								System.out.println("No hay productos");
								break;
							}
						}
						else
						{
							System.out.println("No tienes suficiente saldo para comprarlo");
							break;
						}
						/////
					default:
						System.out.println("No existe ese producto");
						break;
					}
					break;
				}        
				else
				{
					System.out.println("No tiene saldo suficiente de 10 pesos");
					double cambio = saldo;
					Pilas cambioPila = new Pilas(30);
					while (cambio > 0) {
						if (cambio >= 20.0 && !monedasVeintePesos.isEmpty()) {
							double moneda = (double) monedasVeintePesos.pop();
							cambioPila.push(moneda);
							cambio -= moneda;
						} else if (cambio >= 10.0 && !monedasDiezPesos.isEmpty()) {
							double moneda = (double) monedasDiezPesos.pop();
							cambioPila.push(moneda);
							cambio -= moneda;
						} else if (cambio >= 5.0 && !monedasCincoPesos.isEmpty()) {
							double moneda = (double)monedasCincoPesos.pop();
							cambioPila.push(moneda);
							cambio -= moneda;
						} else if (cambio >= 2.0 && !monedasDosPesos.isEmpty()) {
							double moneda = (double) monedasDosPesos.pop();
							cambioPila.push(moneda);
							cambio -= moneda;
						} else if (cambio >= 1.0 && !monedasUnPeso.isEmpty() ) {
							double moneda = (double) monedasUnPeso.pop();
							cambioPila.push(moneda);
							cambio -= moneda;
						} else if (cambio >= 0.5 && !monedasCincuentaCentavos.isEmpty()) {
							double moneda = (double) monedasCincuentaCentavos.pop();
							cambioPila.push(moneda);
							cambio -= moneda;
						} else {
							System.out.println("No se puede dar el cambio completo. Por favor, recoja su dinero.");
							break;
						}
					}
					// Mostrar el cambio dado
					System.out.println("Cambio dado:");
					while (!cambioPila.isEmpty()) {
						double moneda = (double)cambioPila.pop();
						System.out.println(moneda + "$");
					}
					break;
				}
			case 7:
				System.out.println("Salir");
				respuesta=false;
				break;
			default:
				System.out.println("Escoge un numero del 1 al 7");
			}
		} while (respuesta==true);
	}
}
