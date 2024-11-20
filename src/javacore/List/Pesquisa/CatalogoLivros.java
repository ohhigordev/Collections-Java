package javacore.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // atributo
    private List<Livro> LivroList;

    public CatalogoLivros() {
        LivroList = new ArrayList<>();
    }

    // Metodo para adicionar um novo livro
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        LivroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    // Metodo para pesquisar autor
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!LivroList.isEmpty()){ // --> isEmpty = true or false;
            for(Livro l : LivroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor; // Aqui ele retorna uma lista mesmo se ela estiver vazia;
    }

    // Pesquisar por intervalo de anos
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!LivroList.isEmpty()){
            for (Livro l : LivroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    // Pesquisar livro por titulo
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!LivroList.isEmpty()){
            for(Livro l : LivroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros c = new CatalogoLivros();
        c.adicionarLivro("Livro 01", "Autor 01", 2001);
        c.adicionarLivro("Livro 01", "Autor 01", 2002);
        c.adicionarLivro("Livro 02", "Autor 02", 2003);
        c.adicionarLivro("Livro 03", "Autor 02", 2005);
        c.adicionarLivro("Livro 04", "Autor 02", 2008);
        c.adicionarLivro("Livro 05", "Autor 03", 2001);
        c.adicionarLivro("Livro 06", "Autor 03", 2010);

        System.out.println(c.pesquisarPorAutor("Autor 02"));
        System.out.println(c.pesquisarPorIntervaloAnos(2007,2008));
        System.out.println(c.pesquisarPorTitulo("Livro 01"));
    }
}
