package ExamenFinal;
import ArrayList.ArrayList;

import java.util.Random;
import java.util.Scanner;

//Los numeros repetidos 


public class Biblioteca {

	public static void main(String[] args)throws Exception  {
        Scanner leer = new Scanner(System.in);
        String cantidad;
        int cantidadNumero;
        System.out.print("Agregar la cantidad de numeros: ");
        cantidad = leer.nextLine();
        cantidadNumero = Integer.parseInt(cantidad);

        if (cantidadNumero > 1 && cantidadNumero <= 100) {
            ArrayList arregloEnteros1 = new ArrayList();
            Random aleatorio = new Random();

            System.out.print("Los números aleatorios son: (lista 1)");
            for (int i = 0; i < cantidadNumero; i++) {
                int numeroAleatorio = aleatorio.nextInt(100);
                arregloEnteros1.add(numeroAleatorio);
                System.out.print(numeroAleatorio + " ");
            }
            
            ordenacionSeleccion(arregloEnteros1);
            System.out.println("\nVector ordenado de menor a mayor ");
            imprimirArreglo(arregloEnteros1);
            ArrayList arregloEnteros2 = new ArrayList();
            aleatorio = new Random();

            System.out.print("Los números aleatorios son: (lista 2) ");
            for (int i = 0; i < cantidadNumero; i++) {
                int numeroAleatorio = aleatorio.nextInt(100);
                arregloEnteros2.add(numeroAleatorio);
                System.out.print(numeroAleatorio + " ");
            }
            
            ordenacionSeleccion(arregloEnteros2);
            System.out.println("\nVector ordenado de menor a mayor");
            imprimirArreglo(arregloEnteros2);
            ArrayList arregloEnterosOrdenado = new ArrayList();
            
            encontrarNumerosIguales(arregloEnteros1,arregloEnteros2 , arregloEnterosOrdenado);
            System.out.println("\nNumeros repetidos");
            imprimirArreglo(arregloEnterosOrdenado);
            
            
            ordenacionSeleccion(arregloEnterosOrdenado);
            System.out.println("\nVector ordenado de menor a mayor");
            imprimirArreglo(arregloEnterosOrdenado);
           
        }

        else
        {
        	System.out.println("Escribe un numero mayor de 1 al 100");
        }

	}
    public static void imprimirArreglo(ArrayList lista)throws Exception {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
    }
    public static void ordenacionSeleccion(ArrayList lista) throws Exception{
        for (int i = 0; i < lista.size() - 1; i++) {
            int minimo = i;
            int temp=0;
            for (int j = i + 1; j < lista.size(); j++) {
                if ((int) lista.get(j) < (int) lista.get(minimo)) {
                    minimo = j;
                }
            }
            temp =(int) lista.get(i);
            lista.set(i, lista.get(minimo));
            lista.set(minimo, temp);
        }
    }
    
    public static void encontrarNumerosIguales(ArrayList lista1, ArrayList lista2 ,ArrayList listaNumerosRepetidos)throws Exception {

        for (int i = 0; i < lista1.size(); i++) {
            for (int j = 0; j < lista1.size(); j++) {
            	if (lista1.get(i)==lista2.get(j)) {
            		listaNumerosRepetidos.add(lista1.get(i));
            	}      
            }
        }
    }
    
    

}



