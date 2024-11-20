package javacore.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaCompras {

    // Atributo
    private List<Compras> comprasList;

    public ListaCompras() {
        this.comprasList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "ListaCompras{" +
                "comprasList=" + comprasList +
                '}';
    }

    // Metodo para adicionar a lsita de compras
    public void adicionarCompras(String descricao){
        comprasList.add(new Compras(descricao));
    }

    // Metodo para remover compras da lista
    public void removerCompras(String descricao){
        List<Compras> comprasParaRemover = new ArrayList<>();
        if(!comprasList.isEmpty()) {
            for(Compras c : comprasList) {
                if(c.getDescricao().equalsIgnoreCase(descricao)) {
                    comprasParaRemover.add(c);
                }
            }
            comprasList.removeAll(comprasParaRemover);
        }else{
            System.out.println("A lista está vazia");
        }
    }

    // Metodo para obter o numero de compras
    public int obterNumeroCompras(){
        return comprasList.size();
    }

    // Obter a descrição das compras
    public void obterDescricaoCompras(){
        if(!comprasList.isEmpty()) {
            System.out.println(comprasList);
        }else {
            System.out.println("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        // Criando uma instancia da classe ListaCompras
        ListaCompras lc = new ListaCompras();

        // Adicionando tarefas
        lc.adicionarCompras("Feijão");
        lc.adicionarCompras("Arroz");
        lc.adicionarCompras("Carne");
        lc.adicionarCompras("Pasta de dente");

        // Exibindo o numero de compras a fazer
        System.out.println("Você tem " + lc.obterNumeroCompras() + " a fazer no super mercado!");

        // Removendo compras da lista
        lc.removerCompras("Arroz");

        // Imprimindo lista de compras após a remoção
        System.out.println("Você tem " + lc.obterNumeroCompras() + " a fazer no super mercado!");

        System.out.println(lc.obterNumeroCompras());
    }
}
