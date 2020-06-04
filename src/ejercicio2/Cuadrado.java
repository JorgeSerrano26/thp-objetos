package ejercicio2;

public class Cuadrado {

	private double lado;

	public Cuadrado(double lado) {
		setLado(lado);
	}

	public void setLado(double newLado) {
		this.lado = newLado;
	}

	public double getLado() {
		return lado;
	}

	public double perimetro() {
		double perimetro = lado * 4;
		return perimetro;
	}

	public double superficie() {
		double superficie = lado * lado;
		return superficie;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", perimetro()=" + perimetro() + ", superficie()=" + superficie() + "]";
	}

}
