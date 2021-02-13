package br.com.lanastacio.privado;

public class TestePrivado {

	public static void main(String[] args) {
		
		ExemploPrivate privado = new ExemploPrivate();
		
		privado.metodoPublico();
		
		privado.metodoQueChamaTodos();
		
		// Este método dá erro pois ele é private, portanto não é visível de fora.
//		privado.metodoPrivate();
		

	}

}
