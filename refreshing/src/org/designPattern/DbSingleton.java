package org.designPattern;

public class DbSingleton {
	//private static DbSingleton instance= new DbSingleton();
	//Convert it to Lazy loaded
	private static DbSingleton instance=null;
	private DbSingleton() {
		
	}
	
	public static DbSingleton getInstance() {
		if(instance==null) {
			synchronized(DbSingleton.class) {
				if(instance==null)
					instance= new DbSingleton();
			}
		}
		return instance;
	}
}
