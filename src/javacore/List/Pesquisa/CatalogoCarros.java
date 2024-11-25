package javacore.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoCarros {
    // Atributo
    private List<Carro> carroList;

    public CatalogoCarros() {
        this.carroList = new ArrayList<>();
    }

    // Adicionando carros ao catalogo
    public void adicionarCarros(String nome, String marca, int anoFab){
        carroList.add(new Carro(nome,marca,anoFab));
    }

    // Pesquisando o carro pela sua marca
    public List<Carro> pesquisarPorMarca(String marca){
        List<Carro> CarroPorMarca = new ArrayList<>();
        if(!carroList.isEmpty()){
            for(Carro c : carroList){
                if(c.getMarca().equalsIgnoreCase(marca)){
                   CarroPorMarca.add(c);
                }
            }
        }
        return CarroPorMarca;
    }

    // Pesquisar carros pelo ano
    public List<Carro> pesquisarPorAno(int anoInicial, int anoFinal) {
        List<Carro> CarroPorAno = new ArrayList<>();
        if(!carroList.isEmpty()){
            for(Carro c : carroList){
                if(c.getAnoFrabricacao() >= anoInicial && c.getAnoFrabricacao() <= anoFinal){
                    CarroPorAno.add(c);
                }
            }
        }
        return CarroPorAno;
    }

    // Pesquisar carro pelo nome
    public Carro pesquisarPorNome(String nome){
        Carro CarroPorNome = null;
        if(!carroList.isEmpty()){
            for(Carro c : carroList){
                if(c.getNome().equalsIgnoreCase(nome)){
                    CarroPorNome = c;
                    break;
                }
            }
        }
        return CarroPorNome;
    }

    public static void main(String[] args) {
        CatalogoCarros c = new CatalogoCarros();
        c.adicionarCarros("Camaro","Chevrolet",2012);
        c.adicionarCarros("Gol","Wolkswagen",2015);
        c.adicionarCarros("Ford Ka","Ford",2006);
        c.adicionarCarros("BMW M3","BMW",1997);
        c.adicionarCarros("Hillux SW4 GR","Toyota",2025);
        c.adicionarCarros("Corolla Hybrid","Toyota",2022);

        System.out.println(c.pesquisarPorMarca("Toyota"));
        System.out.println(c.pesquisarPorAno(2012,2015));
        System.out.println(c.pesquisarPorNome("BMW M3"));
    }
}
