package Colas;

import Estructuras.nodos.booleanNodo;

public class BooleanPriorityQueue {
	private int size;
	private booleanNodo f;
	private booleanNodo r;

	public BooleanPriorityQueue() {
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

	public void enqueue(Object value,boolean prioridad) {
		booleanNodo nodo=new booleanNodo();
		nodo.setDato(value);
		nodo.setPrioridad(prioridad);
		if(null==f) {
			r=nodo;
			f=nodo;
		}
		else {
			if (prioridad==true){
				booleanNodo temp=f;
				while ( null!=temp.getEnlace() && temp.getEnlace().getPrioridad()==true) {
					temp=temp.getEnlace();
				}
				if (null==temp.getEnlace()) {
					r.setEnlace(nodo);
					r=nodo;
				}
				else
				{
					booleanNodo siguiente=temp.getEnlace();
					temp.setEnlace(nodo);
					nodo.setEnlace(siguiente);
				}
			}
			else {
				r.setEnlace(nodo);
				r=nodo;
			}
				
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
		booleanNodo temporal = r;
		while (null!=temporal) {
			s = temporal.getDato() + "->" + s;
			temporal = temporal.getEnlace();
		}
		return s.toString();
	}
}
