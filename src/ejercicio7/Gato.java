package ejercicio7;

public class Gato {
	
	private int energia;
	
	public Gato(int energia) {
		this.energia = energia;
	}
	public double distanciaDisponible() {
		int energiapormetro = 1;
		return this.energia / energiapormetro;
	}

	public boolean alcanzar(Raton raton, double metros) {
		boolean alcanzo = false;
		
		double posicionFinalGato, posicionFinalRaton;
		posicionFinalGato = distanciaDisponible();
		posicionFinalRaton = metros + raton.distanciaDisponible();
		
		if(posicionFinalGato >= posicionFinalRaton) {
			alcanzo  = true;
		}
		return alcanzo;
	}
}
