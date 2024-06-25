package edu.Dio.sintaxe;

public class MinhaClasse {

    public static void main(String[] args) throws Exception {

        String primeiroNome = "Nelson";
        String segundoNome = "Emeliano";
        System.out.println(nomeCompleto(primeiroNome, segundoNome));

    }

    //primeiro exemplo de método
    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return primeiroNome.concat(" ").concat(segundoNome);

    }




}