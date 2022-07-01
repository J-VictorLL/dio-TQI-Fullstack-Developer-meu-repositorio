package metodos;

public class MenssagemHora {
	
	public static void chamadaDoHorario(int hora) {
		if((hora>=5)&(hora<=11)){//24 horas
			bomDia(); 
		}else if((hora>=12)&(hora<=17)) {
			boaTarde();
		}else{
			boaNoite();
		}
	}
	
	public static void bomDia() {
		System.out.println("Bom dia!");
	}
	
	public static void boaTarde() {
		System.out.println("Boa tarde!");
	}
	
	public static void boaNoite() {
		System.out.println("Boa noite!");
	}
}
