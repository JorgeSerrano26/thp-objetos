package ejercicio8;

public class Test {

	public static void main(String[] args) {
		
		Superheroe superHeroe1 = new Superheroe("Batman", 90, 70, 0);
		Superheroe superHeroe2 = new Superheroe("Superman", 95, 60, 70);
		Superheroe superHeroe3 = new Superheroe("Jorge", -4, 3, -5);//Loser
		Superheroe superHeroe4 = new Superheroe("Bonfil", 9999, 99999, 99999);
		
		System.out.println("super 1 "+ superHeroe1);
		System.out.println("super 2 "+ superHeroe2);
		System.out.println("super 3 "+ superHeroe3);
		System.out.println("super 4 "+ superHeroe4);
		
		System.out.println(superHeroe2.competir(superHeroe1));
		System.out.println(superHeroe3.competir(superHeroe4));
		
	}

}
