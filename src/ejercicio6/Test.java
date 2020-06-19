package ejercicio6;

public class Test {

	public static void main(String[] args) {
		Automovil auto = new Automovil("ferrari", "f11", "ASD-123", 10);
		
		auto.cargarCombustible(10);
		auto.setRendimientoPorLitro(2);
		
		auto.viajar(19);
		
		
		
		System.out.print(auto);

	}

}
