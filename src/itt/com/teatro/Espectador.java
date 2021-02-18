package itt.com.teatro;

/**
 * La clase Espectador representa a un espectador de una obra de teatro.
 * Tan sólo se pueden crear instancias de esta clase desde el paquete itt.com.teatro.
 * @author hannnah
 * @version 1.0
 */

public class Espectador {
	private String nombre;
	private String tlf;
	private int edad;
	
	/**
	 * Constructor de la clase Espectador
	 * @param nombre
	 * @param tlf
	 * @param edad
	 */
	protected Espectador(String nombre, String tlf, int edad) {
		this.nombre = nombre;
		this.tlf = tlf;
		this.edad = edad;
	}
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the tlf
	 */
	public String getTlf() {
		return tlf;
	}


	/**
	 * @param tlf the tlf to set
	 */
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}


	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}


	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
	 * TODO
	 * @return
	 */
	public String rangoEdad() {
		return "";
	}
	
	@Override
	public String toString() {
		return "Espectador:\nNombre: " + this.nombre + "\nTlf: " + this.tlf + "\nEdad: " + this.edad;
	}
}
