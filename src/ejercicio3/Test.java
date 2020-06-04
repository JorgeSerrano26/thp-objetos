package ejercicio3;

public class Test {

	public static void main(String[] args) {
		TarjetaDeCredito tarjeta=new TarjetaDeCredito("4145414122221111", "Juan Perez", 10000 );
		
		tarjeta.realizarCompra(4000);
		System.out.println(tarjeta);
		tarjeta.actualizarLimite(3000);
		tarjeta.realizarCompra(4000);
		System.out.println(tarjeta);
	}

}
