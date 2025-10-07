/**
 * 
 */
package basics;

import java.security.PrivateKey;

/**
 * @author marcos 26 sept 2025
 */
public class OperatorsTest {
	public static void main(String[] args) {

		arithmeticOperations();
		

	}

	/**
	 * 
	 */
	private static void arithmeticOperations() {
		// TODO Auto-generated method stub
		
		
	// declaramos 3 variables del mismo tipo en la misma linea
	float num1 = 10 , num2 = 20.234f , num3;
	num1 = 23.34f;
	System.out.println(num1);
	//suma
	float  result = num1 + num2;
	System.out.println("the result is " + result);
	/**
	 * Operacion de resta 
	 * 1 el cpu lee el valor de la variable "result "
	 * 2 se realiza la resta con el numero 1 
	 * 3 se guarda el resultado en la misma variable "result"
	 * 
	 * El orden de la operacion es de derecho a la izquierda
	 * 
	 */
	result = result = 1;
	System.out.println("the result is " + result);

	result -= 1; // es lo mimo que result = result - 1;
	System.out.println("the result is " + result);
	//multiplicacion
	result = result * 2;
	result *= 2;
	System.out.println("the result is " + result);
	//division
	result = result / 2;
	result /= 2;
	System.out.println("the result is " + result);

		
	}

}
