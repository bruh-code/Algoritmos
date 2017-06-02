package io.github.bruhcode.unidade1;

import io.github.bruhcode.algoritmo.Algoritmo;

public class Expressoes extends Algoritmo {
	/*
	 * EXPRESS�ES
	 * As express�es s�o as opera��es matem�ticas que
	 * podemos realizar com as vari�veis. Existem quatro tipos
	 * de express�es: aritm�ticas, relacionais, l�gicas e literais.
	 */
	
	public static void main(String[] args) {
		/*
		 * ARITM�TICAS
		 * As express�es aritm�ticas s�o aquelas em que o resultado
		 * consiste em um valor num�rico. Portanto, somente tipos num�ricos
		 * e operadores aritm�ticos podem ser usados neste tipo.
		 */
		
		/*
		 * SOMA -> +
		 * 
		 * Var
		 * soma : Inteiro
		 * Inicio
		 * soma = 5 + 5
		 * Escreva(soma)
		 * Fim.
		 */
		int soma;
		soma = 5 + 5; // 10
		Escreva(soma);
		
		/*
		 * SUBTRA��O -> -
		 * 
		 * Var
		 * subtracao : Inteiro
		 * Inicio
		 * subtracao = 20 - 5
		 * Escreva(subtracao)
		 * Fim.
		 */
		int subtracao;
		subtracao = 20 - 5; // 15
		Escreva(subtracao);
		
		/*
		 * MULTIPLICA��O -> *
		 * 
		 * Var
		 * multiplicacao : Inteiro
		 * Inicio
		 * multiplicacao = 10 * 5
		 * Escreva(multiplicacao)
		 * Fim.
		 */
		int multiplicacao;
		multiplicacao = 10 * 5; // 50
		Escreva(multiplicacao);
		
		/*
		 * DIVIS�O -> /
		 * 
		 * Var
		 * divisao : Inteiro
		 * Inicio
		 * divisao = 10 * 5
		 * Escreva(divisao)
		 * Fim.
		 */
		int divisao;
		divisao = 100 / 4; // 25
		Escreva(divisao);
		
		/*
		 * EXPONENCIA��O
		 * 
		 * Var
		 * expo : Real
		 * Inicio
		 * expo = 5 ** 3
		 * Escreva(expo)
		 * Fim.
		 */
		double expo;
		expo = Math.pow(5, 3); // 125
		Escreva(expo);
		
		/*
		 * RESTO
		 * 
		 * Var
		 * resto : inteiro
		 * Inicio
		 * resto = 5 mod 3
		 * Escreva(resto)
		 * Fim.
		 */
		int resto;
		resto = 5 % 3; // 2
		Escreva(resto);
		
		/*
		 * RELACIONAIS
		 * As express�es relacionais referem-se � compara��o entre
		 * dois valores de um tipo b�sico. Os operadores relacionais
		 * sempre retornam um valor do tipo l�gico, ou seja, verdadeiro
		 * ou falso.
		 */
		
		/*
		 * Opera��o	     Operador Significado
		 * Igual            =       A = 1
		 * Diferente        <>      A <> B
		 * Maior            >       A > B
		 * Menor que        <       A < B
		 * Maior ou igual   >=      A >= B
		 * Menor ou igual   <=      A <= B
		 */
		
		/*
		 * Var
		 * x : inteiro
		 * y : inteiro
		 * resultado : Logico
		 * 
		 * Inicio
		 * x = 10
		 * y = 11
		 * 
		 * resultado = x = y
		 * Escreva(resultado)
		 * 
		 * resultado = x <> y
		 * Escreva(resultado)
		 * 
		 * resultado = x > y
		 * Escreva(resultado)
		 * 
		 * resultado = x < y
		 * Escreva(resultado)
		 * 
		 * resultado = x >= y
		 * Escreva(resultado)
		 * 
		 * resultado = x <= y
		 * Escreva(resultado)
		 * 
		 * Fim.
		 */
		
		int x = 10;
		int y = 11;
		boolean resultado;
		
		resultado = x == y; // X � igual a Y ?
		Escreva(resultado); // Falso

		resultado = x != y; // X � diferente de Y ?
		Escreva(resultado); // Verdadeiro
		
		resultado = x > y; // X � maior que Y ?
		Escreva(resultado); // Falso
		
		resultado = x < y; // X � menor que Y ?
		Escreva(resultado); // Verdadeiro
		
		resultado = x >= y; // X � maior ou igual a Y ?
		Escreva(resultado); // Falso

		resultado = x <= y; // X � menor ou igual a Y ?
		Escreva(resultado); // Verdadeiro
		

	}
}
