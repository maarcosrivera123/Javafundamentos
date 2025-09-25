package datastructure;

import java.util.Iterator;

public class ArrayTest {
	public static void main(String[] args) {
		// == operador de igualdad
		// == operador de establecer un valor a una variable
		System.out.println(1 == 1);
		int[] scores = { 12, 123569, 435 };
		int sum = scores [0] + scores [1] + scores [2] + scores [3] ;
		System.out.println("el total de escore es" + sum);
		int scoretotal = 0;
		for (int i = 0; i < scores.length; i++) {
			scoretotal = scores [i] + scoretotal;
			
			
		}
		System.out.println("el total de escore es "+ scoretotal);
		User[] clients = new User[20000]; // tiene una capaciadad de 20 mil usuarios de guardar 20 mil usuarios
		System.out.println(scores.length); // == el .length recorre cuantos numeros hya

		User[] Users = { new User(), new User() };
		User[] Clients = new User[20000];
		Clients[0] = new User("unknow,", 10, "emilianogmail10", "arribadds", "dsfds", 2, "df");
		Clients[1] = new User("unknow,", 9, "emilianogmail10", "arribadds", "dsfds", 1, "df");
		// imprimir la longitud del array
		System.out.println(scores.length);
		System.out.println(Users.length);
		System.out.println("the lenght of teh array clients" + clients.length);

		for (int j = 0; j < Clients.length; j++) {
			Clients[j] = new User("Marcos" + j, 9, "alvaro", "djnadaw", "dadw", 1, "dawd");
			System.out.println(Clients[j].getName());

		}
		boolean[] booleeans = null;
		System.out.println(booleeans.length);
		User[] users = { new User(), new User() };
		System.out.println(users.length);
		System.out.println(Users[2]);

//--Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
//--		at javafundamentals/datastructure.DataStructureTest.main(DataStructureTest.java:26)

		System.out.println(Users[2]);

	}
}
