
public class CalculoOperações {
	
	private double fracao1;
	private double fracao2;
	private int opcao;
	private  double resultado;
	

	//Get e set
 	public double getFracao1() {
		return fracao1;
	}
	public void setFracao1(double fracao1) {
		this.fracao1 = fracao1;
	}
	public double getFracao2() {
		return fracao2;
	}
	public void setFracao2(double fracao2) {
		this.fracao2 = fracao2;
	}
	public int getOpcao() {
		return opcao;
	}
	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	//constructor
	public CalculoOperações(double fracao1,double fracao2,int opcao) {
		setFracao1(fracao1);
		setFracao2(fracao2);
		setOpcao(opcao);
	}
	
	//methods
	public void resultado() {
		DecimalParaFracao resultadoFracao = new DecimalParaFracao();
		switch(getOpcao()) {
		case 1:
			setResultado((getFracao1()+getFracao2()));
			System.out.println("O número decimal " + + getResultado() + " em fração é: " + resultadoFracao.conversao(getResultado()));
			break;
		case 2:
			setResultado((getFracao1()-getFracao2()));
			System.out.println("O número decimal " + + getResultado() + " em fração é: " + resultadoFracao.conversao(getResultado()));
			break;
		case 3:
			setResultado((getFracao1()*getFracao2()));
			System.out.println("O número decimal " + + getResultado() + " em fração é: " + resultadoFracao.conversao(getResultado()));
			break;
		case 4:
			setResultado((getFracao1()/getFracao2()));
			System.out.println("O número decimal " + + getResultado() + " em fração é: " + resultadoFracao.conversao(getResultado()));
			break;
		default:
			System.out.println("    Não foin possivel realizar a conta.");
			break;
		}
	}

}
