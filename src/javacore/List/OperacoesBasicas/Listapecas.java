package javacore.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class Listapecas {
    // Atributo
    private List<Pecas> pecasList;

    public Listapecas() {
        this.pecasList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Listapecas{" +
                "pecasList=" + pecasList +
                '}';
    }

    // Criando o metodo para adicionar pecas a lista
    public void adicionarPecas(String nome, String marca, int quantidade) {
        pecasList.add(new Pecas(nome, marca, quantidade));
    }

    // Criando um metodo para remover as pecas da lista
    public void removerPecas(String nome) {
        List<Pecas> pecasParaRemover = new ArrayList<>();
        if(!pecasList.isEmpty()){
            for(Pecas p : pecasList){
                if(p.getNome().equalsIgnoreCase(nome)){
                    pecasParaRemover.add(p);
                }
            }
            pecasList.removeAll(pecasParaRemover);
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    // Criando o metodo para saber a quantidade de peças compradas
    public int obterNumeroPecas(){
        return pecasList.size();
    }

    // Metodo para obter a descrição das peças compradas
    public void obterDescricaoPecas() {
        if(!pecasList.isEmpty()){
            System.out.println(pecasList);
        }else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public static void main(String[] args) {
        // Criando uma instancia da Lista de peças
        Listapecas lp = new Listapecas();

        // Adicionando peças
        lp.adicionarPecas("Nome 01", "Marca 02", 50);
        lp.adicionarPecas("Nome 02", "Marca 01", 30);
        lp.adicionarPecas("Nome 04", "Marca 01", 7);
        lp.adicionarPecas("Nome 05", "Marca 02", 3);
        lp.adicionarPecas("Nome 02", "Marca 03", 12);
        lp.adicionarPecas("Nome 05", "Marca 03", 3);
        lp.adicionarPecas("Nome 03", "Marca 02", 1);

        System.out.println("Número de peças: " + lp.obterNumeroPecas());

        lp.removerPecas("Nome 05");
        lp.obterDescricaoPecas();

        // Após a remoção
        System.out.println("Número de peças: " + lp.obterNumeroPecas());


    }
}
