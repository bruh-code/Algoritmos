package io.github.bruhcode.unidade1;

import io.github.bruhcode.algoritmo.Algoritmo;

public class Variaveis extends Algoritmo {
/*
 * Quando escrevemos um algoritmo, precisamos guardar informações, e para
 * isso utilizamos as variáveis.
 * Em pseudocódigo nós declaramos as variáveis logo no início 
 * do algoritmo para já alocar a memória, mas em Java
 * tudo acontece durante a execução, e podemos inciar variáveis
 * dentro do algoritmo.
 */
	// Método de início do programa
	public static void main(String[] args) {
		/*
		 * TIPOS DE VARIÁVEIS
		 * O Java compreende muitos tipos de variáveis, mas vamos
		 * abordar somente os que nos interessam por enquanto.
		 * Veja os exemplos a seguir em pseudocódigo e em Java.
		 */
		
		/*
		 * Var
		 * idade : Inteiro
		 */
		int idade;
		
		/*
		 * Var
		 * altura : Real
		 */
		double altura;
		
		/*
		 * Var
		 * nome : Caractere[tamanho]
		 */
		String nome;
		
		/*
		 * Var
		 * ocupado : Lógico
		 */
		boolean ocupado;
		
		/*
		 * CONSTANTES
		 * As constantes só podem ser declaradas uma única vez e 
		 * não podem ser alteradas em nenhum momento durante a 
		 * execução do programa.
		 * 
		 * CONST
		 * PI = 3,14
		 */
		final double PI = 3.14;
		
	}

}
