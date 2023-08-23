// TestarRelogio.java
// ClASSE PARA INSTACIAR UM RELÓGIO E DEMONSTRAR O USO DE SEUS MÉTODOS.

public class TestarRelogio {
	public static void main(String[] args) {
		Relogio relogio1 = new Relogio(13, 27, 6);
		Relogio relogio2 = new Relogio(99, 99, 99);

		System.out.printf("Relógio 1: %s%n", relogio1);
		System.out.printf("Relógio 2: %s%n", relogio2);

		relogio1.setHora(19);
		relogio1.setMinuto(0);
		relogio1.setSegundo(45);

		System.out.printf("%nRelógio 1 alterado para: %s%n", relogio1);
		System.out.printf("Relógio 2 alterado para: %s%n", relogio2);

		relogio2.setHora(18);
		relogio2.setMinuto(54);
		relogio2.setSegundo(37);
		
		System.out.printf("%nRelógio 1 alterado para: %s%n", relogio1);
		System.out.printf("Relógio 2 alterado para: %s%n", relogio2);
		
		relogio1.setHora(18);
		relogio2.setMinuto(06);
		
		System.out.printf("%nRelógio 1 alterado para: %s%n", relogio1);
		System.out.printf("Relógio 2 alterado para: %s%n", relogio2);
	} // Fim do método main.
} // Fim da classe Testar Relogio.java