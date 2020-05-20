package loteria;

import java.util.Arrays;

public class LotericaInterna {

	double ValorPremioInicial = 1000000;
	int limiteInicial = 1;
	int limiteFinal = 60;
	int pessoas = 5;
	
	void premio() {

		ValorPremioInicial = ValorPremioInicial * pessoas;
		System.out.println("Premiação máxima: R$" + ValorPremioInicial);
	}

	int[] sorteio() {

		int[] numeroSortiado = new int[6];
		for (int i = 0; i < 6; i++) {
			numeroSortiado[i] = (int) (limiteInicial + Math.random() * limiteFinal); // gerador dos numeros

			for (int j = 0; j < 6; j++) {
				numeroSortiado[j] = numeroSortiado[i];
				// essa estrutura é para evitar gerar numero repetitivos
				while ((numeroSortiado[i] == numeroSortiado[j]) && (j != i)) {
					numeroSortiado[j] = (int) (limiteInicial + Math.random() * limiteFinal);
				}

			}

		}

		System.out.println("Numeros da Mega !!!");
		System.out.println(Arrays.toString(numeroSortiado));
		return numeroSortiado;
	}

	int compararJogo(int[] sorteio, int[] fazerJogo) {

		int contador = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (sorteio[i] == fazerJogo[j]) {
					contador += 1;
				}
			}

		}
		System.out.println("\nQuantidade de acertos: " + contador + "\n");
		System.out.println("Os números que você escolheu foram:\n" + Arrays.toString(fazerJogo));

		return contador;
	}

	void premiacao(int compararJogo) {
		switch (compararJogo) {
		case 6:
			System.out.println("Parabéns você ganhou na MEGA!!!");
			break;
		case 5:
			System.out.println("Você quase ganhou, você fez uma Quina");
			break;
		case 4:
			System.out.println("Você fez uma quadra");
			break;
		case 3:
			System.out.println("Não desista, tente novamente");
			break;
		case 2:
			System.out.println("Na próxima você vence, tente novamente");
			break;
		case 1:
			System.out.println("Tente novamente");
			break;
		case 0:
			System.out.println("Infelizmente não foi dessa vez, tente novamente");
			break;
		}

	}

	
}
