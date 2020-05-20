package transito;

//Em desenvolvimento...


public class Radar {

	String local;
	double multa;
	int velocidadePermitida = 60;
	String resultado;

	String fiscalizacao(int velocidadeAtual) {

		if (velocidadeAtual <= velocidadePermitida) {
			return resultado = "velocidade atual permitida"; 

		} else if (velocidadeAtual > velocidadePermitida && (int) velocidadeAtual <= 1.2 * velocidadePermitida) {
			return resultado ="Média";
		} else if (((velocidadeAtual) > (int) (1.2 * velocidadePermitida))
				&& (velocidadeAtual <= (int) (1.5 * velocidadePermitida))) {
			return resultado = "Grave";
		} else if (velocidadeAtual > ((int) 1.5 * velocidadePermitida)) {
			return resultado = "Gravíssima";
		}
		return resultado; 
	}

/// ArrayList<Radar> dadosRadar = new ArrayList<Radar>();

	/*
	 * {Pituba, 60, velocidade atual} {Rua Capitão Melo, 50, velocidade atual}
	 * {Farol de itapua,40, velocidade atual} {Av. paralela, 80, velocidade atual}
	 * {BR-324, 120, velocidade atual}
	 */

// maximo de pontos é 20 pontos e aí não pode dirigir
}
