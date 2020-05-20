package transito;

public class TesteCarro {

	public static void main(String[] args) {

		Motorista [] condutor = new Motorista[6];
		condutor [0] = new Motorista ("Bapus",31,"Fusca");
		condutor [1] = new Motorista ("Pão com Ovo",30,"Chevet");
		condutor [2] = new Motorista ("Melocoton",33,"Brasília");
		condutor [3] = new Motorista ("Brunex",29,"Corcel");
		condutor [4] = new Motorista ("ule",28,"Gurgel");
		condutor [5] = new Motorista ("Fernandinho",15,"Ferrari");
		condutor [6] = new Motorista ("Jeguinho",30,"Apollo");
		
		
		
		Carro c1 = new Carro();
		Radar r1 = new Radar();
		CarteiraMotorista m1 = new CarteiraMotorista();
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
				

		r1.fiscalizacao(c1.velocidadeAtual); //define a categoria da multa
		
		m1.pontuacao(r1.fiscalizacao(c1.velocidadeAtual)); // define a quantidade de pontos
		
		m1.saldoPontuacao(m1.pontuacao(r1.fiscalizacao(c1.velocidadeAtual)));
		m1.valorMulta(m1.pontuacao(r1.fiscalizacao(c1.velocidadeAtual)));
		m1.totalPagar(m1.valorMulta(m1.pontuacao(r1.fiscalizacao(c1.velocidadeAtual))));
		
		
		
		//System.out.println(c1);
		//System.out.println(r1.fiscalizacao(c1.velocidadeAtual));
		//System.out.println(m1.pontuacao(r1.fiscalizacao(c1.velocidadeAtual)));
		
		System.out.println(m1);
		
		
		

	}

}
