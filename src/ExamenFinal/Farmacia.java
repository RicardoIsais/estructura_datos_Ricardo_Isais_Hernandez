package ExamenFinal;
import ArrayList.ArrayList;

import java.util.Scanner;

public class Farmacia {

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        ArrayList inventario = new ArrayList();
        ArrayList ventas = new ArrayList();
        
        // Productos iniciales de la farmacia
        inventario.add("KETOROLACO" + "/" + "1023125697" + "/" + "100" + "/" + "21/11/2017");
        inventario.add("PARACETAMOL" + "/" + "1536849301" + "/" + "50" + "/" + "02/09/2017");
        inventario.add("ATROVENT" + "/" + "1208793001" + "/" + "1000" + "/" + "12/01/2017");
        inventario.add("FENITOINA" + "/" + "4689430150" + "/" + "500" + "/" + "30/07/2017");
        inventario.add("KETOROLACO" + "/" + "1023125697" + "/" + "100" + "/" + "25/08/2018");
        inventario.add("ATROVENT" + "/" + "1208793001" + "/" + "1000" + "/" + "12/08/2017");
        inventario.add("ATROVENT" + "/" + "1208793001" + "/" + "1000" + "/" + "01/08/2017");
        inventario.add("KETOROLACO" + "/" + "1023125697" + "/" + "100" + "/" + "02/08/2019");
        inventario.add("KETOROLACO" + "/" + "1023125697" + "/" + "100" + "/" + "21/10/2019");

        System.out.println("Inventario inicial: ");
        imprimirArreglo(inventario);

        boolean salir = false;
        while (!salir) {
            System.out.println("Menu principal: \n1) Agregar productos\n2) Vender\n3) Ver ventas\n4) Salir");
            int opcionMenuPrincipal = leer.nextInt();
            switch (opcionMenuPrincipal) {
                case 1:
                    System.out.println("Agregar producto: ");
                    String precio;
                    String codigo;
                    leer.nextLine(); 
                    System.out.println("Ingresa el nombre: ");
                    String nombre = leer.nextLine();
                    if (!encontrarNombre(inventario, nombre)) {
                        System.out.println("Ingresa el codigo: ");
                        codigo = leer.nextLine();
                        if(codigo.length()==10 && encontrarCodigoDeBarrasVerdadero(inventario, nombre)==false) {
                             System.out.println("Ingresa el precio: ");
                             precio = leer.nextLine();
                             System.out.println("Ingresa la fecha de caducidad: (Como este ejemplo: 02/08/2019)");
                             String fecha = leer.nextLine();
                             String productoAgregado=nombre+"/"+codigo+"/"+precio+"/"+fecha;
                             System.out.println( productoAgregado);
                             inventario.add(productoAgregado);
                             
                        }
                        else {
                        	System.out.println("Codigo no valido");
                        }
                        
                    }
                    else {
                    	System.out.println("Esta el nombre");
                    	System.out.println("Codigo de barra:" + encontrarCodigoDeBarras(inventario, nombre));
                    	codigo=encontrarCodigoDeBarras(inventario, nombre);
                        System.out.println("Ingresa el precio: ");
                        precio = leer.nextLine();
                        System.out.println("Ingresa la fecha de caducidad: (Como este ejempelo: 02/08/2019)");
                        String fecha = leer.nextLine();
                        String productoAgregado=nombre+"/"+codigo+"/"+precio+"/"+fecha;
                        System.out.println( productoAgregado);
                        inventario.add(productoAgregado);
                    	
                    }
                    break;
                case 2:
                	int cantidadVenta=0;
                	if (inventario.size()>0) {
                		boolean terminar = false;
                        while (!terminar) {
                            System.out.println("Menu principal: \n1) Vender\n2) Salir\n");
                            int opcionMenuPrincipalVenta = leer.nextInt();
                            switch (opcionMenuPrincipalVenta) {
                            case 1:
                		imprimirArregloConIndice(inventario);
                        System.out.println("Ingresa el indice que quieres del producto: ");
                        int indice = leer.nextInt();
                        if (indice>=0 && indice<=inventario.size()) {
                            String producto = (String) inventario.get(indice);
                            String[] partes = producto.split("/");
                            String precioProducto = partes[2];
                            int precioEntero;
                            precioEntero = Integer.parseInt(precioProducto);
                            cantidadVenta=cantidadVenta+precioEntero;
                            ventas.add(producto);
                            inventario.remove(indice);
                            
                        }
                        else {
                        	System.out.println("Ingresa un indice valido");
                        	
                        }
                        break;
                            case 2:
                             System.out.println("Venta total: "+cantidadVenta);	
                             System.out.println("Saliendo de la venta");
                             terminar = true;
                             break;
                            	
                            }
                        }
                        
                	}
                        
                	else {
                		System.out.println("No hay productos");
                	}
  
                	
                    
                    break;
                    
                case 3:
                	if (ventas.size()>0) {
                		imprimirArreglo(ventas);
                	}else
                	{
                		System.out.println("No hay ventas");
                	}
                	
                    
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }

    public static void imprimirArreglo(ArrayList lista) throws Exception {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i) + " ");
        }
    }
    public static void imprimirArregloConIndice(ArrayList lista) throws Exception {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i+")"+lista.get(i) + " ");
        }
    }

    public static boolean encontrarNombre(ArrayList lista, String nombre) throws Exception {
        boolean respuesta = false;
        for (int i = 0; i < lista.size(); i++) {
            String producto = (String) lista.get(i);
            String[] partes = producto.split("/");
            String nombreProducto = partes[0]; 

            if (nombreProducto.equals(nombre)) {
                respuesta = true;
                break;
            }
        }
        return respuesta;
    }
    
    public static String encontrarCodigoDeBarras(ArrayList lista, String nombre) throws Exception {
        String codigo = "";
        for (int i = 0; i < lista.size(); i++) {
            String producto = (String) lista.get(i);
            String[] partes = producto.split("/");
            String nombreProducto = partes[0]; 
            if (nombreProducto.equals(nombre)) {
                codigo = partes[1]; 
                break;
            }
        }
        return codigo;
    }
    
    
    public static boolean encontrarCodigoDeBarrasVerdadero(ArrayList lista, String nombre) throws Exception {
         boolean respuesta=false;
        for (int i = 0; i < lista.size(); i++) {
            String producto = (String) lista.get(i);
            String[] partes = producto.split("/");
            String nombreProducto = partes[0]; 
            if (nombreProducto.equals(nombre)) {
                respuesta=true;
                break;
            }
        }
        return respuesta;
    }
    
    

}
