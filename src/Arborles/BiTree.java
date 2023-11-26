package Arborles;
import Estructuras.nodos.NumericNodoArbol;

public class BiTree {
	
	private NumericNodoArbol root;
	
	public BiTree() {
		root=null;
	}
	
	public void add(int valor) {
		if (null==root) {
			root=new NumericNodoArbol();
			root.setDato(valor);
		}
		else {
			NumericNodoArbol nodo=new NumericNodoArbol();
			nodo.setDato(valor);
			add(nodo,root);
			
		}
	}
	
	private void add(NumericNodoArbol valor, NumericNodoArbol r) {
		if (valor.getDato( )> r.getDato()) {
			if(null==r.getDerecha()) {
				r.setDerecha(valor);
			}
			else {
				add(valor,r.getDerecha());
			}
		}else {
			if(null==r.getIzquierda()) {
				r.setIzquierda(valor);
			}
			else {
				add(valor,r.getIzquierda());
			}
			
		}
		
	}
	public void preorden() {
		preorden(r);
	}
	private void preorden (NumericNodoArbol nodo) {
		if(null==nodo) {
			return;
		}
		System.out.print(nodo.getDato());
		preorden(nodo.getIzquierda());
		preorden(nodo.getDerecha());

		
	}

}
