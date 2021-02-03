package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		String s = new String("texto");
		s.toUpperCase();
		
		System.out.println(s);
		
		int a = 123;
		System.out.println(a);
	}

}
