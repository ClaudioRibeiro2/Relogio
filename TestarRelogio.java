// TestarRelogio.java
// ClASSE PARA INSTACIAR UM RELÓGIO E DEMONSTRAR O USO DE SEUS MÉTODOS.

public class TestarRelogio {
	public static void main(String[] args) {
		Relogio relogio01 = new Relogio();
		Relogio relogio02 = new Relogio();
		
		System.out.printf("Relógio 01: %s%n", relogio01);
		System.out.printf("Relógio 02: %s%n%n", relogio02);

		relogio01.setHora(13);
		relogio01.setMinuto(27);
		relogio01.setSegundo(6);
			
		System.out.printf("Relógio 01: %s%n", relogio01);
		System.out.printf("Relógio 02: %s%n%n", relogio02);
		
		relogio02.setHora(23);
		relogio02.setMinuto(14);
		relogio02.setSegundo(-1);
		
		System.out.printf("Relógio 01: %s%n", relogio01);
		System.out.printf("Relógio 02: %s%n%n", relogio02);	
	} // Fim do método main.
} // Fim da classe Testar Relogio.java