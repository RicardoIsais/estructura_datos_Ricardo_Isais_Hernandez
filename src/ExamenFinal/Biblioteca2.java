package ExamenFinal;
import java.util.Scanner;
import Estructuras.nodos.LinkedStack;

import ArrayList.ArrayList;

public class Biblioteca2 {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
        Scanner leer = new Scanner(System.in);
        ArrayList clavesLibros = new ArrayList();
        ArrayList fechasLibros = new ArrayList();
        ArrayList librosOrdenados = new ArrayList();
        System.out.print("Agregar la cantidad de claves: ");
        String cantidad = leer.nextLine();
        int cantidadNumero = Integer.parseInt(cantidad);
        for (int i = 0; i < cantidadNumero; i++) {
            int año = (int) (Math.random() * (2007 - 1990 + 1)) + 1990;
            int numeroLibro = (int) (Math.random() * 10000);
            String claveLibro = String.format("ISBN-%04d-%04d", año, numeroLibro);
            clavesLibros.add(claveLibro);
        }
        imprimirArreglo(clavesLibros);
        System.out.print("Libros ordenados: ");
        for (int i = 0; i < clavesLibros.size(); i++) {
            String libro = (String) clavesLibros.get(i);
            String[] partes = libro.split("-");
            String fechalibro = partes[1]; 
            int fecha = Integer.parseInt(fechalibro);
            fechasLibros.add(fecha);
            
        }
        ordenacionSeleccion(fechasLibros);
        System.out.println("\nVector ordenado de menor a mayor");
        imprimirArreglo(fechasLibros);
        librosOrdenados=ordenacionDelibros(clavesLibros,fechasLibros);
        imprimirArreglo(librosOrdenados);
        
        
        


	}
    public static void imprimirArreglo(ArrayList lista) throws Exception {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i) + " ");
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
    
    
    public static ArrayList ordenacionDelibros(ArrayList lista,ArrayList fechas ) throws Exception{
        ArrayList libros = new ArrayList();
        for (int i = 0; i < lista.size(); i++) {
            String libro = (String) lista.get(i);
            String[] partes = libro.split("-");
            String fechalibro = partes[1]; 
            int fecha = Integer.parseInt(fechalibro);
            if (fecha==(int)fechas.get(i)) {
            	libros.add(libro);
            	
            }     
        }
        return libros;
    }
    

    
	
	






}
