package loteria;

import java.util.Arrays;
import java.util.Scanner;

public class Teste3 {

	public static void main(String[] args) {
		System.out.println("Seja bem vindo ao programa: \n*** Mega do Lepo-Lepo ***");
		System.out.println("Escolha a forma como deseja jogar... \n");
		Scanner entrada = new Scanner(System.in);

		System.out.println("Gerar números aleatórios.\nDigite:1\n");

		System.out.println("Escolher seus números.\nDigite:2");
		int valor = entrada.nextInt();

		switch (valor) {
		case 1:
			int[] numeroSortiado = new int[6];
			for (int i = 0; i < 6; i++) {
				numeroSortiado[i] = (int) (1 + Math.random() * 60);
				for (int j = 0; j < 6; j++) {
					numeroSortiado[j] = numeroSortiado[i];
					// essa estrutura é para evitar gerar numero repetitivos
					while ((numeroSortiado[i] == numeroSortiado[j]) && (j != i)) {
						numeroSortiado[j] = (int) (1 + Math.random() * 60);

					}
				}
			}

			System.out.println(Arrays.toString(numeroSortiado));
			break;

		case 2:
			
			int[] sorteio = new int[6];

			for (int i = 0; i < 6; i++) {
				System.out.printf("Digite o " + (i + 1) + "º" + " número inteiro:");
				sorteio[i] = entrada.nextInt();

			}

			System.out.println(Arrays.toString(sorteio));
			entrada.close();

		}

	}
}
