package ejercicio6;

public class Automovil {
	private String marca;
	private String modelo;
	private String patente;
	private double capacidadTanque;
	private double cantidadCombustible;
	private double rendimientoPorLitro;
	
	/**
	 * @param marca Marca del auto
	 * @param modelo Modelo del auto
	 * @param patente Patente del auto
	 * @param capacidadTanque Capacidad del tanque
	 */
	public Automovil(String marca, String modelo, String patente, double capacidadTanque) {
		setMarca(marca);
		setModelo(modelo);
		setPatente(patente);
		setCapacidadTanque(capacidadTanque);
	}
	
	/* MARCA */
	public String getMarca() {
		return marca;
	}
	private void setMarca(String marca) {
		this.marca = marca;
	}

	/* MODELO */
	public String getModelo() {
		return modelo;
	}
	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/* PATENTE */
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}

	/* CAPACIDAD */
	public double getCapacidadTanque() {
		return capacidadTanque;
	}
	private void setCapacidadTanque(double capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}

	/* CANTIDAD */
	public double getCantidadCombustible() {
		return cantidadCombustible;
	}
	private void setCantidadCombustible(double cantidadCombustible) {
		this.cantidadCombustible = cantidadCombustible;
	}
	
	/* RENDIMIENTO */
	public double getRendimientoPorLitro() {
		return rendimientoPorLitro;
	}
	public void setRendimientoPorLitro(double rendimientoPorLitro) {
		this.rendimientoPorLitro = rendimientoPorLitro;
	}

	

	/**
	 * @param kmARecorrer
	 * @return {@code double} Kilometros recorridos 
	 */
	public double viajar(double kmARecorrer) {
		double kmRecorridos = 0;
		
		if(kmARecorrer > 0 ) {
			kmRecorridos = consumirCombustible(kmARecorrer);
		}
		
		return kmRecorridos;
	}
	
	/**
	 * @param kmARecorrer
	 * @return Kilometros recorridos con la cantidad de combustible que tengo
	 */
	private double consumirCombustible(double kmARecorrer) {
		double kmDisponibles = getCantidadCombustible() * getRendimientoPorLitro();
		double kmRecorridos;
		
		if(kmARecorrer < kmDisponibles) {
			kmRecorridos = kmARecorrer;
			double combustibleRestante = getCantidadCombustible() - (kmARecorrer / this.rendimientoPorLitro);
			setCantidadCombustible(combustibleRestante);
		}else {
			kmRecorridos = kmDisponibles;
			setCantidadCombustible(0);
		}
		return kmRecorridos;
	}
	
	/**
	 * @param litrosACargar
	 * @return {@code true} si litrosACargar es menor a la capicidad disponible y mayor a 0,
	 * de lo contrario, retorna false
	 */
	public boolean cargarCombustible(double litrosACargar) {
		boolean cargoCombustible = false;
		
		
		if(litrosACargar > 0 && litrosACargar <= espacioDisponible()) {
			this.cantidadCombustible += litrosACargar;
			cargoCombustible  = true;
		}
		return cargoCombustible;
	}

	private double espacioDisponible() {
		return (this.capacidadTanque - this.cantidadCombustible);
	}
	
	public boolean pocoCombustible() {
		boolean menos15 = false;
		
		if((this.cantidadCombustible * 100 / this.capacidadTanque ) < 15)
		{
			menos15 = true;
		}
		
		return menos15;
	}
	/*
	 * private String marca;
	private String modelo;
	private String patente;
	private double capacidadTanque;
	private double cantidadCombustible;
	private double rendimientoPorLitro;
	 */
	@Override
	public String toString() {
		String data = "";
		data += "[Marca: "+ getMarca() +"]\n";
		data += "[Modelo: "+ getModelo() +"]\n";
		data += "[Patente: "+ getPatente() +"]\n";
		data += "[Capacidad del tanque: "+ getCapacidadTanque() +"]\n";
		data += "[Cantidad de combustible: "+ getCantidadCombustible() +"L]\n";
		data += "[Rendimiento por litro: " + getRendimientoPorLitro()+ "]\n";
		data += "[Espacio disponible: "+ espacioDisponible() + "L]\n";
		data += "[Menos del 15% de combustible?: "+ pocoCombustible() + "]\n";
		return data;
	}
	
}
