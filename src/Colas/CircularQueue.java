package Colas;

public class CircularQueue {

	private int size;
	private int front;
	private int rear;
	private Object[] queue;
	
	public CircularQueue (int size) {
		this.size=0;
		this.front=0;
		this.rear=0;
		this.queue=new Object[size];
	}
	
	public void enqueue (Object value) {
		if (null==queue[rear])
		{
		queue[rear]=value;
		rear++;
		size++;
		if (rear==queue.length) {
			rear=0;
		}
		}
	}
	
	public Object dequeue() {
		Object value=null;
		if (queue[front]!=null) {
			value=queue[front];
			queue[front]=null;
			front ++;
			size --;
			if (front==queue.length) {
				front=0;
			}
		}
		return value;
	}
	
	public  boolean isEmpty() {
		return size==0;             
	}
	public int size() {

		return size;
	}
	public Object front() {
		return queue[front];
		
	}
	public Object rear() {
		int rearAux=rear-1;
		rearAux=rearAux<0?queue.length-1:rearAux;   //If ternario
		return queue[rearAux];
	}
	public String toString()
	{
		String s="";
		int sizeAux=size;
		int rearAux=rear;
		while (sizeAux>0)
		{
			sizeAux--;
			rearAux--;
			rearAux=rearAux<0?queue.length-1:rearAux;   //If ternario
			s+=queue[rearAux]+"->";
		}
		return s;
	}
	
}
