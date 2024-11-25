package javacore.Set.OperacoesBasicas;

import java.util.Objects;

public class Pecas {
    // Atributos
    private String nome;
    private int condigoPeca;

    public Pecas(String nome, int condigoPeca) {
        this.nome = nome;
        this.condigoPeca = condigoPeca;
    }

    public String getNome() {
        return nome;
    }

    public int getCondigoPeca() {
        return condigoPeca;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pecas pecas = (Pecas) o;
        return getCondigoPeca() == pecas.getCondigoPeca();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCondigoPeca());
    }

    @Override
    public String toString() {
        return "Pecas{" +
                "nome='" + nome + '\'' +
                ", condigoPeca=" + condigoPeca +
                '}';
    }
}
