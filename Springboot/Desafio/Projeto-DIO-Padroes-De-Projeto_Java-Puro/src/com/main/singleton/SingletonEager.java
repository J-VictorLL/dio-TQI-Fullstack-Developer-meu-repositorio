package com.main.singleton;

//Implementa��o Singleton Eager
public class SingletonEager {
	
	private static SingletonEager instanciaEager = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancy() {
		return instanciaEager;
	}
}
