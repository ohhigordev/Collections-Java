package javacore.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // Atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "ListaTarefa{" +
                "tarefaList=" + tarefaList +
                '}';
    }

    // Metodo para adicionar tarefa;
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    // Metodo para remover tarefa;
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if(!tarefaList.isEmpty()){
            for(Tarefa t : tarefaList){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasParaRemover.add(t);
                }
            }
            tarefaList.removeAll(tarefasParaRemover);
        }else {
            System.out.println("A lista está vazia");
        }
    }

    // Método para obter o número de tarefas;
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    // Método para a descrição de tarefas;
    public void obterDescricaoTarefas(){
        if(!tarefaList.isEmpty()){
            System.out.println(tarefaList);
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instancia da classe ListaDeTarefas;
        ListaTarefa l = new ListaTarefa();

        // Adicionando tarefas a lista;
        l.adicionarTarefa("Comprar leite");
        l.adicionarTarefa("Estudar para o exame");
        l.adicionarTarefa("Fazer exercicios");

        // Exibindo o numero total de tarefas na lista;
        System.out.println("Você tem " + l.obterNumeroTotalTarefas() + " tarefas na lista.\n");


        System.out.println("Removendo a tarefa 'trabalhar'");
        // Removendo tarefas da lista;
        l.removerTarefa("Comprar leite");

        // Exibindo o número total de tarefas na lista apos a remoção;
        System.out.println("Você tem " + l.obterNumeroTotalTarefas() + " tarefas na lista.");




    }


}


