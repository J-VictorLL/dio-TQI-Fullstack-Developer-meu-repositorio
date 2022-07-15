package com.main.singleton;

//Implementação Singleton Lazy
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
