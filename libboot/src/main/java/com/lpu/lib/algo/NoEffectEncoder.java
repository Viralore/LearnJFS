package com.lpu.lib.algo;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.stereotype.Component;

@Component
public class NoEffectEncoder implements MyPasswordEncoder 
{

	@Override
	public String encode(String pass) 
	{
		Collections.reverse(Arrays.asList(pass.toCharArray()));
		return pass;
	}

	@Override
	public boolean match(String encoded, String pass) 
	{
		
		return pass.equals(encoded);
	}

}
