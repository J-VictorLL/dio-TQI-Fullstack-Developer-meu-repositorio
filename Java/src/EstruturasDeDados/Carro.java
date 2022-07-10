package EstruturasDeDados;

import java.util.Objects;

public class Carro implements Comparable<Carro> {
	
	String marca;

	public String getMarca() {
		return marca;
	}

	public Carro(String marca) {
		this.marca = marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Carro carro = (Carro)obj;
		return Objects.equals(marca, carro.marca);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(marca);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Carro{ marca: "+this.marca+" }";
	}
/*
	@Override
	public int compareTo(Carro o) {
		if(this.marca.length()< o.marca.length()) {
			return -1;
		}else if(this.marca.length()> o.marca.length()) {
			return 1;
		}
		return 0;
	}
	*/
	@Override
	public int compareTo(Carro o) {
		return this.getMarca().compareToIgnoreCase(o.getMarca());
	}

}
