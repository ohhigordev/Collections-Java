package javacore.List.OperacoesBasicas;

public class Pecas {
    private String nome;
    private String marca;
    private int quantidade;

    public Pecas(String nome, String marca, int quantidade) {
        this.nome = nome;
        this.marca = marca;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Pecas{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
