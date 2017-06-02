package io.github.bruhcode.unidade1.exercicios;

import io.github.bruhcode.algoritmo.Algoritmo;

public class Problema1 extends Algoritmo {
	/*
	 * Formule um algoritmo que leia e apresente as seguintes informações
	 * de uma pessoa: nome, idade, peso, altura e telefone.
	 * Objetivo: ler e apresentar o nome, idade, peso, altura e telefone de uma pessoa.
	 * Entrada: nome da pessoa, idade, peso, altura e telefone.
	 * Processamento: não há.
	 * Saída: informar o nome, idade, peso, altura e telefone da pessoa.
	 */
	public static void main(String[] args) {
		/*
		 * Algoritmo problema1
		 * 	Var
		 * 		idade : Inteiro
		 * 		peso, altura : Real
		 * 		nome : Caractere[50]
		 * 		telefone : caractere[15]
		 * 
		 * 	Inicio
		 * 		Escreva("Informe o nome: ")
		 * 		Leia(nome)
		 * 		Escreva("Informe a idade: ")
		 * 		Leia(idade)
		 * 		Escreva("Informe o peso: ")
		 * 		Leia(peso)
		 * 		Escreva("Informe a altura: ")
		 * 		Leia(altura)
		 * 		Escreva("Informe o telefone: ")
		 * 		Leia(telefone)
		 * 		
		 * 		Escreva("O nome é: ", nome)
		 * 		Escreva("A idade é: ", idade)
		 * 		Escreva("O peso é: ", peso)
		 * 		Escreva("A altura é: ", altura)
		 * 		Escreva("O telefone é: ", telefone)
		 * 	Fim.
		 */
		
		Escreva("Informe o nome: ");
		String nome = LeiaString();
		Escreva("Informe a idade: ");
		int idade = LeiaInteiro();
		Escreva("Informe o peso: ");
		double peso = LeiaReal();
		Escreva("Informe a altura: ");
		double altura = LeiaReal();
		Escreva("Informe o telefone: ");
		String telefone = LeiaString();
		
		Escreva("O nome é: ", nome);
		Escreva("A idade é: ", idade);
		Escreva("O peso é: ", peso);
		Escreva("A altura é: ", altura);
		Escreva("O telefone é: ", telefone);

	}
}
