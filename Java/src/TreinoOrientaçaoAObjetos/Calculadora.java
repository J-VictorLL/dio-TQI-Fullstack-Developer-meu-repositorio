package TreinoOrientaçaoAObjetos;

public class Calculadora implements OperaçãoMatematica{

	@Override
	public double soma(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double subtraçao(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double multiplicação(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double divisão(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}


}
