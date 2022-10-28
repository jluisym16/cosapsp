package unidad2.ejemplos.interbloqueo;

public class Almacen {
	private int almacenados = 0;
	 private String [] productos;

	public Almacen(int capacidad) {
		productos = new String[capacidad];
	}

	public synchronized void almacenar(String producto) {
		 while (almacenados == productos.length) // almacén lleno
		 try { wait(); } catch (InterruptedException e) {}
		 productos[almacenados++] = producto;
		 notifyAll();
		 }
	//notifyAll despierta todos los hilos que estén en estado wait en el monitor
		// para sacarlo del wait se ha de invocar a un metodo notify del mismo monito
		// que lo pone en bloqueo


	public synchronized String retirar() {
		//se cambia el if por un while para que no se quede atorada la accion en el producto
		 while (almacenados == 0) // almacén vacío
		 try { wait(); } catch (InterruptedException e) {}
		 String producto = productos[--almacenados];
		 notifyAll();
		 return producto;
		 }


}
