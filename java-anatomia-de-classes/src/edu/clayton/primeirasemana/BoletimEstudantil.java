package edu.clayton.primeirasemana;
public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 7;

        // identação
        if(mediaFinal < 6)
            System.out.println("Reprovado!");
        else if(mediaFinal == 6)
            System.out.println("Prova minerva!");
        else
            System.out.println("Aprovado!");
         
    }
}
