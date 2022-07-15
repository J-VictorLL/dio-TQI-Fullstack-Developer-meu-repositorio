package com.main.singleton;

//Implementação Singleton Lazy Holder
public class SingletonLazyHolder {
	
	private static class Holder{
		private static SingletonLazyHolder 
			instanciaLazyHolder = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancy() {
		return Holder.instanciaLazyHolder;
	}
}
