package transito;

public class CarteiraMotorista {

	String nome;
	Carro carro;
	int ponto;
	int pontoAtual = 20;
	String fiscalizacao;
	double valor;
	double totalMulta=0;
	
	
	int pontuacao(String fiscalizacao) {
		if (fiscalizacao == "Média") {
			ponto = 4;
		} else if (fiscalizacao == "Grave") {
			ponto = 5;
		} else if (fiscalizacao == "Gravíssima") {
			ponto = 7;
		}
		return ponto;
	}

	int saldoPontuacao(int pontuacao) {
		return pontoAtual = pontoAtual - ponto;

	}

	double valorMulta(int pontuacao) {
		switch (pontuacao) {
		case 4:
			valor = 130.16;
			break;
		case 5:
			valor = 195.23;
			break;
		case 7:
			valor = 888.41;
			break;
		}
		return valor;
	}
		
	
	double totalPagar (double valorMulta)	{
		return totalMulta+= valor;
		
	}
		
	

	@Override
	public String toString() {
		return "O nome do motorista " + nome + "\nSaldo na carteira de motorista " + pontoAtual + "\nPerdeu " + ponto
				+ "pts na carteira"+ "\nValor da multa: " + valor + "\nTotal a pagar: R$ " + totalMulta ;
	}

	
	// ativar radar
	// pegar o nome da rua e os dados do motorista e placa do veiculo e o tipo de multa
	

}
