package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		
		//Byte
		Byte b = 100;
		Short s = 1000;
		@SuppressWarnings("unused")
		Integer i = 10000;
		Long l = 100000L;
		
		System.out.println(b);
		System.out.println(s.doubleValue());
		System.out.println(s.intValue());
		System.out.println(s.hashCode());
		System.out.println(s.equals(s));
		System.out.println(l / 3.1);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");
	}

}
