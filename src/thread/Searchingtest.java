/**
 * 
 */
package thread;

import datastructure.User;
//import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;
//import sun.jvm.hotspot.tools.SysPropsDumper;

/**
 * @author marcos 30 sept 2025
 */
public class Searchingtest {
	public static void main(String[] args) {
		String targetName = "Luis4000000";

		System.out.println("marcos12" == targetName);

		/*
		 * // Crea un array de objetos de usuario // Usaremos múltiples hilos para
		 * encontrar un usuario concreto
		 */
		// Array of user9
		User[] Clients = new User[2000000]; // Usando 20000 tal cual la imagen

		for (int i = 0; i < Clients.length; i++) {
			// Se asume que el constructor de User toma 5 argumentos:
			// String, int, String, String, boolean
			Clients[i] = new User("Luis" + i, i, "emiliang@arribadda", i);
		}

		long startTime = System.currentTimeMillis();
		SearchWithOneThread(targetName, Clients);
		long endTime = System.currentTimeMillis();
		System.out.println("el tiempo usando por el metodo con un solo hilo es " + (endTime - startTime));
		System.out.println("milisegundos");

		startTime = System.currentTimeMillis();
		searchingWithMultipleThreads(targetName, Clients);

		try {

			/**
			 * el hilo main entra en el modo sleep , va a ser despertado por otro hilo
			 * cuando este haya
			 */
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		endTime = System.currentTimeMillis();
		System.out.println("el tiempo usando por el metodo con un solo hilo es " + (endTime - startTime));
		System.out.println("milisegundos");
	}

	/**
	 * @param targetName
	 * @param clients
	 */
	private static void searchingWithMultipleThreads(String target, User[] clients) {
		// Crear los hilos pasando a cada hilo una tarea
		int index = clients.length / 4;

		// Creación de 4 hilos para dividir el array en 4 partes
		// Thread thread1 = new Thread(new UserSearchingTask(target, clients, 0, 1 *
		// index));
		// Thread thread2 = new Thread(new UserSearchingTask(target, clients, 1 * index
		// + 1, 2 * index));
		// Thread thread3 = new Thread(new UserSearchingTask(target, clients, 2 * index
		// + 1, 3 * index));
		// Thread thread4 = new Thread(new UserSearchingTask(target, clients, 3 * index
		// + 1, clients.length - 1));

		// Lanzar las tareas de los hilos
		// thread2.start();
		// thread3.start();
		// thread4.start();

		// Alternativa con num de procesadores (código comentado en la imagen)
		int numOfThreads = Runtime.getRuntime().availableProcessors();
		index = clients.length / numOfThreads;
		for (int i = 0; i < numOfThreads; i++) {
			Thread threadS = new Thread(new UserSearchingTask(target, clients, i * index, i * index + index , Thread.currentThread()));
			threadS.start();
		}
	}

	/**
	 * @param clients
	 * @param targetName
	 * 
	 */
	private static void SearchWithOneThread(String targetName, User[] clients) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i].getName().equals(targetName)) {
				System.out.println("id of the user is " + clients[i].getId());

			}

		}
	}
}
