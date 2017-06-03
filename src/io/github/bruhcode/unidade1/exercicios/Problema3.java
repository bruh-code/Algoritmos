package io.github.bruhcode.unidade1.exercicios;

import io.github.bruhcode.algoritmo.Algoritmo;

public class Problema3 extends Algoritmo {
	/*
	 * Objetivo: apresentar o valor do sal�rio bruto, sal�rio l�quido,
	 * INSS e FGTS.
	 * Entrada: n�mero de horas, n�mero de horas extras e valor da hora trabalhada.
	 * Processamento: calcular sal�rio bruto, INSS, FGTS e sal�rio l�quido.
	 * Sa�da: informar sal�rio bruto, INSS, FGTS e sal�rio l�quido.
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
		 * 	Escreva("Informe o n�mero de horas trabalhadas: ")
		 * 	Leia(horasTrabalhadas)
		 * 	Escreva("Informe o n�mero de horas extras: ")
		 * 	Leia(horasExtras)
		 * 	Escreva("Informe o valor pago por hora: ")
		 * 	Leia(valorHora)
		 * 	salarioBruto = (horasTrabalhadas + horasExtras * (1 + (porcentagemHoraExtra / 100))) * valorHora
		 * 	inss = salarioBruto * (9/100)
		 * 	fgts = salarioBruto * (8/100)
		 * 	salarioLiquido = salarioBruto - inss
		 * 	Escreva("O sal�rio bruto �: ", salarioBruto)
		 * 	Escreva("O sal�rio l�quido �: ", salarioLiquido)
		 * 	Escreva("O INSS �: ", inss)
		 * 	Escreva("O FGTS �: ", fgts)
		 * Fim.
		 */
		final double PORCENTAGEM_HORA_EXTRA = 100;
		Escreva("Informe o n�mero de horas trabalhadas: ");
		double horasTrabalhadas = LeiaReal();
		Escreva("Informe o n�mero de horas extras: ");
		double horasExtras = LeiaReal();
		Escreva("Informe o valor pago por hora: ");
		double valorHora = LeiaReal();
		
		double salarioBruto = (horasTrabalhadas + horasExtras * (1 + (PORCENTAGEM_HORA_EXTRA / 100))) * valorHora;
		double inss = salarioBruto * 9/100;
		double fgts = salarioBruto * 8/100;
		double salarioLiquido = salarioBruto - inss;
		
		Escreva("O sal�rio bruto �: ", salarioBruto);
		Escreva("O sal�rio l�quido �: ", salarioLiquido);
		Escreva("O INSS �: ", inss);
		Escreva("O FGTS �: ", fgts);
	}
}
