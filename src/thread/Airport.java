/**
 * 
 */
package thread;

/**
 * @author marcos 16 sept 2025
 */
public class Airport {
	private int counter = 0;

	/**
	 * 
	 */
	public synchronized void increment() {
		// incrementar el valor de la variable de counter por uno
		// counter++
		// counter = counter + 1
		// los dos comandos son iguales
		// CPU unidad central de procesamiento
		// paso 1 : hace el valor actual de la variable "counter" la mete en la memoria
		// paso 2 : hace la suma con el valor actual de "counter" con 1
		// paso 3 : actualizar el valor guardado en la variable con el
		counter = counter + 1;
		// incrementar el valor de la variable de counter es
	}

	public void decrease() {
		// decrecer el valor de la variable de counter por uno
		counter--;

	}

	public int getCounter() {
		return counter;

	}

	/**
	* 
	*/
	public void decrease1() {
		// TODO Auto-generated method stub

	}

}
