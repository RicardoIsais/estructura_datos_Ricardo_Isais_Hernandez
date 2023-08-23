package Estructuras.pilas;

public class Pilas {
	private Object[] Pilas;
	private int size;
	public Pilas(int size) {
		this.Pilas=new Object[size];
		this.size=0;
	}
	public void push(Object value) {

		if (Pilas.length>=size)
		{
			Pilas[size]= value;
			size++;
		}
	}
	public Object pop() {

		Object value=null;
		if(isEmpty())
		{
			size--;
			value=Pilas[size];
			Pilas[size]=null;
		}
		return value;
	}
	public  int size() {

		return size;
	}
	public  boolean isEmpty() {
		return size==0;             //Devuelve un boleano 
	}
	public  Object peek() {
		Object value=null;
		if (size>0)
		{
			value=Pilas[size-1];
		}	
		return value;
	}
	public String toString()
	{
		StringBuilder s=new StringBuilder();
		for(int i=0;i<size;i++)
		{
			s.append(Pilas[i]).append("->");
		}
		return s.toString();
	}
}
