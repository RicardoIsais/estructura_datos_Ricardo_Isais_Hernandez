package Estructuras.pruebas;
import Estructuras.pilas.Pilas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pilas pila= new Pilas(10);
		System.out.println(pila.isEmpty());
		System.out.println(pila.size());
		System.out.println(pila.peek());
		pila.push(10);
		pila.push(20);
		pila.push(30);
		Object value=pila.pop();
		System.out.println(value);
		System.out.println(pila.peek());
		

	}

}
