//Relogio.java 
	
public class Relogio { 
	private int segDesdeMeiaNoite;
	
	public Relogio(int hora, int minuto, int segundo){  // CONSTRUTOR DO OBJETO 
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);
	}
	
	// Setters & Getter's 
	public void setHora(int hora){
		this.segDesdeMeiaNoite = 0;
		int h = (hora >= 0 && hora <= 23 ? hora:0); // 13
		this.segDesdeMeiaNoite += h * 60 * 60; // 46.800
	}
	public int getHora(){
		return this.segDesdeMeiaNoite / 3600;
	}
	public void setMinuto(int minuto){
		int m = (minuto >= 0 && minuto <= 59 ? minuto: 0); // 27
		this.segDesdeMeiaNoite += m * 60;// + 1.620
	}
	public int getMinuto(){
		return (this.segDesdeMeiaNoite % 3600) / 60;
	}
	public void setSegundo(int segundo){
		int s = (segundo >= 0 && segundo <= 59 ? segundo: 0); // 6
		this.segDesdeMeiaNoite += s; // + 6
	}
	public int getSegundo(){
		return this.segDesdeMeiaNoite % 60;
	}
	public String toString(){
		return String.format("%02d:%02d:%02d",
							getHora(),
							getMinuto(),
							getSegundo());
	}
}// Fim da classe Relogio