package Colas;

import Estructuras.nodos.Nodo;

public class LinkedQueue {
	
		private int size;
		private Nodo f;
		private Nodo r;
		
		public LinkedQueue() {
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
		
		public void enqueue(Object value) {
			Nodo nodo=new Nodo();
			nodo.setDato(value);;
			if(null!=r) {
				r.setEnlace(nodo);
			}
			if (null==f) {
				this.f=nodo;
			}
			this.r=nodo;
			this.size++;
			
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
		    Nodo temporal = r;
		    while (null!=temporal) {
		        s = temporal.getDato() + "->" + s;
		        temporal = temporal.getEnlace();
		    }
		    return s.toString();
		}
}
