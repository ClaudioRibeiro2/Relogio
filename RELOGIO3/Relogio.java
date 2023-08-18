//Relogio.java 
	
public class Relogio { 
	private int segDesdeMeiaNoite
	/*	private	int seg = segDesdeMeiaNoite % 60; // Segundos
		private	int minuto = 
		private	int horas = segDesdeMeiaNoite / 3600 // Horas, validar quando for 86400
	*/
	public Relogio(int hora, int minuto, int segundo){  // CONSTRUTOR 
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);
	}
	
	// Setters & Getter's 
	
	public void setHora(int hora){// Todo set tem que ser void, void é quando não é necessário return.
		int h = (hora >= 0 && hora <= 23 ? hora:0;)

		this.segDesdeMeiaNoite = h * 60 * 60
	}
	public int getHora(){
		return this.seg / 3600;
	}
	public void setMinuto(int minuto){
		//this.minuto = (minuto >= 0 && minuto <= 59 ? minuto: 0);
	}
	public int getMinuto(){
		return 0;
		//return this.minuto;
	}
	public void setSegundo(int segundo){
		//this.segundo = (segundo >= 0 && segundo <= 59 ? segundo: 0);
	}
	public int getSegundo(){
		return 0;
		//return this.segundo;
	}
	public String toString(){
		return String.format("%02d:%02d:%02d",
							getHora(),
							getMinuto(),
							getSegundo());
	}
}// Fim da classe Relogio