/**
 * 
 */
package thread;

/**
 * @author marcos 19 sept 2025
 */
public class ExitRegistrationTask implements Runnable {

	private Airport airport;

	/**
	 * @param airport
	 */
	public ExitRegistrationTask(Airport airport) {
		this.airport = airport;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("Start the task");
		try {
			// obtener el nombre del hulo que esta ejecutando
			System.out.println("The thread name is " + Thread.currentThread().getName());
			// hacer que este hilo se duerma 2 segundos
			System.out.println("The thread " + Thread.currentThread().getName() + " has entered the sleep mode");
			Thread.sleep(2000);
			for (int i = 0; i < 1; i++) {
				airport.increment();
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The task is finished");

	}

}
