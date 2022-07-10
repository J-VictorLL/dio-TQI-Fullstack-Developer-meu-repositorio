package TreinoOrientaçaoAObjetos;

public class TesteOAO {

	public static void main(String[] args) {
		/*Carro carro1 = new Carro("Marca1", "Azul", 120.0);
		
		System.out.println(carro1.getCor());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCapacidadeTanque());
		
		carro1.custoTanqueEncher(6.3369);
		
		Carro carro2 = new Carro();
		
		carro2.setCor("Vermelho");
		carro2.setModelo("BNW");
		carro2.setCapacidadeTanque(59);
		
		System.out.println(carro2.getCor());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCapacidadeTanque());
		
		carro2.custoTanqueEncher(6.3369);*/
		Funcionario f1 = new Funcionario();
		
		//upcast
		Funcionario g1 = new Gerente();
		Funcionario v1 = new Vendedor();
		Funcionario fa1 = new Faxineiro();
		
		//downcast
		//Vendedor v2 = (Vendedor) new Funcionario();
		
		Funcionario[] classes = new Funcionario[]{new Gerente(), new Vendedor(), new Funcionario()};
		
		for(Funcionario classe: classes) {
			classe.metodo1();
		}
		System.out.println("");
		
		for(Funcionario classe: classes) {
			classe.metodo2();
		}
		System.out.println("");

	}

}
