package thread;

/**
 * @author marcos 30 sept 2025
 */
import datastructure.User; // Asume que 'User' está en un paquete llamado 'datastructure'

public class UserSearchingTask implements Runnable {

	// --- 1. Atributos (Variables de Instancia) ---
	private String target = null;
	private User[] clients = null;
	private int beginning = -1, end = -1;
	private Thread main;

	// --- 2. Constructor ---
	public UserSearchingTask(String target, User[] clients, int beginning1, int end1, Thread thread) {
		this.target = target;
		this.clients = clients;
		this.beginning = beginning1;
		this.end = end1;
		this.main = thread;
	}

	/**
	 * @Override
	 */
	@Override
	public void run() {
		// --- 3. Lógica de Búsqueda (Dentro del método run()) ---
		/* La tarea consiste en buscar un determinado usuario */
		/* en un rango especifico del array */
		for (int i = beginning; i <= end; i++) {
			// Verifica que el elemento no sea null antes de llamar a un método
			if (clients[i] != null && clients[i].getName().equals(target)) {
				System.out.println("Id of the user is " + clients[i].getId());
			}
		}
	}
}
