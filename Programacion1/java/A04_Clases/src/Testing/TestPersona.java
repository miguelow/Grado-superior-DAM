package Testing;

import Ejercicios.Persona;

public class TestPersona {

	//Aqui incluimos el main ya que pretendemos ejecutar
	public static void main(String[] args) {
		Persona yo = new Persona();
		
		/* Si pongo yo. se vera que hay muchos métodos
		 * estos los hereda de la clase object, este tipo
		 * de herencia -> Herencia implícita
		 * Se hereda todos los métodos y atributos
		 */
		
		/*Si el atributo fuese public podriamos accer asi:
		 * yo.nombre = "Miguel";
		 */
		
		/*
		 * Yo puedo acceder a los metodos de Persona que están puestos
		 * como public. Aquí entra otro principio de la POO:
		 * La encapsulación. Donde una clase proporciona acceso a sus métodos pero 
		 * no a sus atributos directamente
		 */
		
		yo.setNombre("Miguel");
		System.out.println(yo.literalGenero());
		
	}
}
