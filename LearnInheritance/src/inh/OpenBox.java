package inh;

public class OpenBox extends Box 
{
	public OpenBox(double len, double wid, double ht)
	{
		super(len,wid,ht);
	}
	
	@Override
	public double surfaceArea()
	{
		return len*wid + 2*(len*ht + wid*ht);
	}
}
