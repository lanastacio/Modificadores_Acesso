package br.com.lanastacio.privado;


/**
 * Temos uma classe pública com métodos private. Ou seja, acessadas somente pela própria classe.
 * @author gilsonbraggion
 *
 */
public class ExemploPrivate {
	
	/**
	 * Método público que outras classes podem fazer acesso.
	 * @return
	 */
	public void metodoPublico() {
		
		System.out.println("Este texto está sendo exibido pois o método é publlic e foi chamado de outra classe");
		
	}
	
	/**
	 * Método que não pode ser chamado diretamente de uma classe externa.
	 */
	private void metodoPrivate() {
		System.out.println("Este método somente quem pode chamar é a própria classe ExemploPrivate");
	}
	
	/**
	 * Método acessível de fora, que também acessa um método interno private.
	 */
	public void metodoQueChamaTodos() {
		
		metodoPublico();
		
		metodoPrivate();
		
		
	}

}
