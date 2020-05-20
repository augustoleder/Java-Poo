package loteria;

import java.util.Arrays;
import java.util.Scanner;

public class Usuario {

	String tipo;
	String nome;
	
	Scanner entrada = new Scanner(System.in);
	int escolha() {

		System.out.println("Seja bem vindo ao programa: \n*** Mega do Lepo-Lepo ***");

		System.out.println("Escolha a forma como deseja jogar... \n");

		

		System.out.println("Gerar n�meros aleat�rios.\nDigite:1\n");

		System.out.println("Escolher seus n�meros.\nDigite:2");
		int valor = entrada.nextInt();

		

		return valor;
	}

	int[] fazerJogo(int escolha) {
			

		int[] numeroSortiado = new int[6];
		switch (escolha) {
		case 1:
			for (int i = 0; i < 6; i++) {
				numeroSortiado[i] = (int) (1 + Math.random() * 60);
				for (int j = 0; j < 6; j++) {
					numeroSortiado[j] = numeroSortiado[i];
					// essa estrutura � para evitar gerar numero repetitivos
					while ((numeroSortiado[i] == numeroSortiado[j]) && (j != i)) {
						numeroSortiado[j] = (int) (1 + Math.random() * 60);
					}
				}

			}

			System.out.println("Seu n�mero sortiado foi: " + Arrays.toString(numeroSortiado));

			break;

		case 2:
			
			
			for (int i = 0; i < 6; i++) {

				System.out.println("Digite o " + (i + 1) + "�" + " n�mero inteiro:");
				
				numeroSortiado[i] = entrada.nextInt();
				
			}

			System.out.printf(Arrays.toString(numeroSortiado));
			
			entrada.close();
			
			break;

		}
		
		return numeroSortiado;
	}

}

//implementar pergunta se deseja confirmar a sequencia de codigo
// implementar comando ao digitar limpar valor do console
// colocar uma condi��o que se o nummero n�o for inteiro digite novamente