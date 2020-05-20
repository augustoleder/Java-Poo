package loteria;

//Em desenvolvimento....


public class SistemaLoterica {

	public static void main(String[] args) {

		LotericaInterna loterica = new LotericaInterna();

		Usuario u1 = new Usuario();

		loterica.premiacao(loterica.compararJogo(loterica.sorteio(), u1.fazerJogo(u1.escolha())));
	}

}
