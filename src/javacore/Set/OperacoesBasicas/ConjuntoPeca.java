package javacore.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPeca {

    // Atributo
    private Set<Pecas> pecasSet;

    public ConjuntoPeca() {
        this.pecasSet = new HashSet<>();
    }

    // Adicionando pecas
    public void adicionarPecas(String nome, int condigoPeca) {
        pecasSet.add(new Pecas(nome, condigoPeca));
    }

    // Removendo pecas pelo seu código
    public void removerPecasPorCodigo(int codigoPeca) {
       Pecas pecasParaRemover = null;
       for(Pecas p : pecasSet) {
           if(p.getCondigoPeca() == codigoPeca) {
               pecasParaRemover = p;
               break; // Peça encontrada para o loop 'FOR';
           }
       }
       pecasSet.remove(pecasParaRemover);
    }

    // Contando as peças
    public int contandoPecas() {
        return pecasSet.size();
    }

    // Exibindo as peças
    public void exibirPecas() {
        System.out.println(pecasSet);
    }

    // Testando os métodos
    public static void main(String[] args) {
        ConjuntoPeca cp = new ConjuntoPeca();
        System.out.println("Exitem " + cp.contandoPecas() + " peça(s) ao todo na loja.");

        cp.adicionarPecas("Peça 01", 1223);
        cp.adicionarPecas("Peça 02", 1223);
        cp.adicionarPecas("Peça 03", 1423);
        cp.adicionarPecas("Peça 04", 12453);
        cp.adicionarPecas("Peça 05", 12323);

        cp.exibirPecas();
        System.out.println("Exitem " + cp.contandoPecas() + " peça(s) ao todo na loja.");

        cp.removerPecasPorCodigo(1223);
        System.out.println("Exitem " + cp.contandoPecas() + " peça(s) ao todo na loja.");

        cp.exibirPecas();

    }
}
