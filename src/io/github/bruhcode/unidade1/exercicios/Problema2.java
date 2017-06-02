package io.github.bruhcode.unidade1.exercicios;

import io.github.bruhcode.algoritmo.Algoritmo;

public class Problema2 extends Algoritmo {
	
	/*
	 * Objetivo: calcule o perímetro e área de um quadrado utilizando
	 * a medida do lado informada pelo usuário.
	 * Entrada: medida do lado do quadrado.
	 * Processamento: calcular a área do quadrado, definida por A = L*L, e o perímetro,
	 * definido por A = L+L+L+L ou A = L*4.
	 * Saída: Informar a área e o perímetro para o usuário.
	 */
	public static void main(String[] args) {
		/*
		 * Algoritmo problema2
		 * Var
		 * 	lado : Real
		 * 	area : Real
		 * 	perimetro : Real
		 * Inicio
		 * 	Escreva("Informe a medida do lado do quadrado: ")
		 * 	Leia(lado)
		 * 	area = lado * lado
		 * 	perimetro = lado * 4
		 * 	Escreva("A área do quadrado é: ", area)
		 * 	Escreva("O perímetro do quadrado é: ", perimetro)
		 * Fim.
		 */
		Escreva("Informe a medida do lado do quadrado: ");
		double lado = LeiaReal();
		double area = lado * lado;
		double perimetro = lado * 4;
		Escreva("A área do quadrado é: ", area);
		Escreva("O perímetro do quadrado é: ", perimetro);

	}

}
