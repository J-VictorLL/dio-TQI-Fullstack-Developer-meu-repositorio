package metodos;

public class Quadrilatero {

		public static double area(double lado) { 
			//System.out.println("�rea do qaudrado:"+ lado*lado);
			return lado*lado;
		}
		
		public static double area(double lado1, double lado2) { 
			//System.out.println("�rea do retangulo:"+ lado1*lado2);
			return lado1*lado2;
		}
		
		public static double area(double baseMaior, double baseMenor, double altura) { 
			//System.out.println("�rea do trap�zio:"+ ((baseMaior+baseMenor)*altura)/2);
			return ((baseMaior+baseMenor)*altura)/2;
		}
		
		public static double area(float diagonal1, float diagonal2) { 
			//System.out.println("�rea do losango:"+ (diagonal1*diagonal2)/2);
			return (diagonal1*diagonal2)/2;
		}
}
