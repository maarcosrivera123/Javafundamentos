/**
 * 
 */
package basic;



/**
 * @author marcos 7 oct 2025
 */

public class OperatorsTest {

	public static void main(String[] args) {
		arithmeticOperation();

		logicaloperatorstest();
	}

	private static void logicaloperatorstest() {
		// logical significa "O lógico"
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(true || false);
		System.out.println(false || false);

		// logical and && significa "Y lógico"
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true && false);
		System.out.println(false && false);

		boolean eyeClosed = false;
		boolean breathslow = true;
		if (eyeClosed && breathslow) {
			System.out.println("esta durmiendo");

		} else {
			System.out.println("no esta durmiendo");
		}

	}

	private static void arithmeticOperation() {
		// TODO Auto-generated method stub

		// Declarando tres variables of the same type
		float num1 = 10, num2 = 20.34f, num3;

		System.out.println(num1);
		num1 = 20.34f;
		System.out.println(num1);

		// Operacion de suma
		float result = num1 + num2;
		System.out.println("The result is " + result);

		// Operacion de resta
		/*
		 * 1er cpu lee el valor de la variable result 2do cpu lee y la resta con el
		 * numero 1 3ro guarda el resultado en la misma variable result
		 */
		result = result - 1;
		System.out.println("The result is " + result);

		// Operacion de multiplicacion
		result = result * 2;
		System.out.println("The result is " + result);

		// Operacion de division
		result = result / 3;
		System.out.println("The result is " + result);

		// Operacion de modulo
		result = result % 1;
		System.out.println("The result is " + result);
	}

}