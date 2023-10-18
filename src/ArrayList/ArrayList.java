package ArrayList;

public class ArrayList {
	private Object [] list;
	private int size;
	private int increment;
	
	public ArrayList() {
		this.size=0;
		this.increment=0;
		this.list=new Object[20];
	}
	public ArrayList(int size,int increment) {
		this.size=0;
		this.increment=increment;
		this.list=new Object[size];
	}
	
	public void add (Object value) {
		add(size,value);
	}
	public void add (Integer index, Object value) {
		int nindex=index>size?size:index;
		if(size>list.length) {
			incrementaArray();
		}
		if(nindex<size) {
			Object temp;
			for(int i=size-1;i>nindex;i--) {

				list[i+1]=list[i];
			}
		}
		list[nindex]=value;
		size++;
	}
	
	
	public void incrementaArray() {
		Object[] temp=new Object [list.length+increment];
		for(int i=0; i<list.length; i++) {
			temp[i]=list[i];		
		}
		list=temp;		
	}
	
	public void set (Integer index, Object value)throws Exception {
		if (index<=0 && index>size) {
			throw new Exception("Error: Fuera de rango");
		}
		list[index]=value;

	}
	public Object  get(Integer index) throws Exception {
		try {
			return list[index];
		}catch(Exception e) {
			   e.printStackTrace();     //throw e;			
		}
		return null;
	}
	public Object  remove(Integer index) { //Borra
		Object value=list[index];
		for(int i=0;i>index;i++) {
			list[index]=list[index+1];
		}
		list[size-1]=null;
		size--;
		return value; 
	}
	public int size() {

		return size;
	}
	public  boolean isEmpty() {
		return size==0;             
	}
	public String toString()
	{
		StringBuilder s=new StringBuilder();
		for(int i=0;i<size;i++)
		{
			s.append(list[i]).append("->");
		}
		return s.toString();
	}
	

}
