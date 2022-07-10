package Debug;

public class Main {

	public static void main(String[] args) {
		System.out.println("Iniciou o programa no metodo main.");
		a();
		System.out.println("Finalizou o programa no metodo main.");
	}
	
	static void a() {
		System.out.println("Entrou no metodo a.");
		b();
		System.out.println("Finalizou no metodo a.");
	}
	
	static void b() {
		System.out.println("Entrou no metodo b.");
		for(int i = 0; i<=4;i++) System.out.println(i);
		c();
		System.out.println("Finalizou no metodo b.");
	}
	
	static void c() {
		System.out.println("Entrou no metodo c.");
		Thread.dumpStack();//Usado quando se quer fazer debug
		System.out.println("Finalizou no metodo c.");
	}

}
