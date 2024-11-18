package javacore.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Itens>listaCompras;

    public CarrinhoCompras(){
        this.listaCompras = new ArrayList<>();
    }



    // Metódo de adicionar itens a lista de compras;
    public void adicionarItem(String nome,double preco, int quantidade){
        Itens i = new Itens(nome, preco, quantidade);
        this.listaCompras.add(i);
    }

    // Metodo para remover itens da lista de compras;
    public void removerItem(String nome){
        List<Itens> itensParaRemover = new ArrayList<>();
        if(!listaCompras.isEmpty()){
            for(Itens i: listaCompras){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
            listaCompras.removeAll(itensParaRemover);
        }else{
            System.out.println("A lista está vazia");
        }
    }

    // Metodo para calcular o valor total do item;
    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!listaCompras.isEmpty()){
            for(Itens i: listaCompras){
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem; // valorTotal = valorTotal + valorItens;
            }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista está vazia.");
        }
    }

    // Exibindo itens
    public void exibirItens(){
        if(!listaCompras.isEmpty()){
            System.out.println(this.listaCompras);
        }else{
            System.out.println("A lista está vazia");
        }
    }
    @Override
    public String toString() {
        return "CarrinhoCompras{" +
                "listaCompras=" + listaCompras +
                '}';
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoCompras carrinhoDeCompras = new CarrinhoCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}



