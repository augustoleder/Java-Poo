package transito;

public class Ferrari extends Carro{

	@Override
	void acelerar() {
		velocidadeAtual +=30;
	}

	@Override
	public String toString() {
		
		return "Velocidade atual do JATO é " + velocidadeAtual + "Km/h";
	}

	
	 
}
