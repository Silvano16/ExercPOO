package com.company;

public class Produto {
    private int codProd;
    String descricao;
    double preco;
    Fornecedor fornecedor ;

    public int getCodProd(){
        return codProd;
    }

    public void setCodProd(int codProd){
        this.codProd = codProd;
    }

    void imprimirEtiqueta(){
        System.out.println("codProd = " + getCodProd());
        System.out.println("descricao = " + descricao);
        System.out.println("preco = " + preco);
        System.out.println("Fornecedor =" + fornecedor.getNome());
    }
}
