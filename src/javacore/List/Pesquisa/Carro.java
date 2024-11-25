package javacore.List.Pesquisa;

public class Carro {
    private String nome;
    private String marca;
    private int anoFrabricacao;

    public Carro(String nome, String marca, int anoFrabricacao) {
        this.nome = nome;
        this.marca = marca;
        this.anoFrabricacao = anoFrabricacao;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnoFrabricacao() {
        return anoFrabricacao;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", anoFrabricacao=" + anoFrabricacao +
                '}';
    }
}
