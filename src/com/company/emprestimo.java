package com.company;

public class emprestimo {

    public static double getTaxaDuasParcelas(){
        return 0.3;
    }

    public static double getTaxaTresParcelas(){
        return 0.45;
    }

    public static void calcular(double valor, int parcelas) {
        if (parcelas == 2) {
            double valorF = valor + (valor * getTaxaDuasParcelas());
            System.out.println("O valor do emprestimo para 2 parcelas será de: " + valorF);
        } else if (parcelas == 3){
            double valorF = valor + (valor * getTaxaTresParcelas());
            System.out.println("O valor do emprestimo para 3 parcelas será de: " + valorF);
        } else {
            System.out.println("Valor de Parcelas não aceito.");
        }
    }
}
