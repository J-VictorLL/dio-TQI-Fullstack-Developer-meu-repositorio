package Operandos;

public class Testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int i1 = 10, i2 = 20;
		float f1=4.5f, f2=3.5f;
		char c1 ='x', c2='y';
		double d = 59.6d;
		long l1 = 1597L, l2=8997L;
		String s1 = "Fulano", s2="Fulano", s3="Cicrano";
		boolean b1 = true, b2 = false;
		byte y1 = 1;
		short h1 = 25;
		
		System.out.println("i1 == i2 :"+ (i1==i2));
		System.out.println("i1 != i2 :"+ (i1!=i2));
		System.out.println("i1 > i2 :"+ (i1>i2));
		System.out.println("i1 <= i2 :"+ (i1<=i2));
		
		System.out.println("f1 == f2 :"+ (f1==f2));
		System.out.println("f1 != f2 :"+ (f1!=f2));
		System.out.println("f1 > f2 :"+ (f1>f2));
		System.out.println("f1 <= f2 :"+ (f1<=f2));
		
		System.out.println("c1 == c2 :"+ (c1==c2));
		System.out.println("c1 != c2 :"+ (c1!=c2));
		System.out.println("c1 > c2 :"+ (c1>c2));
		System.out.println("c1 <= c2 :"+ (c1<=c2));
		
		System.out.println("s1 == s2 :"+ (s1==s2));
		System.out.println("s1 == s3 :"+ (s1==s3));
		System.out.println("s1 != s2 :"+ (s1!=s2));
		//System.out.println("s1 > s2 :"+ (s1>s2));
		//System.out.println("s1 <= s2 :"+ (s1<=s2));
		
		System.out.println("b1 == b2 :"+ (b1==b2));
		System.out.println("b1 != b2 :"+ (b1!=b2));
		//System.out.println("b1 > b2 :"+ (b1>b2));
		//System.out.println("b1 <= b2 :"+ (b1<=b2));
		
		System.out.println("i2 > f1 :"+ (i2>f1));
		System.out.println("d == h1 :"+ (d==h1));
		//System.out.println("s2 != c1 :"+ (s2!=c1));
		//System.out.println("s3 != i1 :"+ (s3!=i1));
		
		System.out.println("l1 == i2 :"+ (l1==i2));
		System.out.println("l2 >= i1 :"+ (l2>=i1));
		System.out.println("y1 != h1 :"+ (y1!=h1));
		
		*/
		/*
		boolean b1 = true, b2 = false, b3=b1, b4=b2;
		
		System.out.println("b1 and b2 :"+ (b1&&b2));
		System.out.println("b1 and b3 :"+ (b1&&b3));
		System.out.println("b2 or b3 :"+ (b2||b3));
		System.out.println("b2 or b4 :"+ (b2||b4));
		System.out.println("b1 xor b3 :"+ (b1^b3));
		System.out.println("b4 xor b1 :"+ (b4^b1));
		System.out.println("not b1:"+!b1+"\nnot b2 :"+ (!b2));
		
		int i1=10, i2=5;
		float f1=20f,f2=50f;
		
		System.out.println("((i1+i2)<(f2-f1)) and true :"+ (((i1+i2)<(f2-f1))&&true));

		System.out.println("(i1>i2) or (f2<f1) :"+ ((i1>i2) || (f2<f1)));
		*/
		/*
		int mes = 9, numero = 2;
		String diaString = "Segunda";
		ifFlecha(mes);
		ifSemFlecha(mes);
		switchSemana(diaString);
		switchNumero(numero);
		*/
		
	}

	private static void ifFlecha(int mes) {
		if(mes==1) {
			System.out.println("Janeiro");
		} else {
			if(mes==2) {
				System.out.println("Fevereiro");
			} else {
				if(mes==3) {
					System.out.println("Março");
				} else {
					if(mes==4) {
						System.out.println("Abril");
					} else {
						if(mes==5) {
							System.out.println("Maio");
						} else {
							if(mes==6) {
								System.out.println("Junho");
							} else {
								if(mes==7) {
									System.out.println("Julho");
								} else {
									if(mes==8) {
										System.out.println("Agosto");
									} else {
										if(mes==9) {
											System.out.println("Setembro");
										} else {
											if(mes==10) {
												System.out.println("Outubro");
											} else {
												if(mes==11) {
													System.out.println("Novembro");
												} else {
													if(mes==12) {
														System.out.println("Dezembro");
													} else {
														
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	private static void ifSemFlecha(int mes) {
		if(mes==1) {
			System.out.println("Janeiro");
		} else if(mes==2) {
			System.out.println("Fevereiro");
		} else if(mes==3) {
			System.out.println("Março");
		} else if(mes==4) {
			System.out.println("Abril");
		} else if(mes==5) {
			System.out.println("Maio");
		} else if(mes==6) {
			System.out.println("Junho");
		} else if(mes==7) {
			System.out.println("Julho");
		} else if(mes==8) {
			System.out.println("Agosto");
		} else if(mes==9) {
			System.out.println("Setembro");
		} else if(mes==10) {
			System.out.println("Outubro");
		} else if(mes==11) {
			System.out.println("Novembro");
		} else if(mes==12) {
			System.out.println("Dezembro");
		} 
	}
	
	private static void switchSemana(String dia) {
		switch(dia) {
			case "Segunda":
				System.out.println(2);
				break;
			case "Terça":
				System.out.println(3);
				break;
			case "Quarta":
				System.out.println(4);
				break;
			case "Quinta":
				System.out.println(5);
				break;
			case "Sexta":
				System.out.println(6);
				break;
			case "Sabado":
				System.out.println(7);
				break;
			case "Domingo":
				System.out.println(1);
				break;
			default:
				System.out.println("Dia invalido");
				break;
		} 
	}

	private static void switchNumero(int numero) {
		switch(numero) {
			case 1://forma de usar or no switch
			case 2:
			case 3:
				System.out.println(numero);
				break;
			case 4:
				System.out.println("Passou");
				break;
			default:
				System.out.println("Numero invalido");
				break;
		} 
	}
}



