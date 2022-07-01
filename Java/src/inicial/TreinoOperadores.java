package inicial;

public class TreinoOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("PrePos");
		prePos();
		System.out.println("Aritimeticos");
		aritimetico();
		System.out.println("Atribuição");
		atribuicao();
		System.out.println("Precedência");
		precedencia();
		
	}
	
	private static void prePos() {
		int k = 10;
		
		int i = ++k;
		int j = k--;
		int x = k;
		
		System.out.println("i: "+i+"\nj: "+j+"\nx: "+x);
	}
	
	private static void aritimetico() {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		
		int r1 = a+b;
		int r2 = c-a;
		int r3 = d*b;
		int r4 = e/a;
		int r5 = c%b;
		
		System.out.println("a+b: "+r1+
			"\nc-a: "+r2+"\nd*b: "+r3+
			"\ne/a: "+r4+"\nc%b: "+r5);
	}
	
	private static void atribuicao() {
		int i = 1500;
		short j = 15;
		long l = 500l;
		int k = 35;
		float f = 3.5f;
		double d = f;
		
		System.out.println("d: "+d);
		
		i +=5;
		j -= 3;
		d /= 2.7d;
		l *= 3;
		k %= 2;
		
		System.out.println("i: "+i+
			"\nj: "+j+"\nd: "+d+
			"\nl: "+l+"\nk: "+k);
		
		i = k = j;
		
		System.out.println("i: "+i+
				"\nj: "+j+"\nk: "+k);
	}
	

	private static void precedencia() {
		int i = 10;
		int j = 20;
		int k = 30;
		
		int a = i++ + --j * k;
		
		System.out.println("i++ + --j * k: "+a);
		
		System.out.println("i: "+i);
		
		int b =  k / --i % 3 + 1;
		
		System.out.println("k / --i % 3 + 1: "+b);
		
		System.out.println("i: "+i);
		
		int c =  2;
		c *= i += 5;
		
		System.out.println("c *= i += 5;: "+c);
		
	}

}
