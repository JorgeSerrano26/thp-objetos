package ejercicio8;

public class Superheroe {

	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;

	public Superheroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		setNombre(nombre);
		setFuerza(fuerza);
		setResistencia(resistencia);
		setSuperpoderes(superpoderes);
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setFuerza(int fuerza) {
		if (fuerza > 100) {
			this.fuerza = 100;
		} else if (fuerza < 0) {
			this.fuerza = 0;
		} else {
			this.fuerza = fuerza;
		}
	}

	private int getFuerza() {
		return fuerza;
	}

	private void setResistencia(int resistencia) {
		if (resistencia > 100) {
			this.resistencia = 100;
		} else if (resistencia < 0) {
			this.resistencia = 0;
		} else {
			this.resistencia = resistencia;
		}
	}

	private int getResistencia() {
		return resistencia;
	}

	private void setSuperpoderes(int superpoderes) {
		if (superpoderes > 100) {
			this.superpoderes = 100;
		} else if (superpoderes < 0) {
			this.superpoderes = 0;
		} else {
			this.superpoderes = superpoderes;
		}
	}

	private int getSuperpoderes() {
		return superpoderes;
	}

	public String competir(Superheroe competidor) {
		String resultado = "empate";
		int contSup1 = 0;
		int contSup2 = 0;

		if (this.fuerza > competidor.getFuerza()) {
			contSup1++;
		} else if (this.fuerza < competidor.getFuerza()) {
			contSup2++;
		} else {
			contSup1++;
			contSup2++;
		}

		if (this.resistencia > competidor.getResistencia()) {
			contSup1++;
		} else if (this.resistencia < competidor.getResistencia()) {
			contSup2++;
		} else {
			contSup1++;
			contSup2++;
		}

		if (this.superpoderes > competidor.getSuperpoderes()) {
			contSup1++;
		} else if (this.superpoderes < competidor.getSuperpoderes()) {
			contSup2++;
		} else {
			contSup1++;
			contSup2++;
		}

		if (contSup1 > contSup2) {
			resultado = "Triunfo";
		} else if (contSup1 < contSup2) {
			resultado = "Derrota";
		} else {
			resultado = "Empate";
		}
		return resultado;
	}

	@Override
	public String toString() {
		return ("Nombre: " + nombre + ", Fuerza: " + fuerza + ", Resistencia: " + resistencia + ", Superpoderes: "
				+ superpoderes);
	}
}
