package thread;

/**
 * 
 * @author marcos 12 sept 2025 la entrada de una aplicacion de Java es un hilo
 *         independiente
 */
public class ThreadTest {
	// hilo main
	public static void main(String[] args) {
		Airport airport = new Airport();
		// creacion de un nuevo hilo y pasa la tarea al hilo
		// este hilo se encarga de registrar entradas
		// EntranceregistrationTask
		Thread Thread = new Thread(new EntranceRegistrationTask(airport));

		Thread.start();

		Thread Thread2 = new Thread(new EntranceRegistrationTask(airport));
		Thread2.start();
		try {
			// hace que este hilo main se duerma 4 segundos
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(airport.getCounter());
		System.out.println(Runtime.getRuntime().availableProcessors());

	}

}
