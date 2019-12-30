
public class Operacoes {
	
	
	double soma;
	double subtracao;
	double multiplicacao;
	double divisao;
	double saldo;

	
	public Operacoes() {}
	
	
	public void soma (double valor) {
			
		this.saldo += valor;
		
	}
	
	public void subtracao(double valor ) {
		
		this.saldo -=valor;
		
	}
	 
	public void multiplicacao(double valor) {
		
		this.saldo *=  valor;
		
	}
	
	public void divisao(double valor) {
		
		this.saldo /=  valor;
		
	}
	
	
	
	
		

}
