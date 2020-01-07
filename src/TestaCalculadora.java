
public class TestaCalculadora {

	public static void main(String[] args) {
		
		Calculadora soma = new Calculadora();
		soma.soma(1,1);
		
		Calculadora sub = new Calculadora();
		sub.subtracao(10,1);
		
		Calculadora mult = new Calculadora();
		mult.multiplicacao(5,3);
		
		Calculadora div = new Calculadora();
		div.divisao(100,2);


		System.out.println( " SOMA " + soma.resultado);
		System.out.println(" SUBTRACAO " + sub.resultado);
		System.out.println(" MULTIPLICACAO " + mult.resultado);
		System.out.println(" DIVISAO " + div.resultado);
		
	
		

	}

}
