package ejercicio4;

public class Test {

	public static void main(String[] args) {
	
		
		Cafetera cafetera1=new Cafetera();
		Cafetera cafetera2=new Cafetera(500);
		Cafetera cafetera3=new Cafetera(750, 500);
		
		
		testearCafetera(cafetera1);
		testearCafetera(cafetera2);
		testearCafetera(cafetera3);
	
		
		
	}

	public static void testearCafetera(Cafetera cafetera) {

		cafetera.agregarCafe(50);
		System.out.println(cafetera.toString());
		cafetera.servirTaza(50);
		System.out.println(cafetera.toString());
	}

}
