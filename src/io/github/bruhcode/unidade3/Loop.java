package io.github.bruhcode.unidade3;

import io.github.bruhcode.algoritmo.Algoritmo;

// Classe principal extende algoritmo para herdar os m�todos
// que o pseudoc�digo utiliza.
public class Loop extends Algoritmo {

	/*
	 * ESTRUTURAS DE REPETI��O EM PSEUDOC�DIGO E EM JAVA
	 * Quando nos deparamos em situa��es em que precisamos
	 * repetir um trecho de c�digo v�rias vezes n�s utilizamos
	 * os loops, ou estruturas de repeti��o.
	 * 
	 * Essas estruturas podem ser contadas ou condicionadas.
	 * 
	 * ESTRUTURAS CONTADAS
	 * Utilizamos estruturas contadas quando sabemos quantas
	 * vezes vamos repetir o trecho de c�digo. Por exemplo, podemos
	 * calcular a tabuada de um n�mero, imprimir os n�meros entre 1 e 100,
	 * etc.
	 * 
	 * ESTRUTURAS CONDICIONADAS
	 * Utilizamos estruturas condicionadas quando n�o sabemos
	 * quantas vezes vamos repetir o trecho de c�digo. Por exemplo, podemos
	 * solicitar que o usu�rio informe AT� que ele informe um n�mero entre
	 * 1 e 12. Continuamos repetindo a instru��o enquanto o usu�rio n�o 
	 * informar o n�mero corretamente.
	 */
	
	// M�todo principal do programa
	public static void main(String[] args) {
		
		/* ESTRUTURA PARA
		 * Var valor: inteiro
		 * Para valor de 0 at� 9 passo 1 fa�a
		 * Escreva(valor)
		 * Fim_para
		 */
		int valor;
		for(valor = 0; valor < 9; valor++) {
			System.out.println(valor);
		}
		
		/*
		 * Problema -> Tabuada de um n�mero inteiro
		 * Objetivo: calcular a tabuada de um n�mero inteiro
		 * Entrada: obter um n�mero inteiro
		 * Processamento: efetuar a opera��o de multiplica��o do n�mero
		 * informado pelos valores entre 1 e 10
		 * Sa�da: imprimir a tabuada de 1 a 10 do n�mero informado
		 * 
		 * Algoritmo tabuada
		 * Var
		 * 	num : Inteiro
		 * 	i : Inteiro
		 * Inicio
		 * 	Escreva("---- Tabuada ----")
		 * 	Escreva("Informe um n�mero inteiro: ")
		 * 	Leia(num)
		 * 	Para i de 1 at� 10 passo 1 fa�a
		 * 		Escreva(num, " x ", i, " = ", num * i)
		 * 	Fim_para
		 * Fim.
		 */
		Escreva("---- Tabuada ----");
		Escreva("Informe um n�mero inteiro: ");
		int num = LeiaInteiro();
		for(int i = 1; i <= 10; i++) {
			Escreva(num, " x ", i, " = ", num * i);
		}
		
		/* ESTRUTURA ENQUANTO
		 * Var x : inteiro
		 * x = 10
		 * Enquanto (x > 0) fa�a
		 * Escreva(x--)
		 * Fim_enquanto
		 */
		int x = 10;
		while(x > 0) {
			Escreva(x--);
		}
		
		
	}

}
