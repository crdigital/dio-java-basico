package edu.clayton.primeirasemana;

public class TiposVariaveis {    

    public static void main(String[] args) {
        double salarioMinino = 2500;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal;
        int numero = 5;
        numero = 10;

        System.out.println(numero);

        // a palavra reservada 'fimal' impede que o valor seja alerado
        // passando assim a variavel com comportamento de constante
        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 5.14;

        System.out.println(VALOR_DE_PI);


    }
}
