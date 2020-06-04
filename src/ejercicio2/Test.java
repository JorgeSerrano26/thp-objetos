package ejercicio2;

public class Test {

	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado(10);
		System.out.println(cuadrado);
		System.out.println("Cambio la medida del lado a 50");
		cuadrado.setLado(50);
		System.out.println(cuadrado);

	}

}
