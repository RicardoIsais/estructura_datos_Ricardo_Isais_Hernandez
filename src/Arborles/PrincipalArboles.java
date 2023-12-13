package Arborles;

public class PrincipalArboles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   BiTree arbol = new BiTree();

	        // Agregando nodos al árbol
	        arbol.add(67);
	        arbol.add(43);
	        arbol.add(11);
	        arbol.add(55);
	        arbol.add(5);
	        arbol.add(13);
	        arbol.add(50);
	        arbol.add(56);
	        arbol.add(80);
	        arbol.add(70);
	        arbol.add(92);
	        arbol.add(68);
	        arbol.add(74);
	        arbol.add(90);
	        arbol.add(95);

	        // Recorrido en preorden
	        System.out.println("Recorrido en preorden:");
	        arbol.preorden();

	        // Recorrido en inorden
	        System.out.println("\nRecorrido en inorden:");
	        arbol.inorder();

	        // Recorrido en postorden
	        System.out.println("\nRecorrido en postorden:");
	        arbol.postorden();


		    }
		


	

}
