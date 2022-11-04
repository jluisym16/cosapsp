package unidad2.ejercicios.fumadores;

public class Fumador implements Runnable {
	Mesa mesa;
	Ingrediente ing;

	public Fumador(Mesa mesa, Ingrediente ing) {
		this.mesa = mesa;
		this.ing = ing;
	}

	@Override
	public void run() {
		while (true) {
			mesa.retirar(ing);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
