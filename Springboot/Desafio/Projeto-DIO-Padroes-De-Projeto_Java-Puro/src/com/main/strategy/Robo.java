package com.main.strategy;

public class Robo {

	private ComportamentoRobo strategy;
	
	public Robo() {
	}

	public void setStrategy(ComportamentoRobo strategy) {
		this.strategy = strategy;
	}
	
	public void mover() {
		strategy.mover();
	}
}
