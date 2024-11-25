package javacore.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    // Atributo

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for( Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break; // Convidado achado paramos o loop 'FOR';
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado cc = new ConjuntoConvidado();
        System.out.println("Existem " + cc.contarConvidados() + " convidado(s) dentro do set de Convidados.");

        cc.adicionarConvidado("Convidado 1",1234);
        cc.adicionarConvidado("Convidado 2",1334);
        cc.adicionarConvidado("Convidado 3",1334);
        cc.adicionarConvidado("Convidado 4",2236);
        cc.adicionarConvidado("Convidado 5",1232);

        cc.exibirConvidados();

        System.out.println("Existem " + cc.contarConvidados() + " convidado(s) dentro do set de Convidados.");

        cc.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + cc.contarConvidados() + " convidados dentro do set de Convidados");

        cc.exibirConvidados();

    }
}
