package ArrayList;
import Estructuras.nodos.*;
public class LinkedList {
	private Nodo apuntador;
	private int size;
	public LinkedList() {
		apuntador=null;
		size=0;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void add(Object value) {
		Nodo nodo=new Nodo();
		nodo.setDato(value);
		if (null==apuntador)
		{
			this.apuntador=nodo;
		}
		nodo.setEnlace(apuntador);
		this.apuntador=nodo;
		this.size++;
	}
	public Object removeLast() {
		Object value=null;
		if(null!=apuntador.getEnlace())
		{
			value=apuntador.getDato();	
			this.apuntador=apuntador.getEnlace();
			size--;
		}
		return value;		
	}
	private void addFirst(Nodo value) {
		Nodo actual=apuntador;
		while (null!=actual.getEnlace()) {
			actual=actual.getEnlace();
		}
		actual.setEnlace(value);
		size++;
	}
	private void addMiddle(int index, Nodo value) {
		int tempSize=size-1;
		Nodo actual=apuntador;
		while(tempSize>index) {
			tempSize--;
			actual=actual.getEnlace();
		}
		Nodo sigueinte=actual.getEnlace();
		actual.setEnlace(value);
		value.setEnlace(sigueinte);
		size++;
	}
	public void add(int index, Object value) throws Exception{
		if (index<0 || index >size ) {
		    throw new Exception ("Fuera de rango");
		}
		Nodo nodo=new Nodo();
		nodo.setDato(Value);
		if (index==0) {
			addFirst(nodo);
		}
		else if(index==size-1);{
			add(value);
		} else {
			addMiddle(index,nodo);
		}
		
	}
	

}
