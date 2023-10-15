package Colas;

import Estructuras.nodos.NumericNodo;

public class NumericPriorityQueue {
	private int size;
	private NumericNodo f;
	private NumericNodo r;

	public NumericPriorityQueue() {
		this.size=0;
		this.f=null;
		this.r=null;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size==0;
	}

	public void enqueue(Object value, Integer prioridad) {
	    NumericNodo nodo = new NumericNodo();
	    nodo.setDato(value);
	    nodo.setPrioridad(prioridad);

	    if (isEmpty() || prioridad < f.getPrioridad()) {
	        // Caso especial: cola vacía o prioridad más alta
	        nodo.setEnlace(f);
	        f = nodo;
	    } else {
	        NumericNodo current = f;
	        NumericNodo prev = null;

	        while (current != null && prioridad >= current.getPrioridad()) {
	            prev = current;
	            current = current.getEnlace();
	        }

	        if (prev != null) {
	            prev.setEnlace(nodo);
	        } else {
	            f = nodo; // El nuevo nodo se convierte en el nuevo frente (f).
	        }
	        if (current == null) {
	            r = nodo; // El nuevo nodo se convierte en el nuevo final (r).
	        }
	        nodo.setEnlace(current);
	    }
	    size++;
	}

	public Object dequeue() {
		Object value=null;
		if (null!=f) {
			value=f.getDato();
			f=f.getEnlace();
			size--;
		}
		return value;
	}
	public Object front() {
		return null!=f?f.getDato():null;
	}
	public Object rear() {
		return null!=r?r.getDato():null;
	}
	public String toString() {
	    String s = "";
	    NumericNodo temporal = f; 
	    while (null != temporal) {
	        s = s + temporal.getDato() + "->";
	        temporal = temporal.getEnlace();
	    }
	    return s.isEmpty() ? "La cola está vacía." : s.substring(0, s.length() - 2); 
	}

}
