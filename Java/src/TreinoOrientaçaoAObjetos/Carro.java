package TreinoOrientaçaoAObjetos;

public class Carro extends Veiculo{

	String modelo;
	String cor;
	double capacidadeTanque;
	
	public Carro() {	
	}
	
	public Carro(String modelo, String cor, double capacidadeTanque) {
		this.modelo = modelo;
		this.cor = cor;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public void custoTanqueEncher(double valorGasolina) {
		System.out.println("O custo para encher o tanque é de "+(valorGasolina*this.capacidadeTanque));
	}
	
	public double valorCustoTanqueEncher(double valorGasolina) {
		return (valorGasolina*this.capacidadeTanque);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
}
