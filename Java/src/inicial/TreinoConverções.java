package inicial;

public class TreinoConverções {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 2;
		double d = (double) i;
		
		byte b1;
		short s1 = 1000;
		b1 = (byte)s1;
		
		long l1;
		int i1 = 10;
		l1 = i1;
		
		int i2;
		long l2=10000000000000000L;
		i2 = (int)l2;
		
		int i3;
		long l3=10000L;
		i3 = (int)l3;
		
		double d1;
		float f1 = 10.5f;
		d1 = f1;
		
		float f2,f3;
		double d2 = 10000.58d, d3 = 1000.588888888888888888888888888888d;
		f2 = (float)d2;
		f3 = (float)d3;
		
		int i4;
		float f4 = 11.5698f;
		i4 = (int)f4;
		
		System.out.println("b1: "+b1+"\nl1: "+l1+
				"\ni2: "+i2+"\ni3: "+i3+"\nd1: "+d1+
				"\nf2: "+f2+"\nf3: "+f3+"\ni4: "+i4);
		
		
		
	}

}
