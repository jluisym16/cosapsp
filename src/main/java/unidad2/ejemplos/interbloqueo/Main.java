package unidad2.ejemplos.interbloqueo;

public class Main {
	public static void main(String[] args)throws InterruptedException {
		 Almacen almacen = new Almacen(10);
		 Productor productor = new Productor(almacen, 100);
		 Consumidor consumidor = new Consumidor(almacen, 1000);
		 Productor productor2 = new Productor(almacen, 100);
		 Consumidor consumidor2 = new Consumidor(almacen, 1000);
		 productor.start();
		 productor2.start();
		 Thread.sleep(1000);
		 consumidor2.start();
		 consumidor.start();
		 }
}
