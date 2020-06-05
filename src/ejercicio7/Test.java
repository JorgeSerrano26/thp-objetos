package ejercicio7;

public class Test {

	public static void main(String[] args) {
		
		Gato gato = new Gato(100);
		Raton raton  = new Raton(100);
		
		boolean alcanzo = gato.alcanzar(raton, 50);
		
		System.out.println("El gato pudo alcanzar al raton?: " + alcanzo);
	}

}
