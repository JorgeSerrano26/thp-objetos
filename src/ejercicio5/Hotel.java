package ejercicio5;

public class Hotel {
	private String nombre;
	private String localidad;
	private int habitacionesTotales;
	private int habitacionesOcupadas;
	private int habitacionesReservadas;

	public Hotel(String nombre, String localidad, int habitacionesTotales) {
		if (habitacionesTotales < 1) {
			habitacionesTotales = 1;
		}
		setNombre(nombre);
		setLocalidad(localidad);
		setHabitacionesTotales(habitacionesTotales);
	}

	public Hotel(String nombre, String localidad, int habitacionesTotales, int habitacionesOcupadas,
			int habitacionesReservadas) {
		if (habitacionesTotales < 1) {
			habitacionesTotales = 1;
		}
		if (habitacionesReservadas > habitacionesTotales) {
			habitacionesReservadas = habitacionesTotales;
		} else if (habitacionesReservadas < 0) {
			habitacionesReservadas = 0;
		}
		setNombre(nombre);
		setLocalidad(localidad);
		setHabitacionesTotales(habitacionesTotales);
		setHabitacionesOcupadas(habitacionesOcupadas);
		setHabitacionesReservadas(habitacionesReservadas);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	private void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getHabitacionesTotales() {
		return habitacionesTotales;
	}

	private void setHabitacionesTotales(int habitacionesTotales) {
		this.habitacionesTotales = habitacionesTotales;
	}

	public int getHabitacionesOcupadas() {
		return habitacionesOcupadas;
	}

	private void setHabitacionesOcupadas(int habitacionesOcupadas) {
		this.habitacionesOcupadas = habitacionesOcupadas;
	}

	public int getHabitacionesReservadas() {
		return habitacionesReservadas;
	}

	private void setHabitacionesReservadas(int habitacionesReservadas) {
		this.habitacionesReservadas = habitacionesReservadas;
	}

	public boolean reservarHabitaciones(int habitacionesAReservar) {
		boolean reservo = false;
		int habitacionesDisponibles = (getHabitacionesTotales()
				- (getHabitacionesOcupadas() + getHabitacionesReservadas()));

		if (habitacionesDisponibles > 0) {
			if (habitacionesAReservar <= habitacionesDisponibles) {
				reservo = true;
				this.habitacionesReservadas = this.habitacionesReservadas + habitacionesAReservar;
			}
		}
		return reservo;
	}

	public boolean ocuparHabitaciones(int habitacionesAOcupar, boolean sonDeLaReserva) {
		boolean ocuparon = false;
		int habitacionesDisponibles = (getHabitacionesTotales()
				- (getHabitacionesOcupadas() + getHabitacionesReservadas()));
		if (habitacionesDisponibles > 0) {
			if (habitacionesAOcupar <= habitacionesDisponibles) {
				if (sonDeLaReserva == true) {
					if (this.habitacionesReservadas < habitacionesAOcupar) {
						ocuparon = false;
					}
					else {
						ocuparConReserva(habitacionesAOcupar);
						ocuparon=true;
					}
				} else {
					ocuparSinReserva(habitacionesAOcupar);
					ocuparon = true;
				}
				
			}
		}

		return ocuparon;
	}

	private void ocuparConReserva(int habitacionesAOcupar) {
		this.habitacionesOcupadas = this.habitacionesOcupadas + habitacionesAOcupar;
		this.habitacionesReservadas = this.habitacionesReservadas - habitacionesAOcupar;
	}

	private void ocuparSinReserva(int habitacionesAOcupar) {
		this.habitacionesOcupadas = this.habitacionesOcupadas + habitacionesAOcupar;
	}

	public boolean desocuparHabitaciones(int habitacionesADesocupar) {
		boolean desocuparon = false;
		if (getHabitacionesOcupadas() >= habitacionesADesocupar) {
			this.habitacionesOcupadas = this.habitacionesOcupadas - habitacionesADesocupar;
			desocuparon = true;
		}

		return desocuparon;
	}

	public int cantidadHabitacionesLibres() {
		int habitacionesLibres = (getHabitacionesTotales() - getHabitacionesOcupadas());

		return habitacionesLibres;
	}

	public int disponibilidad() {
		int disponibles = (getHabitacionesTotales() - (getHabitacionesOcupadas() + getHabitacionesReservadas()));

		return disponibles;
	}

	@Override
	public String toString() {
		return "Hotel [nombre=" + nombre + ", localidad=" + localidad + ", habitacionesTotales=" + habitacionesTotales
				+ ", habitacionesOcupadas=" + habitacionesOcupadas + ", habitacionesReservadas="
				+ habitacionesReservadas + ", cantidadHabitacionesLibres()=" + cantidadHabitacionesLibres()
				+ ", disponibilidad()=" + disponibilidad() + "]";
	}

}
