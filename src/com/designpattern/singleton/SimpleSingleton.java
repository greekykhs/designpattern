package com.designpattern.singleton;

public class SimpleSingleton {
	
	SimpleSingleton singletonObject;
	private SimpleSingleton() {}
	
	public SimpleSingleton getSimpleSingletonInstance()
	{
		if(singletonObject==null)
			singletonObject=new SimpleSingleton();
		
		return singletonObject;
	}
}
