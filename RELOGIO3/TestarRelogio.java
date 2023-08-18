// TestarRelogio.java
// ClASSE PARA INSTACIAR UM RELÓGIO E DEMONSTRAR O USO DE SEUS MÉTODOS.

public class TestarRelogio {
	public static void main(String[] args) {
		Relogio relogio01 = new Relogio(666, 999, -666);
		
		System.out.printf("Relógio 01: %s%n", relogio01);

		relogio01.setHora(13);
		relogio01.setMinuto(27);
		relogio01.setSegundo(6);

		System.out.printf("Relógio 01: %s%n", relogio01);

	} // Fim do método main.
} // Fim da classe Testar Relogio.java