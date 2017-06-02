package io.github.bruhcode.unidade3;

import io.github.bruhcode.algoritmo.Algoritmo;

// Classe principal extende algoritmo para herdar os métodos
// que o pseudocódigo utiliza.
public class Loop extends Algoritmo {

	/*
	 * ESTRUTURAS DE REPETIÇÃO EM PSEUDOCÓDIGO E EM JAVA
	 * Quando nos deparamos em situações em que precisamos
	 * repetir um trecho de código várias vezes nós utilizamos
	 * os loops, ou estruturas de repetição.
	 * 
	 * Essas estruturas podem ser contadas ou condicionadas.
	 * 
	 * ESTRUTURAS CONTADAS
	 * Utilizamos estruturas contadas quando sabemos quantas
	 * vezes vamos repetir o trecho de código. Por exemplo, podemos
	 * calcular a tabuada de um número, imprimir os números entre 1 e 100,
	 * etc.
	 * 
	 * ESTRUTURAS CONDICIONADAS
	 * Utilizamos estruturas condicionadas quando não sabemos
	 * quantas vezes vamos repetir o trecho de código. Por exemplo, podemos
	 * solicitar que o usuário informe ATÉ que ele informe um número entre
	 * 1 e 12. Continuamos repetindo a instrução enquanto o usuário não 
	 * informar o número corretamente.
	 */
	
	// Método principal do programa
	public static void main(String[] args) {
		
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
		Escreva("---- Tabuada ----");
		Escreva("Informe um número inteiro: ");
		int num = LeiaInteiro();
		for(int i = 1; i <= 10; i++) {
			Escreva(num, " x ", i, " = ", num * i);
		}
		
		/* ESTRUTURA ENQUANTO
		 * Var x : inteiro
		 * x = 10
		 * Enquanto (x > 0) faça
		 * Escreva(x--)
		 * Fim_enquanto
		 */
		int x = 10;
		while(x > 0) {
			Escreva(x--);
		}
		
		
	}

}
