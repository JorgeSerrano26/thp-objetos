package ejercicio1;

public class Test {

	public static void main(String[] args) {
		Persona persona=new Persona();
		Persona persona2=new Persona();
		
		persona.setName("Diego");
		persona2.setName("Pablo");
		persona.setApellido("Díaz ");
		persona2.setApellido("Gómez");
		persona.setDireccion("Yatay 240 ");
		persona2.setDireccion("Av. del Libertador 6796");
		
		System.out.println(persona);
		System.out.println(persona.getName());
		System.out.println(persona.getApellido());
		System.out.println(persona.getDireccion());
		System.out.println(persona2);
		System.out.println(persona2.getName());
		System.out.println(persona2.getApellido());
		System.out.println(persona2.getDireccion());
		
		
	
	
	}

}
