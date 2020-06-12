package ejercicio4;

public class Cafetera {
	private int capacidadMaxima;
	private int cantidadActual;

	public Cafetera() {
		setCapacidadMaxima(1000);
		setCantidadActual(0);
	}

	public Cafetera(int newCapacidadMaxima) {
		setCapacidadMaxima(newCapacidadMaxima);
		this.cantidadActual = 0;
	}

	public Cafetera(int newCapacidadMaxima, int newCantidadActual) {
		setCapacidadMaxima(newCapacidadMaxima);
		this.cantidadActual = newCantidadActual;
		if (cantidadActual > capacidadMaxima) {
			cantidadActual = capacidadMaxima;
		}
	}

	public void setCapacidadMaxima(int newCapacidadMaxima) {
		if (newCapacidadMaxima < 250) {
			this.capacidadMaxima = 250;
		} else {
			this.capacidadMaxima = newCapacidadMaxima;
		}
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	private void setCantidadActual(int newCantidadActual) {
		if (newCantidadActual < 0) {
			this.cantidadActual = 0;

		} else if (newCantidadActual > capacidadMaxima) {
			this.cantidadActual = capacidadMaxima;
		} else {
			cantidadActual = newCantidadActual;
		}

	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void llenar() {
		cantidadActual = capacidadMaxima;
	}

	public int servirTaza(int newCantidadTaza) {
		int sirvioTaza = 0;

		if (newCantidadTaza > cantidadActual) {
			System.out.println("No se puede servir la taza con la cantidad requerida :(");
			sirvioTaza = cantidadActual;
			System.out.println("Pero pudimos servir" + cantidadActual + " que es lo que nos quedaba");
		} else {
			System.out.println("Se pudo servir la taza con la cantidad requerida :)");
			sirvioTaza = newCantidadTaza;
		}
		return sirvioTaza;
	}

	public void vaciar() {
		cantidadActual = 0;
	}

	public int agregarCafe(int cantidadAgregar) {
		int cantidadSobrante = 0;
		if (cantidadAgregar <= (capacidadMaxima - cantidadActual)) {
			System.out.println("Se agrego correctamente y no sobro nada");
			cantidadActual = cantidadActual + cantidadAgregar;
		} else {

			cantidadSobrante = (cantidadActual + cantidadAgregar) - capacidadMaxima;
			llenar();
			System.out.println("Se agrego pero sobro " + cantidadSobrante);
		}
		return cantidadSobrante;
	}

	
	@Override
	public String toString() {
		return "CapacidadMaxima y CantidadActual [CapacidadMaxima=" + capacidadMaxima + "CantidadActual="+  cantidadActual +"]";	
	}

}
