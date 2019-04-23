package br.com.digitalhouse.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Exercicio01 {

    public static void main(String[] args) {

        //Exercício 1:
        //● Criar um arrayList de Strings e inicializá-lo com uma nova lista vazia.
        //● Adicionar os seguintes valores: “Pato”, “Cachorro”, “Gato”.
        //● Imprimir o conteúdo da posição 3.
        //● Executar o programa. O que acontece?
        //● Criar uma cláusula try-catch para controlar a exceção anterior. O tipo de
        //exceção e onde surgiu deverão ser impressos na tela.

        List<String> arrayAnimais = new ArrayList<>();

        arrayAnimais.add("Pato");
        arrayAnimais.add("Cachorro");
        arrayAnimais.add("Gato");

        try{
            System.out.println(arrayAnimais.get(3));
        } catch (Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }



    }

}
