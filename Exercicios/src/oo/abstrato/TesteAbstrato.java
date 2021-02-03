package oo.abstrato;

public class TesteAbstrato {
	
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		System.out.println(dog.mover());
		System.out.println(dog.mamar());
		System.out.println(dog.respirar());
	}

}
