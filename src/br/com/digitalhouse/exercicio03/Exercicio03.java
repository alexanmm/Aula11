package br.com.digitalhouse.exercicio03;

public class Exercicio03 {

    public static void main(String[] args) {

        //Exercício 3:
        //● Crie uma Classe CalculoMatematico
        //o Nela, crie um método divisao, que recebe como parâmetros os
        //valores a serem divididos. O retorno é o resultado da divisão (todos
        //os números devem ser do tipo inteiro);
        //● Crie uma classe de teste para testar a CalculoMatematico
        //o Nela crie um objeto CalculoMatematico e acesse o método
        //divisao, tentando dividir 4 por 0.
        //● Execute a classe e veja o que acontece;
        //● Crie um bloco try...catch no método divisão para tratar a operação
        //realizada;
        //● No catch:
        //o Informar o objeto do tipo ArithmeticException
        //o Imprimir uma mensagem informando que a operação não pode ser
        //realizada
        //o Retorna zero
        //● Tire o bloco try...catch do método divisão;
        //● Adicione throws ArithmeticException na assinatura do método;
        //● E na primeira linha do bloco do método, faça uma verificação se o divisor é
        //igual a 0:
        //o Se for, lance uma exceção throw new
        //ArithmeticException(“Texto”);
        //● Na classe de teste, crie um bloco try...catch, tentando executar o método
        //divisão;
        //o Catch para ArithmeticException
        //o No bloco do Catch, imprima o método getMessage() do objeto
        //criado do tipo ArithmeticException

        CalculoMatematico calculoMatematico = new CalculoMatematico();

        try{
            calculoMatematico.divisao(4, 0);
        } catch (ArithmeticException ex){
            System.out.println("Erro: " + ex.getMessage());
        }

    }

}
