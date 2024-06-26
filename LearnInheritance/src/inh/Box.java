package inh;

public class Box 
{
	double len,wid,ht;
	
	public Box(double len, double wid, double ht) 
	{
		super();
		this.len = len;
		this.wid = wid;
		this.ht = ht;
	}

	public double getHt() 
	{
		return ht;
	}

	public void setHt(double ht) 
	{
		this.ht = ht;
	}

	public double getLen() 
	{
		return len;
	}

	public void setLen(double len) 
	{
		this.len = len;
	}

	public double getWid() 
	{
		return wid;
	}

	public void setWid(double wid) 
	{
		this.wid = wid;
	}

	public double volume()
	{
		return len*wid*ht;
	}
	
	public double surfaceArea()
	{
		return 2*(len*wid + wid*ht + len*ht);
	}
	
	
	
	@Override
	public String toString() 
	{
		return "Box [length = " + len + ", width = " + wid + ", height = " + ht + "]";
	}

	public static void main(String[] args) 
	{
		
	}

}
