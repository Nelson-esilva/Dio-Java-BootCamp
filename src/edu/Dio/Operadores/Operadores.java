package edu.Dio.Operadores;

public class Operadores {
    public static void main(String[] args) {
        //Operadores Aritmeticos
        
        double soma = 10.3 + 5.7;
        double subtracao = soma - 4.6;
        int modulo = 10 % 3;

        //Concatenação

        String concatenacao = "?";
        
        concatenacao = "O valor do calculo é " + (10-8+47);

        // Operador Unário

        int numero = 5;
        int numero2 = 0;
        int numero3 = 1;

        //incremento

        numero = numero + 2;
        numero2 = numero ++;  //incremento posterior
        numero3 = --numero2;  // incremento anterior

        /*System.out.println(numero);
        System.out.println(numero2);
        System.out.println(numero3);*/

        //Operador Ternario

        String comparacao = numero == numero2 ? "Verdadeiro" : "Falso";

        System.out.println(comparacao);

        //Operadores Relacionais

        String igual = numero == numero2 ? "Sim" : "Nao";
        String maiorIgual = numero2 >= numero3 ? "Sim" : "Nao";
        String diferente = numero != numero3 ? "Sim" : "Nao";

        /*System.out.println(igual);
        System.out.println(maiorIgual);
        System.out.println(diferente);*/

        //Comparação entre objetos

        String meuNome = new String("NelsOn");
        String nomeMeu = "Nelson";

        boolean compare = meuNome.equals(nomeMeu);

        System.out.println(compare);

        //Operadores Logicos

        boolean cond1 = false;
        boolean cond2 = true;
        String result = " ";

        if(cond1 && cond2){
            result = "Verdadeira";
        } 
        if(cond1 || cond2){
            result = "Falso";
        }

        System.out.println(result);
    }   
}
