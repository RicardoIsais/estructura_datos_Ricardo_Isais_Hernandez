package Colas;
import Estructuras.pilas.Pilas;
import Colas.CircularQueue;
import java.util.Scanner;

public class TareaMaquinaExpendedora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner leer = new Scanner(System.in);
    	CircularQueue cocaCola=new CircularQueue(20);
    	CircularQueue fanta=new CircularQueue(20);
    	CircularQueue galletasOreo=new CircularQueue(20);
    	CircularQueue jugo=new CircularQueue(20);
    	CircularQueue snikers=new CircularQueue(20);
    	CircularQueue sprite=new CircularQueue(20);
    	Pilas monedasUnPeso = new Pilas(30);
    	Pilas monedasDosPesos = new Pilas(30);
    	Pilas monedasCincoPesos = new Pilas(30);
    	Pilas monedasDiezPesos = new Pilas(30);
    	Pilas monedasCincuentaCentavos = new Pilas(30);
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
        boolean respuesta;
        int respuestaNumero;
        do {
        System.out.println("Maquina expendedora de alimentos");
        System.out.println("Menu: "+"\n"+"1)Agregar Productos"+"\n"+"2)Retirar Productos"+"\n"+"3)Agregar Monedas"+"\n"+"4)Retirar Monedas"+"\n"+"5)Estado Maquina"+"\n"+"6)Comprar"+"\n"+"Escoge una opcion:");
        respuestaCadena = leer.nextLine();
        respuestaNumero = Integer.parseInt(respuestaCadena);
        switch (respuestaNumero) {
        case 1:
        	System.out.println("Agregar Productos");
        	System.out.println("Que producto agregara: "+"\n"+"1)Coca Cola"+"\n"+"2)Fanta"+"\n"+"3)Galletas Oreo"+"\n"+"4)Jugo"+"\n"+"5)Snikers"+"\n"+"6)Sprite"+"\n"+"Escoge una opcion:");
            respuestaCadena = leer.nextLine();
            respuestaNumero = Integer.parseInt(respuestaCadena);
            switch (respuestaNumero) {
            case 1:
            	System.out.println("Agrega la cantidad de productos");
            	respuestaCadena = leer.nextLine();
                respuestaNumero = Integer.parseInt(respuestaCadena);
                if (cocaCola.size()<20 && respuestaNumero<=20 && respuestaNumero+cocaCola.size()<=20)
                {
                	for (int i=0;i<respuestaNumero && cocaCola.size()<20;i++) {
                		cocaCola.enqueue(i+1);	
                }	
                }
                else
                {
                	System.out.println("No hay espacio para esos productos");
                }	
                System.out.println("Productos que hay: "+cocaCola.size());
                break;
        case 2:
        	System.out.println("Agrega la cantidad de productos");
        	respuestaCadena = leer.nextLine();
            respuestaNumero = Integer.parseInt(respuestaCadena);
            if (fanta.size()<20 && respuestaNumero<=20 && respuestaNumero+fanta.size()<=20)
            {
            	for (int i=0;i<respuestaNumero && fanta.size()<20;i++) {
            		fanta.enqueue(i+1);	
            }	
            }
            else
            {
            	System.out.println("No hay espacio para esos productos");
            }	
            System.out.println("Productos que hay: "+fanta.size());
        	break;
        case 3:
        	System.out.println("Agrega la cantidad de productos");
        	respuestaCadena = leer.nextLine();
            respuestaNumero = Integer.parseInt(respuestaCadena);
            if (galletasOreo.size()<20 && respuestaNumero<=20 && respuestaNumero+galletasOreo.size()<=20)
            {
            	for (int i=0;i<respuestaNumero && galletasOreo.size()<20;i++) {
            		galletasOreo.enqueue(i+1);	
            }	
            }
            else
            {
            	System.out.println("No hay espacio para esos productos");
            }	
            System.out.println("Productos que hay: "+galletasOreo.size());
        	break;
        case 4:
        	System.out.println("Agrega la cantidad de productos");
        	respuestaCadena = leer.nextLine();
            respuestaNumero = Integer.parseInt(respuestaCadena);
            if (jugo.size()<20 && respuestaNumero<=20 && respuestaNumero+jugo.size()<=20)
            {
            	for (int i=0;i<respuestaNumero && jugo.size()<20;i++) {
            		jugo.enqueue(i+1);	
            }	
            }
            else
            {
            	System.out.println("No hay espacio para esos productos");
            }	
            System.out.println("Productos que hay: "+jugo.size());
            break;
    case 5:
    	System.out.println("Agrega la cantidad de productos");
    	respuestaCadena = leer.nextLine();
        respuestaNumero = Integer.parseInt(respuestaCadena);
        if (snikers.size()<20 && respuestaNumero<=20 && respuestaNumero+snikers.size()<=20)
        {
        	for (int i=0;i<respuestaNumero && snikers.size()<20;i++) {
        		snikers.enqueue(i+1);	
        }	
        }
        else
        {
        	System.out.println("No hay espacio para esos productos");
        }	
        System.out.println("Productos que hay: "+ snikers.size());
    	break;
    case 6:
    	System.out.println("Agrega la cantidad de productos");
    	respuestaCadena = leer.nextLine();
        respuestaNumero = Integer.parseInt(respuestaCadena);
        if (sprite.size()<20 && respuestaNumero<=20 && respuestaNumero+sprite.size()<=20)
        {
        	for (int i=0;i<respuestaNumero && sprite.size()<20;i++) {
        		sprite.enqueue(i+1);	
        }	
        }
        else
        {
        	System.out.println("No hay espacio para esos productos");
        }	
        System.out.println("Productos que hay: "+sprite.size());
    	break;
        
        }
            break;
    	
        
        	
        case 2:
        	System.out.println("Retirar Productos");
        	System.out.println("Que producto desea retirar: "+"\n"+"1)Coca Cola"+"\n"+"2)Fanta"+"\n"+"3)Galletas Oreo"+"\n"+"4)Jugo"+"\n"+"5)Snikers"+"\n"+"6)Sprite"+"\n"+"Escoge una opcion:");
            respuestaCadena = leer.nextLine();
            respuestaNumero = Integer.parseInt(respuestaCadena);
            switch (respuestaNumero) {
            case 1:
            	System.out.println("Agrega la cantidad de productos que va a retirar");
            	respuestaCadena = leer.nextLine();
                respuestaNumero = Integer.parseInt(respuestaCadena);
                if (respuestaNumero<=20 && respuestaNumero-cocaCola.size()<=0)
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
        case 2:
        	System.out.println("Agrega la cantidad de productos que va a retirar");
        	respuestaCadena = leer.nextLine();
            respuestaNumero = Integer.parseInt(respuestaCadena);
            if (respuestaNumero<=20 && respuestaNumero-fanta.size()<=0)
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
        case 3:
        	System.out.println("Agrega la cantidad de productos que va a retirar");
        	respuestaCadena = leer.nextLine();
            respuestaNumero = Integer.parseInt(respuestaCadena);
            if (respuestaNumero<=20 && respuestaNumero-galletasOreo.size()<=0)
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
        case 4:
        	System.out.println("Agrega la cantidad de productos");
        	respuestaCadena = leer.nextLine();
            respuestaNumero = Integer.parseInt(respuestaCadena);
            if (respuestaNumero<=20 && respuestaNumero-jugo.size()<=0)
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
    case 5:
    	System.out.println("Agrega la cantidad de productos");
    	respuestaCadena = leer.nextLine();
        respuestaNumero = Integer.parseInt(respuestaCadena);
        if (respuestaNumero<=20 && respuestaNumero-snikers.size()<=0)
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
    case 6:
    	System.out.println("Agrega la cantidad de productos");
    	respuestaCadena = leer.nextLine();
        respuestaNumero = Integer.parseInt(respuestaCadena);
        if (respuestaNumero<=20 && respuestaNumero-sprite.size()<=0)
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
        
        }
        	break;
        case 3:
        	System.out.println("Agregar Monedas");
        	System.out.println("Que moneda agregara: "+"\n"+"1)0.5"+"\n"+"2)1"+"\n"+"3)2"+"\n"+"4)5"+"\n"+"5)10"+"\n"+"Escoge una opcion:");
            respuestaCadena = leer.nextLine();
            respuestaNumero = Integer.parseInt(respuestaCadena);
            switch (respuestaNumero) {
            case 1:
            	System.out.println("Agrega la cantidad de monedas");
            	double moneda=0.5;
            	respuestaCadena = leer.nextLine();
                respuestaNumero = Integer.parseInt(respuestaCadena);
                if (monedasCincuentaCentavos.size()<30 && respuestaNumero<=30 && monedasCincuentaCentavos.size()+respuestaNumero<=30) {
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
                if (monedasUnPeso.size()<30 && respuestaNumero<=30 && monedasUnPeso.size()+respuestaNumero<=30) {
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
                if (monedasDosPesos.size()<30 && respuestaNumero<=30 && monedasDosPesos.size()+respuestaNumero<=30) {
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
                if (monedasCincoPesos.size()<30 && respuestaNumero<=30 && monedasCincoPesos.size()+respuestaNumero<=30) {
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
                if (monedasDiezPesos.size()<30 && respuestaNumero<=30 && monedasDiezPesos.size()+respuestaNumero<=30) {
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
            }
        	break;
        case 4:
        	System.out.println("Retirar monedas");
        	System.out.println("Que moneda desea retirar: "+"\n"+"1)0.5"+"\n"+"2)1"+"\n"+"3)2"+"\n"+"4)5"+"\n"+"5)10"+"\n"+"Escoge una opcion:");
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
            System.out.println("Productos");
            System.out.println("Total de productos de Coca cola: "+cocaCola.size());
            System.out.println("Total de productos de Fanta: "+fanta.size());
            System.out.println("Total de productos de Galletas Oreo: "+galletasOreo.size());
            System.out.println("Total de productos de Jugo: "+jugo.size());
            System.out.println("Total de productos de Snikers: "+snikers.size());
            System.out.println("Total de productos de Sprite "+sprite.size());
    
        	break;
        	
        }
        System.out.print("\n¿Desea ejecutar el programa nuevamente? Poner 1 si es asi / poner otro numero diferente a 1: ");
		respuestaCadena= leer.nextLine();
		respuestaNumero = Integer.parseInt(respuestaCadena); 
		if (respuestaNumero==1)
		{
			respuesta=true;	
		}
		else
		{
			System.out.print("Fin del programa");
			respuesta=false;
		}
        } while (respuesta==true);

	}

}
