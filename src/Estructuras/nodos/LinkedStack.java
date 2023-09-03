package Estructuras.nodos;

public class LinkedStack {
	
	private Nodo apuntador;
	private int size; //Cantidad de nodos
	
	public LinkedStack() {
		this.size=0;
		this.apuntador=null;
	}
	
	public int size() {

		return size;
	}
	public  boolean isEmpty() {
		return size==0;             //Devuelve un boleano   
		// return null==apuntador;     asi se pone cuando se compara un null
	}
	public Object peek()
	{
		return apuntador.getDato();
	}
	public void push(Object value) {
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
	public Object pop() {
		Object value=null;
		if(null!=apuntador.getEnlace())
		{
			value=apuntador.getDato();	
			this.apuntador=apuntador.getEnlace();
			size--;
		}
		return value;
		
	}
	
	public String toString() {
	    String s = "";
	    Nodo temporal = apuntador;
	    while (temporal !=null) {
	        s = temporal.getDato() + "<-" + s;
	        temporal = temporal.getEnlace();
	    }
	    return s;
	}

}


