package com.designpattern.singleton;

public class DoubleCheckedLockingSingleton {
	
	DoubleCheckedLockingSingleton doublecheckedSingleton;
	
	private DoubleCheckedLockingSingleton() {}
	
	public DoubleCheckedLockingSingleton getInstance()
	{
		if(doublecheckedSingleton==null)
		{
			synchronized (DoubleCheckedLockingSingleton.class) {
				if(doublecheckedSingleton==null)
					doublecheckedSingleton=new DoubleCheckedLockingSingleton();
			}
		}		
		return doublecheckedSingleton;
	}
}
