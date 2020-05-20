package loteria;

import java.util.Arrays;

public class Teste {

	public static void main(String[] args) {

		System.out.println("Numeros random");

		int mega[] = { 60, 60, 60, 60, 60, 60 };
		System.out.println(Arrays.toString(mega));
		// int teste[] = {3,5,6,10,9,12};
		for (int i = 0; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				// essa estrutura é para não gerar numero repetitivos
				while ((mega[i] == mega[j])   && (j != i)) {
					mega[j] = (int) (1 + Math.random() * 60); // mega[j] + 1;

				}
			}
		}
		

		System.out.println("O NOVO VETOR AJUSTADO É >>>>>\n"+Arrays.toString(mega));
	}
}
