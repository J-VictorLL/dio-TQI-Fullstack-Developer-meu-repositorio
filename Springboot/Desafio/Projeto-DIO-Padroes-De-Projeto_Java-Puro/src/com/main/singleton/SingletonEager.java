package com.main.singleton;

//Implementação Singleton Eager
public class SingletonEager {
	
	private static SingletonEager instanciaEager = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancy() {
		return instanciaEager;
	}
}
