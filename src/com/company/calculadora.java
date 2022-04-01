package com.company;

public class calculadora {

    public static void soma(float n1, float n2){
        float resultado = n1 + n2;
        System.out.println("A soma de " + n1 + " mais " + n2 + " é: " + resultado);
    }

    public static void subtracao(float n1, float n2){
        float resultado = n1 + n2;
        System.out.println("A subtracao de " + n1 + " menos " + n2 + " é: " + resultado);
    }

    public static void multiplicacao(float n1, float n2){
        float resultado = n1 * n2;
        System.out.println("A multiplicacao de " + n1 + " vezes " + n2 + " é: " + resultado);
    }

    public static void divisao(float n1, float n2){
        float resultado = n1 / n2;
        System.out.println("A divisao de " + n1 + " divido " + n2 + " é: " + resultado);
    }

}
