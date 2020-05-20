package transito;

public class Carro {
	
	int velocidadeAtual;
	String placa;
	int delta = 11;

	void acelerar() {
		
		if (velocidadeAtual < 220) {
			
			 velocidadeAtual += delta;
		
		}else if (velocidadeAtual >= 220) { 
			velocidadeAtual =220;
		}
	}
	

	int frear() {
		if (velocidadeAtual > 0) {
			return velocidadeAtual -= 5;
		} else {
			return velocidadeAtual = 0;
		}
	}

	
	 public String toString() { // esse método deve ser publico obrigatoriamente
	 
		 return "Velocidade atual é " + velocidadeAtual + "Km/h";
	 
	 }
	
}