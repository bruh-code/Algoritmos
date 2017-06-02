package io.github.bruhcode.unidade1;

import io.github.bruhcode.algoritmo.Algoritmo;

/*
 * A entrada e sa�da de dados � muito importante para qualquer
 * software, j� que � a maneira pela qual o computador se
 * comunica com o usu�rio. Voc� j� deve estar familiarizado
 * com a maneira com a qual captamos dados do usu�rio.
 * Para prosseguirmos � preciso tamb�m entender a atribui��o de 
 * dados.
 */
public class EntradaSaida extends Algoritmo {
	public static void main(String[] args) {
		/*
		 * ATRIBUI��O
		 * A atribui��o consiste no processo de fornecer um valor
		 * a uma vari�vel, em que o tipo desse valor tem que ser
		 * compat�vel com a vari�vel.
		 * 
		 * Em pseudoc�digo o s�mbolo utilizado para atribui��o
		 * � =, *= ou <-. A sintaxe �:
		 * identificador <- express�o
		 */ 
		 
		/* Var
		 * idade : Inteiro
		 * Inicio
		 * idade <- 18
		 * Fim.
		 */
		int idade;
		idade = 18;
		
		/*
		 * LEITURA DE DADOS
		 * Os dados s�o lidos por meio do comando Leia. O comando Leia
		 * armazena o valor recebido pelo usu�rio em vari�veis.
		 * A sintaxe �:
		 * Leia(variavel)
		 * Ap�s digitar esse comando o computador fica "aguardando"
		 * a entrada de dados pelo usu�rio.
		 */
		
		/*
		 * Var
		 * nome : Caractere[50]
		 * Inicio
		 * Escreva("Digite o seu nome: ")
		 * Leia(nome)
		 * Escreva("Seu nome �: ", nome
		 * Fim.
		 */
		Escreva("Digite o seu nome: ");
		String nome = LeiaString();
		Escreva("Seu nome �: ", nome);
		
		/*
		 * SA�DA DE DADOS
		 * A sa�da de dados permite mostrar dados aos usu�rios. O comando
		 * Escreva � utilizado para imprimir no dispositivo de sa�da as
		 * informa��es, sendo esse a tela do computador. A sintaxe �:
		 * Escreva(variavel...)
		 * Voc� pode escrever v�rias vari�veis ou express�es de uma vez
		 * utilizando v�rgulas.
		 */
		
		/*
		 * Var
		 * telefone : Caractere[20]
		 * Inicio
		 * Escreva("Digite o seu telefone: ")
		 * Leia(telefone)
		 * Escreva("O seu telefone �: ", telefone)
		 * Fim.
		 */
		Escreva("Digite o seu telefone: ");
		String telefone = LeiaString();
		Escreva("O seu telefone �: ", telefone);
		
		
	}
}
