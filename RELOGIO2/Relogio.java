//Relogio.java 
	
public class Relogio { 
	private int hora; // 0 - 23
	private int minuto; // 0 - 59
	private int segundo; // 0 - 59
	
	public Relogio(int hora, int minuto, int segundo){  // CONSTRUTOR 
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);
	}
	
	// Setters & Getter's 
	
	public void setHora(int hora){// Todo set tem que ser void, void é quando não é necessário return.
		this.hora = (hora >= 0 && hora <=23 ? hora: 0);
	// Se não passar na validação, a hora é setada para 0.
	}
	public int getHora(){
		return this.hora;
	}
	public void setMinuto(int minuto){
		this.minuto = (minuto >= 0 && minuto <= 59 ? minuto: 0);
	}
	public int getMinuto(){
		return this.minuto;
	}
	public void setSegundo(int segundo){
		this.segundo = (segundo >= 0 && segundo <= 59 ? segundo: 0);
	}
	public int getSegundo(){
		return this.segundo;
	}
	public String toString(){
		return String.format("%02d:%02d:%02d",
							getHora(),
							getMinuto(),
							getSegundo());
	}
}// Fim da classe Relogio