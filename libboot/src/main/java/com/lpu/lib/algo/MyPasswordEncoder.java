package com.lpu.lib.algo;

public interface MyPasswordEncoder 
{
	public String encode(String pass);
	public boolean match(String encoded, String pass);
	
}
