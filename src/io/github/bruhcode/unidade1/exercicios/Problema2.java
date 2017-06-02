package io.github.bruhcode.unidade1.exercicios;

import io.github.bruhcode.algoritmo.Algoritmo;

public class Problema2 extends Algoritmo {
	
	/*
	 * Objetivo: calcule o per�metro e �rea de um quadrado utilizando
	 * a medida do lado informada pelo usu�rio.
	 * Entrada: medida do lado do quadrado.
	 * Processamento: calcular a �rea do quadrado, definida por A = L*L, e o per�metro,
	 * definido por A = L+L+L+L ou A = L*4.
	 * Sa�da: Informar a �rea e o per�metro para o usu�rio.
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
		 * 	Escreva("A �rea do quadrado �: ", area)
		 * 	Escreva("O per�metro do quadrado �: ", perimetro)
		 * Fim.
		 */
		Escreva("Informe a medida do lado do quadrado: ");
		double lado = LeiaReal();
		double area = lado * lado;
		double perimetro = lado * 4;
		Escreva("A �rea do quadrado �: ", area);
		Escreva("O per�metro do quadrado �: ", perimetro);

	}

}
