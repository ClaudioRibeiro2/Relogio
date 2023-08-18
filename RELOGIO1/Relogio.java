/*Relogio.java 
Classe que representa um relógio com hora, minuto e segundo.*/

// No POO - Classe, objetos, atributos e métodos,
// CLASSE - É estrutura ou molde de um objeto. (Projeto de um carro)
// ATRIBUTOS - Representam as propriedades, características ou 
// o estado de um objeto. (cor, n°de portas, tipo de roda,modelo)
// MÉTODOS - São as operações que um objeto pode realizar. (Acelerar,frear,virar)
// OBJETOS - É um conjunto de atributos e objetos. (Unidade fabricada)
// MODIFICADOR DE ACESSO -
// CONSTRUTOR -
// Getter & Setter -
// SOMBREAMENTO -
// TO STRING -  
// THIS - OBJETO EM EXECUÇÃO - 

// modificador de acesso + class + identificador	
public class Relogio { 
// Sempre que for public, a classe tem que ser com o mesmo nome do arquivo.
	private int hora; // 0 - 23
	private int minuto; // 0 - 59
	private int segundo; // 0 - 59
	
	public Relogio(){  // CONSTRUTOR 
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
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