package io.github.bruhcode.algoritmo;

import java.util.Scanner;

public abstract class Algoritmo {
	
	private static Scanner s = new Scanner(System.in);
	
	public static int LeiaInteiro() {
		return s.nextInt();
	}

	public static char LeiaCaractere() {
		return (char) s.nextByte();
	}
	
	public static String LeiaString() {
		return s.nextLine();
	}

	public static float LeiaFlutuante() {
		return s.nextFloat();
	}
	
	public static double LeiaReal() {
		return s.nextDouble();
	}
	
	public static boolean LeiaLogico() {
		return s.nextBoolean();
	}

	public static void Escreva(String string) {
		System.out.println(string);
	}
	
	public static void Escreva(Object... objetos) {
		StringBuilder sb = new StringBuilder();
		for(Object o : objetos) {
			sb.append(o);
		}
		String s = sb.toString();
		Escreva(s);
	}
	
	
}
