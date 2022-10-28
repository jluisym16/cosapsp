package unidad2.ejemplos;

public class TicTac implements Runnable {

	String sonido;

	public TicTac(String sonido) {
		this.sonido = sonido;
	}

	public void run() {
		while (true) //bucle infinito para que se esté ejecutando
			{
			System.out.println(sonido + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}

	public static void main(String[] args) {
		new Thread(new TicTac("TIC")).start();// se crea un hilo que hace tic
		new Thread(new TicTac("TAC")).start();// se crea un hilo que hace tac
		//no tiene que ser tic tac todo el rato por como se distribuyen el trabajo virtual de los hilos
	}
}
