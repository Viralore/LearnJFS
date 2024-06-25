package coll;

class MyStack<T>
{
	Object[] a;
	int top;
	
	MyStack(int size)
	{
		super();
		a = new Object[size];
		top = -1;
	}
	
	public void push(T x) throws Exception
	{
		if(top >= a.length-1) throw new Exception("Overflow");
		a[++top] = x;
	}
	
	@SuppressWarnings("unchecked")  //To stop giving warning from Type safety: Unchecked cast from Object to T
	public T pop() throws Exception
	{
		if(top == -1) throw new Exception("Underflow");
		return (T)a[top--];
	}
}

public class GenericsDemo 
{
	public static void main(String[] args) 
	{
		MyStack<Integer> sti = new MyStack<>(10);
		MyStack<String> sts = new MyStack<>(10);
		
		try
		{
			sti.push(1);
			sti.push(2);
			sti.push(3);
			
			sts.push("Java");
			sts.pop();
			sts.pop();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
