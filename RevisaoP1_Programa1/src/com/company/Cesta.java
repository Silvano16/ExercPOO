package com.company;

public class Cesta {
    private Produto[] itens = new Produto[50];
    public void adicionarItem(Produto produto){
        for (int i = 0; i < itens.length; i++) {
            if(itens[i] == null){
                itens[i] = produto;
                break;
            }
        }
    }

    public void exibeLista(){
        for(Produto item : itens){
            if(item != null){
                item.imprimirEtiqueta();
            }
        }
        calcularTotal();
    }

    public void calcularTotal(){
        double total = 0;
        for(Produto item : itens){
            if(item != null){
                total += item.preco;
            }
        }

        System.out.println("O preço total dos itens é: " + total);
    }
}