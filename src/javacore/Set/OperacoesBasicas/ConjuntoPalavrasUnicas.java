package javacore.Set.OperacoesBasicas;


import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    // Atributos
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    // Adicionando palavras a lista de palavrasUnicas
    public void adicionarPalavra(String palavra) {
        palavrasSet.add(palavra);
    }

    // Removando palavras
    public void removerPalavra(String palavra){
        if(!palavrasSet.isEmpty()){
            if(palavrasSet.contains(palavra)) {
                palavrasSet.remove(palavra);
            }else {
                System.out.println("Palavra não encontrada no conjunto");
            }
        }else{
            System.out.println("O conjunto está vazio");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
      if(!palavrasSet.isEmpty()){
          System.out.println(palavrasSet);
      }else {
          System.out.println("O conjunto está vazio");
      }
    }

    public static void main(String[] args) {
        // Criando uma instância para um conjuntoPalavrasÚnicas
        ConjuntoPalavrasUnicas c = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        c.adicionarPalavra("Java");
        c.adicionarPalavra("Python");
        c.adicionarPalavra("PhP");
        c.adicionarPalavra("JavaScript");
        c.adicionarPalavra("Python");
        c.adicionarPalavra("C++");
        c.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas do conjunto
        c.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        c.removerPalavra("Python");
        c.exibirPalavrasUnicas();

        // Removendo linguagens inexistentes
        c.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguangem 'Java' está no conjunto? " + c.verificarPalavra("Java"));
        System.out.println("A linguangem 'Python' está no conjunto? " + c.verificarPalavra("Python"));

        // Exbindo as linguagens únicas atualizadas do conjunto
        c.exibirPalavrasUnicas();
    }

}
