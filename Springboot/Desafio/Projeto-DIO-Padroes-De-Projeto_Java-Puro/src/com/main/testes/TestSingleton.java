package com.main.testes;

import com.main.singleton.SingletonEager;
import com.main.singleton.SingletonLazy;
import com.main.singleton.SingletonLazyHolder;

public class TestSingleton {

	public static void main(String[] args) {
		//Teste Lazy
		System.out.println("Teste Singleton Lazy:");
		SingletonLazy lazy = SingletonLazy.getInstancy();
		System.out.println(lazy);
		for(int i = 0; i<10; i++) {
			lazy = SingletonLazy.getInstancy();
			System.out.println(lazy);
		}
		
		//Teste Eager
		System.out.println("Teste Singleton Eager:");
		SingletonEager eager = SingletonEager.getInstancy();
		System.out.println(eager);
		for(int i = 0; i<10; i++) {
			eager = SingletonEager.getInstancy();
			System.out.println(eager);
		}
			
			
		//Teste Lazy Holder
		System.out.println("Teste Singleton Lazy Holder:");
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancy();
		System.out.println(lazy);
		for(int i = 0; i<10; i++) {
			holder = SingletonLazyHolder.getInstancy();
			System.out.println(holder);
		}

	}

}
