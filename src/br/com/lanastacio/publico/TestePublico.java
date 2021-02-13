package br.com.lanastacio.publico;

import br.com.lanastacio.privado.ExemploPrivate;

public class TestePublico {

	public static void main(String[] args) {
		
		ExemploPrivate privado = new ExemploPrivate();
		privado.metodoPublico();
		
		
		ExemploPublico publico = new ExemploPublico();
		publico.metodoPublico();
		
	}

}
