package ArrayList;
import ArrayList.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TareaOrdenamientos {

    public static void main(String[] args)throws Exception {
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
            
            //ordenacionQuicksort(arregloEnteros, 0, arregloEnteros.size() - 1);
            //System.out.println("\nVector ordenado de menor a mayor");
            //imprimirArreglo(arregloEnteros);
            //ordenacionShellSort(arregloEnteros);
            //System.out.println("\nVector ordenado de menor a mayor");
            //imprimirArreglo(arregloEnteros);
            ordenacionSeleccion(arregloEnteros);
            System.out.println("\nVector ordenado de menor a mayor");
            imprimirArreglo(arregloEnteros);
        }
        else
        {
        	System.out.println("Escribe un numero mayor de 1 al 100");
        }
    }

    public static void ordenacionQuicksort (ArrayList lista, int izquierda, int derecha)throws Exception {
        if (izquierda >= derecha) {
            return;
        }
        int pivote =(int)lista.get(izquierda);  //Iniciar con el primer elemento de la lista como pivote
        int i = izquierda;
        int j = derecha;
        while (i < j) {
            while ((int)lista.get(i) <= pivote && i < j) {
                i++;
            }
            while ((int)lista.get(j) > pivote) {
                j--;
            }
            if (i < j) {
                int aux =(int) lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, aux);
            }
        }
        lista.set(izquierda, lista.get(j));
        lista.set(j, pivote);
        ordenacionQuicksort(lista, izquierda, j - 1);
        ordenacionQuicksort(lista, j + 1, derecha);
    }
    public static void imprimirArreglo(ArrayList lista)throws Exception {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
    }

    public static void ordenacionShellSort(ArrayList lista)throws Exception {
        int intervalo = lista.size() / 2;

        while (intervalo > 0) {
            for (int i = intervalo; i < lista.size(); i = i + 1) {
                int elemento = (int) lista.get(i);
                int j = i;
                while (j >= intervalo && (int) lista.get(j - intervalo) > elemento) {
                    lista.set(j, lista.get(j - intervalo));
                    j = j - intervalo;
                }
                lista.set(j, elemento);
            }
            intervalo = intervalo / 2; 
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


     
    
}
