package unidad2.ejemplos.contador;

public class Contador {
	private static int n;

	public Contador(int n) {
		this.n = n;
		/*
		 * El monitor sería "Contador.class" en el case de la clase fuese static
		 */
	}
	/*
	 * el mecanismo del metodo synchronized es:
	 * existe un objeto que se denomina el monitor y que gestiona un bloqueo
	 * 
	 * 
	 * la otra forma de sincronizar es hacerlo a mano con un monitor y un lock
	 * 
	 * cuando un hilo entra en una seccion critica, adquiere el bloqueo del monitor
	 * cuando se libera se compite por obtener el bloqueo
	 */
	/*
	 * es un metodo de instancia (no estatico)
	 */
	/*
	 * si declaras el metodo como static, la variable tambien será static
	 */
	public void inc() {
		// este metodo es una seccion critica, cuando se invoque a este método,
		// ningun otro hilo puede ejecutar, para evitar esto, se define el método como
		// synchronized
		synchronized(this){
		n++;
		}
		/*
		 * en el caso de que hubiera mas codigo, la seccion crítica seguiría seriendo n++
		 * para reducirlo se metería en un bloque synchronized
		 */
	}

	public int get() {
		return n;
	}

}
