package com.main.singleton;

//Implementa��o Singleton Lazy
public class SingletonLazy {
	
	private static SingletonLazy instanciaLazy;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancy() {
		if(instanciaLazy==null) instanciaLazy = new SingletonLazy();
		return instanciaLazy;
	}
}
