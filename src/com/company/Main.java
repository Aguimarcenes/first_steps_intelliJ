package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercício Calculadora");
        calculadora.soma(5,8);
        calculadora.subtracao(4,8);
        calculadora.multiplicacao(9,15);
        calculadora.divisao(6,32);

        System.out.println("Exercicio Mensagem");
        mensagem.obterMensagem(5);
        mensagem.obterMensagem(3);
        mensagem.obterMensagem(0);
        mensagem.obterMensagem(13);
        mensagem.obterMensagem(17);
        mensagem.obterMensagem(18);

        System.out.println("Exercicio Emprestimo");
        emprestimo.calcular(1000, 2);
        emprestimo.calcular(1000, 3);
        emprestimo.calcular(1000, 6);
    }
}
