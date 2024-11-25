package javacore.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaIdades {
    // atributos
    private List<Integer> idades;

    public SomaIdades() {
        this.idades = new ArrayList<>();
    }

    // Adicionando idades
    public void adicionarIdade(int idade) {
        idades.add(idade);
    }

    // Somando idades da lista de idades
    public int somaIdades() {
        int soma = 0;
        for(Integer idade : idades) {
            soma += idade;
        }
        return soma;
    }

    // Encontrando a maior idade na lista
    public int encontrarMaiorIdade() {
        int maiorIdade = Integer.MIN_VALUE;
        if(!idades.isEmpty()) {
            for(Integer idade : idades) {
                if(idade >= maiorIdade) {
                    maiorIdade = idade;
                }
            }
            return maiorIdade;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    // Encontrando a menor idade
    public int encontrarMenorNumero() {
        int menorIdade = Integer.MAX_VALUE;
        if(!idades.isEmpty()) {
            for(Integer idade : idades) {
                if(idade <= menorIdade) {
                    menorIdade = idade;
                }
            }
            return menorIdade;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    // exibindo idades
    public void exibirIdades(){
        if(!idades.isEmpty()) {
            System.out.println(this.idades);
        }else{
            System.out.println("A lista está vazia");
        }
    }
}
