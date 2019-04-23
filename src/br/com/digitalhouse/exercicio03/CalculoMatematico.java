package br.com.digitalhouse.exercicio03;

public class CalculoMatematico {

    //Métodos
    public int divisao(int valor1, int valor2) throws ArithmeticException{

        if (valor2 == 0){
            throw new ArithmeticException("operação não pode ser realizada");
        }

        return valor1 / valor2;

/*
        try{
            return valor1 / valor2;
        } catch (ArithmeticException ex){

            System.out.println("operação não pode ser realizada");

            return 0;
        }
*/


    }

}
