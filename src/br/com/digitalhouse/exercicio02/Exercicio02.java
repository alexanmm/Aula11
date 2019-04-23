package br.com.digitalhouse.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Exercicio02 {

    public static void main(String[] args) {

//Exercício 2:
//● Criar um arrayList de Strings e inicializá-lo com null.
//● Adicionar os seguintes valores: “Pato”, “Cachorro”, “Gato”.
//● Imprimir o conteúdo da posição 2.
//● Executar o programa. O que acontece?
//● Criar uma cláusula try-catch para controlar a exceção anterior. O tipo de
//exceção e onde surgiu deverão ser impressos na tela.
//● Modificar a inicialização do arrayList anterior e inicializá-lo com uma lista
//vazia.
//● Agora, imprimir o conteúdo da posição 5.
//● Executar o programa. O que acontece?
//● Criar outra cláusula catch para controlar a exceção anterior. O tipo de
//exceção e onde surgiu deverão ser impressos na tela.

        List<String> arrayAnimal = new ArrayList<>();

/*
        arrayAnimal.add("Pato");
        arrayAnimal.add("Cachorro");
        arrayAnimal.add("Gato");
*/

        try{
            //System.out.println(arrayAnimal.get(2));
            System.out.println(arrayAnimal.get(5));
        } catch (Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }


/*
        24 projeto
            26 projeto entregavel
                segunda agil
                        sexta android
*/



    }

}
