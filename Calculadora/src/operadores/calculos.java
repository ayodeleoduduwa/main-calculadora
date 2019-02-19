package operadores; 
public class calculos {
	
	public double soma (double a, double b) {
		double total = a + b;
		return total;
	}
	public double sub ( double a, double b) {
		double total = a - b;
		return total;
	}
	public double mut (double a, double b) {
		double total = a * b;
		return total;
	}
	public double divi (double a, double b) {
		double total = a / b;
		return total;
	}
	public double porcentagem (double a, double b) {
		double total = a*(b/100);
		return total;
	}
	public double raiz (double a) {
		double total = Math.sqrt(a);
		return total;
	}
	public double potencia (double a, double b) {
		double total = Math.pow(a, b);
		return total;
		
		
		
		
	}
	public static void main (String [] args) {
		calculos contas = new calculos();
		System.out.println(contas.soma(50, 50));
		System.out.println(contas.sub(50, 50));
		System.out.println(contas.mut(50, 50));
		System.out.println(contas.divi(50, 50));
		System.out.println(contas.porcentagem(80, 50));
		System.out.println(contas.raiz(9));
		System.out.println(contas.potencia(2,5 ));
		
		
		}
	}

}
