package ejercicio7;

public class Raton {
	
	private int energia;
	
	public Raton(int energia) {
		this.energia = energia;
	}
	public int distanciaDisponible() {
		int energiapormetro = 2;
		return this.energia / energiapormetro;
	}
}
