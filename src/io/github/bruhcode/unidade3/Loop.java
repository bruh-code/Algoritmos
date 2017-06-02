package io.github.bruhcode.unidade3;

import java.util.Scanner;

public class Loop {

	/*
	 * ESTRUTURAS DE REPETIÇÃO EM PSEUDOCÓDIGO E EM JAVA
	 * Quando nos deparamos em situações em que precisamos
	 * repetir um trecho de código várias vezes nós utilizamos
	 * os loops, ou estruturas de repetição.
	 * 
	 * Essas estruturas podem ser contadas ou condicionadas.
	 * Utilizamos estruturas contadas quando sabemos quantas
	 * vezes vamos repetir o trecho de código. Por exemplo, podemos
	 * calcular a tabuada de um número, imprimir os números entre 1 e 100,
	 * etc.
	 */

	// Método principal do programa
	public static void main(String[] args) {
		// Objeto scanner para ler a entrada do usuário
		Scanner s = new Scanner(System.in);
		
		 /* ESTRUTURA PARA
		 * Var valor: inteiro
		 * Para valor de 0 até 9 passo 1 faça
		 * Escreva(valor)
		 * Fim_para
		 */
		int valor;
		for(valor = 0; valor < 9; valor++) {
			System.out.println(valor);
		}
		
		/*
		 * Problema -> Tabuada de um número inteiro
		 * Objetivo: calcular a tabuada de um número inteiro
		 * Entrada: obter um número inteiro
		 * Processamento: efetuar a operação de multiplicação do número
		 * informado pelos valores entre 1 e 10
		 * Saída: imprimir a tabuada de 1 a 10 do número informado
		 * 
		 * Algoritmo tabuada
		 * Var
		 * 	num : Inteiro
		 * 	i : Inteiro
		 * Inicio
		 * 	Escreva("---- Tabuada ----")
		 * 	Escreva("Informe um número inteiro: ")
		 * 	Leia(num)
		 * 	Para i de 1 até 10 passo 1 faça
		 * 		Escreva(num, " x ", i, " = ", num * i)
		 * 	Fim_para
		 * Fim.
		 */
		int num;
		System.out.println("---- Tabuada ----");
		System.out.println("Informe um número inteiro: ");
		num = s.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}
		
		/* ESTRUTURA ENQUANTO
		 * 
		 * 
		 */
	}

}
