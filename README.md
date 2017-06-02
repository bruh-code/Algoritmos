Algoritmos e Lógica de Programação
===================

Este é um projeto criado para mostrar alguns conceitos de algoritmos e lógica de programação. Os exercícios são baseados no livro Algoritmos e Lógica de Programação I escrito pela professora Me. Gislaine Camila Lapasini Leal, publicado pela UniCesumar.
Os códigos serão escritos em pseudocódigo e depois colocados em prática na linguagem Java.

Eu tomei a iniciativa de escrever algumas funções que só existem no pseudo-código também em linguagem Java, para ficar mais fácil converter os algoritmos para o pseudocódigo. Veja um exemplo de um algoritmo:

**<i class="icon-doc-text"></i> Pseudocódigo**

    Algoritmo tabuada
		 Var
		 num : Inteiro
		 i : Inteiro
		 
		 Inicio
		 Escreva("---- Tabuada ----")
		 Escreva("Informe um número inteiro: ")
		 Leia(num)
		 Para i de 1 até 10 passo 1 faça
			 Escreva(num, " x ", i, " = ", num * i)
		 Fim_para
	Fim.

**<i class="icon-code"></i> Java**

    public class Tabuada {
		public static void main(String[] args) {
		
			Escreva("---- Tabuada ----");
			Escreva("Informe um número inteiro: ");
			int num = LeiaInteiro();
			for(int i = 1; i <= 10; i++) {
				Escreva(num, " x ", i, " = ", num * i);
			}
			
		}

Como você pode ver, os métodos de **entrada** e **saída** permanecem similares aos do pseudo-código. No entanto eu não pude escrever o método (ou função) `Leia(variavel)` da mesma forma que no pseudo-código, pois em Java, os parâmetros não são passados como referência, são apenas copiados para dentro do escopo da função.

Isso significa que se outro valor for atribuído dentro da função ao parâmetro, esse valor vai permanecer em uma variável local, e não vai mudar a variável passada como parâmetro. Veja abaixo como ficaram as leituras de entrada do usuário e as declarações de cada tipo de variável.

**<i class="icon-doc-text"></i> Pseudocódigo**

    Var
    numero : Inteiro
    numero2 : Real
    caractere : Caractere
    nome : Caractere[50]
    booleana : Lógico
    
    Inicio
    Leia(numero)
    Leia(numero2)
    Leia(caractere)
    Leia(nome)
    Leia(booleana)
**<i class="icon-code"></i> Java**

    int numero = LeiaInteiro();
    double numero2 = LeiaReal();
    char caractere = LeiaCaractere();
    String nome = LeiaString(); // Strings não tem limite de tamanho
    boolean booleana = LeiaLogico();

