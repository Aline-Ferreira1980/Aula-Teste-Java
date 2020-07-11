package com.teste;

public class CalculadoraNova {
    public int somar(int ...valores){
        int soma = 0;
        for (int valor: valores){
            soma = soma+valor;
        }
        return soma;
    }
}
