package oo.composicao;

public class Carro {

	Motor motor = new Motor();
	
	void acelerar() {
		motor.fatorDeInjecao += 0.4;
	}
	
	void frear() {
		motor.fatorDeInjecao -= 0.4;
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar( ) {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
