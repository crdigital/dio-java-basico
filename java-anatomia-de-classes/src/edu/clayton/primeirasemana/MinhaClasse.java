package edu.clayton.primeirasemana;
public class MinhaClasse {    

    // decalrações válidas de variáveis
    String meuNome = "Clayton";
    int anoDeFabricacao = 2023;
    Boolean verdadeira = true;
    double valor = 1.99;
    long numeroLogo = 1222222;

    public static void main(String[] args) throws Exception{
        final String BR = "Brasil";
        String nome = "Clayton";
        String sobrenome = "da Silva Rodrigues";
        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.println(BR); 
        System.out.println("Minha Classe");
        System.out.println(nomeCompleto);
        

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}