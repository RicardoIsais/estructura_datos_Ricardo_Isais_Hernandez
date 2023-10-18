package ArrayList;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TareaOrdenamientos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cantidad;
        int cantidadNumero;
        
        System.out.print("Agregar la cantidad de numeros: ");
        cantidad = leer.nextLine();
        cantidadNumero = Integer.parseInt(cantidad);

        if (cantidadNumero > 1 && cantidadNumero <= 100) {
            ArrayList arregloEnteros = new ArrayList();
            Random aleatorio = new Random();

            System.out.print("Los números aleatorios son: ");
            for (int i = 0; i < cantidadNumero; i++) {
                int numeroAleatorio = aleatorio.nextInt(100);
                arregloEnteros.add(numeroAleatorio);
                System.out.print(numeroAleatorio + " ");
            }
            
            ordenacionQuickSort(arregloEnteros);
            System.out.println("\nVector ordenado de menor a mayor");
            imprimirArreglo(arregloEnteros);
        }
        else
        {
        	System.out.println("Escribe un numero mayor de 1 al 100");
        }
    }

    public static void ordenacionQuickSort(ArrayList lista) {
        int[] arregloEntero = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
        	arregloEntero[i] =(int) lista.get(i);
        }
        quickSort(arregloEntero, 0, arregloEntero.length - 1);
        for (int i = lista.size() - 1; i >= 0; i--) {
            lista.remove(i);
        }
        for (int i : arregloEntero) {
            lista.add(i);
        }
    }

    public static void quickSort(int[] vec, int inicio, int fin) {
        if (inicio < fin ) {
            int pivoteIndex = division(vec, inicio, fin);
            quickSort(vec, inicio, pivoteIndex - 1);
            quickSort(vec, pivoteIndex + 1, fin);
        }
    }

    public static int division(int[] vec, int inicio, int fin) {
        int pivote = vec[fin];
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (vec[j] < pivote) {
                i++;
                int temp = vec[i];
                vec[i] = vec[j];
                vec[j] = temp;
            }
        }

        
        int temp = vec[i + 1];
        vec[i + 1] = vec[fin];
        vec[fin] = temp;

        return i + 1;
    }


    public static void imprimirArreglo(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
    }
}
