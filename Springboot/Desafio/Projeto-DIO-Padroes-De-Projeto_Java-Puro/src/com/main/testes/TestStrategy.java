package com.main.testes;

import com.main.strategy.ComportamentoAgressivo;
import com.main.strategy.ComportamentoDefensivo;
import com.main.strategy.ComportamentoNormal;
import com.main.strategy.ComportamentoRobo;
import com.main.strategy.Robo;

public class TestStrategy {
	
	public static void main(String[] args) {

		ComportamentoRobo normal = new ComportamentoNormal();
		ComportamentoRobo defensivo = new ComportamentoDefensivo();
		ComportamentoRobo agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		robo.mover();		
		robo.mover();
	}
}
