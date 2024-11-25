package javacore.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ManipulandoHashSet {
    public static void main(String[] args) {
        // Criando um HashSet para armazenar números interios
        Set<Integer> numeros = new HashSet<>();

        // Adicionando números de 1 a 10 no conjunto
        for(int i = 1; i <= 10 ; i++) {
            numeros.add(i);
        }

        // Imprimindo todos os números do conjunto
        System.out.println("Conjunto inicial: " + numeros);

        // Removendo números pares do conjunto
        numeros.removeIf(num -> num % 2 == 0);
        System.out.println("Conjunto após a remoção dos números pares: " + numeros);

        // Verificando se o número 5 ainda está presente no conjunto
        boolean contemCinco = numeros.contains(5);
        System.out.println("O conjunto contém o número 5? " + numeros.size());
    }
}
