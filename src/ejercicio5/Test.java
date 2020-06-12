package ejercicio5;

public class Test {

	public static void main(String[] args) {
		Hotel hotel= new Hotel("Hilton", "CABA", 200);
		
		System.out.println(hotel);
		System.out.println(hotel.ocuparHabitaciones(201, false));
		System.out.println(hotel);
		System.out.println(hotel.ocuparHabitaciones(30, false));
		System.out.println(hotel);
		System.out.println(hotel.reservarHabitaciones(50));
		System.out.println(hotel);
		System.out.println(hotel.desocuparHabitaciones(200));
		System.out.println(hotel);
		System.out.println(hotel.ocuparHabitaciones(30, true));
		System.out.println(hotel);	
		System.out.println(hotel.ocuparHabitaciones(30, true));
		System.out.println(hotel);
		System.out.println(hotel.desocuparHabitaciones(40));
		System.out.println(hotel);
		
		
		System.out.println("----------------------------------------------------------------------------");
	
		Hotel hotel2= new Hotel("Astoria", "MDQ", 150, 100, 10);
		
		System.out.println(hotel2);
		System.out.println(hotel2.ocuparHabitaciones(201, false));
		System.out.println(hotel2);
		System.out.println(hotel2.ocuparHabitaciones(30, false));
		System.out.println(hotel2);
		System.out.println(hotel2.reservarHabitaciones(50));
		System.out.println(hotel2);
		System.out.println(hotel2.desocuparHabitaciones(200));
		System.out.println(hotel2);
		System.out.println(hotel2.ocuparHabitaciones(30, true));
		System.out.println(hotel2);	
		System.out.println(hotel2.ocuparHabitaciones(30, true));
		System.out.println(hotel2);
		System.out.println(hotel2.desocuparHabitaciones(40));
		System.out.println(hotel2);
	}

}
