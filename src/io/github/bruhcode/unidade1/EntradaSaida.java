package io.github.bruhcode.unidade1;

import io.github.bruhcode.algoritmo.Algoritmo;

/*
 * A entrada e saída de dados é muito importante para qualquer
 * software, já que é a maneira pela qual o computador se
 * comunica com o usuário. Você já deve estar familiarizado
 * com a maneira com a qual captamos dados do usuário.
 * Para prosseguirmos é preciso também entender a atribuição de 
 * dados.
 */
public class EntradaSaida extends Algoritmo {
	public static void main(String[] args) {
		/*
		 * ATRIBUIÇÃO
		 * A atribuição consiste no processo de fornecer um valor
		 * a uma variável, em que o tipo desse valor tem que ser
		 * compatível com a variável.
		 * 
		 * Em pseudocódigo o símbolo utilizado para atribuição
		 * é =, *= ou <-. A sintaxe é:
		 * identificador <- expressão
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
		 * Os dados são lidos por meio do comando Leia. O comando Leia
		 * armazena o valor recebido pelo usuário em variáveis.
		 * A sintaxe é:
		 * Leia(variavel)
		 * Após digitar esse comando o computador fica "aguardando"
		 * a entrada de dados pelo usuário.
		 */
		
		/*
		 * Var
		 * nome : Caractere[50]
		 * Inicio
		 * Escreva("Digite o seu nome: ")
		 * Leia(nome)
		 * Escreva("Seu nome é: ", nome
		 * Fim.
		 */
		Escreva("Digite o seu nome: ");
		String nome = LeiaString();
		Escreva("Seu nome é: ", nome);
		
		/*
		 * SAÍDA DE DADOS
		 * A saída de dados permite mostrar dados aos usuários. O comando
		 * Escreva é utilizado para imprimir no dispositivo de saída as
		 * informações, sendo esse a tela do computador. A sintaxe é:
		 * Escreva(variavel...)
		 * Você pode escrever várias variáveis ou expressões de uma vez
		 * utilizando vírgulas.
		 */
		
		/*
		 * Var
		 * telefone : Caractere[20]
		 * Inicio
		 * Escreva("Digite o seu telefone: ")
		 * Leia(telefone)
		 * Escreva("O seu telefone é: ", telefone)
		 * Fim.
		 */
		Escreva("Digite o seu telefone: ");
		String telefone = LeiaString();
		Escreva("O seu telefone é: ", telefone);
		
		
	}
}
