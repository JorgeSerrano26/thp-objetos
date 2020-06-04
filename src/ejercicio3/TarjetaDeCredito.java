package ejercicio3;

public class TarjetaDeCredito {

	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double acumuladoActual;

	public TarjetaDeCredito(String newNumero, String newTitular, double newLimiteDeCompra) {
		setNumero(newNumero);
		setTitular(newTitular);
		setLimiteDeCompra(newLimiteDeCompra);
		acumuladoActual = 0;
	}

	private void setNumero(String newNumero) {
		this.numero = newNumero;
	}

	public String getNumero() {
		return numero;
	}

	private void setTitular(String newTitular) {
		this.titular = newTitular;

	}

	public String getTitular() {
		return titular;
	}

	private void setLimiteDeCompra(double newLimiteDeCompra) {
		this.limiteDeCompra = newLimiteDeCompra;
	}

	public double getAcumuladoActual() {
		return acumuladoActual;
	}

	public double montoDisponible() {
		double montoDisponible = limiteDeCompra - acumuladoActual;
		if (montoDisponible < 0) {
			montoDisponible = 0;
		}
		return montoDisponible;
	}

	private boolean compraPosible(double monto) {
		boolean compraPosible = false;
		if (monto <= montoDisponible()) {
			compraPosible = true;
		}
		return compraPosible;
	}

	public void actualizarLimite(double newLimiteDeCompra) {
		this.limiteDeCompra = newLimiteDeCompra;
	}

	private void acumularGastoActual(double importeCompra) {

		this.acumuladoActual = this.acumuladoActual + importeCompra;

	}

	public boolean realizarCompra(double monto) {
		boolean realizarCompra = false;
		if (compraPosible(monto) == true) {
			acumularGastoActual(monto);
			System.out.println("Se realizo la compra");
			realizarCompra = true;
		} else {

			System.out.println("No se puede realizar la compra");
			realizarCompra = false;

		}
		return realizarCompra;
	}

	@Override
	public String toString() {
		return "TarjetaDeCredito [numero=" + numero + ", titular=" + titular + ", limiteDeCompra=" + limiteDeCompra
				+ ", acumuladoActual=" + acumuladoActual + ", montoDisponible=" + montoDisponible() + "]";
	}
}
