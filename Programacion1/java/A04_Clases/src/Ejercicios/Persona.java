package Ejercicios;

public class Persona {
/*
 * Persona es una clase de negocio, estas clases
 * llevan todos los atributos que representan todos los objetos 
 * de la clase persona
 */
	
	private int idPerona;
	private String nombre;
	private String apellidos;
	private double salario;
	private double complementoSalario;
	private char genero;
	
	public String literalGenero() {
		return nombre;
	}
	
	public void setNombre(String paramNombre) {
		nombre = paramNombre;
	}
}
