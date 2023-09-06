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
		if (queue[front]!=null) {
			Object value=null;
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
	
}
