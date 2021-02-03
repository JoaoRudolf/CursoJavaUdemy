package oo.abstrato;

public abstract class Mamifero extends Animal {
	
	@Override
	public String mover() {
		return "usando as patas";
	}
	
	public abstract String mamar();

}
