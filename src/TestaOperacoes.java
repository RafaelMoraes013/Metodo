
public class TestaOperacoes {

	public static void main(String[] args) {

		Operacoes soma = new Operacoes();
		soma.saldo = 150;	
	    soma.soma(50);
		
	
	 Operacoes subtracao = new Operacoes();		
	 subtracao.saldo = 100;
	 subtracao.subtracao(20);
	
					
	 Operacoes multiplicacao = new Operacoes();		
	  multiplicacao.saldo = 5 ;
	 multiplicacao.multiplicacao(10);

	 Operacoes divisao = new Operacoes();		
	 divisao.saldo = 50 ;
	 divisao.divisao(2);

	
	  
		System.out.println("Operacao Soma " + soma.saldo);
		System.out.println("Operacao Subtracao " + subtracao.saldo);
		System.out.println("Operacao Multiplicacao " + multiplicacao.saldo);
		System.out.println("Operacao Divisao " + divisao.saldo);
		
		
	
		
		
		

	}

}
