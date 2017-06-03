package io.github.bruhcode.unidade1.exercicios;

import io.github.bruhcode.algoritmo.Algoritmo;

public class Problema3 extends Algoritmo {
	/*
	 * Objetivo: apresentar o valor do salário bruto, salário líquido,
	 * INSS e FGTS.
	 * Entrada: número de horas, número de horas extras e valor da hora trabalhada.
	 * Processamento: calcular salário bruto, INSS, FGTS e salário líquido.
	 * Saída: informar salário bruto, INSS, FGTS e salário líquido.
	 */
	public static void main(String[] args) {
		/*
		 * Algoritmo salario
		 * Var
		 * 	horasTrabalhadas, horasExtras, valorHora, salarioBruto,
		 * 	inss, fgts, salarioLiquido : Real
		 * Const
		 * 	porcentagemHoraExtra = 100
		 * Inicio
		 * 	Escreva("Informe o número de horas trabalhadas: ")
		 * 	Leia(horasTrabalhadas)
		 * 	Escreva("Informe o número de horas extras: ")
		 * 	Leia(horasExtras)
		 * 	Escreva("Informe o valor pago por hora: ")
		 * 	Leia(valorHora)
		 * 	salarioBruto = (horasTrabalhadas + horasExtras * (1 + (porcentagemHoraExtra / 100))) * valorHora
		 * 	inss = salarioBruto * (9/100)
		 * 	fgts = salarioBruto * (8/100)
		 * 	salarioLiquido = salarioBruto - inss
		 * 	Escreva("O salário bruto é: ", salarioBruto)
		 * 	Escreva("O salário líquido é: ", salarioLiquido)
		 * 	Escreva("O INSS é: ", inss)
		 * 	Escreva("O FGTS é: ", fgts)
		 * Fim.
		 */
		final double PORCENTAGEM_HORA_EXTRA = 100;
		Escreva("Informe o número de horas trabalhadas: ");
		double horasTrabalhadas = LeiaReal();
		Escreva("Informe o número de horas extras: ");
		double horasExtras = LeiaReal();
		Escreva("Informe o valor pago por hora: ");
		double valorHora = LeiaReal();
		
		double salarioBruto = (horasTrabalhadas + horasExtras * (1 + (PORCENTAGEM_HORA_EXTRA / 100))) * valorHora;
		double inss = salarioBruto * 9/100;
		double fgts = salarioBruto * 8/100;
		double salarioLiquido = salarioBruto - inss;
		
		Escreva("O salário bruto é: ", salarioBruto);
		Escreva("O salário líquido é: ", salarioLiquido);
		Escreva("O INSS é: ", inss);
		Escreva("O FGTS é: ", fgts);
	}
}
