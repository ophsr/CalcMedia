package com.calculadora.models;

public class Calculadora {

    // Metodo media
    public double Media(double[] val) {
        // variavel para somar os valores
        double soma = 0;
        // variavel para amarzenar tamnho do vetor
        int qntDeValores = val.length;

        // pecorre o vetor
        for (int i = 0; i < val.length; i++) {
            // O valor do vetor na posição I é somado a soma (soma = soma + val[I])
            soma += val[i];
            // Se a posição tiver valor 0 ele diminui uma casa nesta variavel
            if (val[i] == 0) {
                qntDeValores -= 1;
            }

        }
        System.out.println("Qnt de itens: " + qntDeValores);
        // retorna a soma divida pela a qnt de valores
        return soma / qntDeValores;
    }
}
