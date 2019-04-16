package com.company;

import java.util.Scanner;

public class GerenciarCompra {
    private static void exibirFornecedores(Fornecedor[] fornecedores){
        for (int i = 0; i < fornecedores.length; i++) {
            if(fornecedores[i] != null){
                fornecedores[i].imprimirFornecedor();
            }
        }
    }

    private static void exibirProdutos(Produto[] produtos){
        for (int i = 0; i < produtos.length; i++) {
            if(produtos[i] != null){
                produtos[i].imprimirEtiqueta();
            }
        }
    }

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();
        Fornecedor fornecedores[] = new Fornecedor[50];
        Produto produto = new Produto();
        Produto produtos[] = new Produto[100];
        Cesta cesta = new Cesta();
        Scanner sc = new Scanner(System.in);
        String menu = "MENU \n"
                + "1 ----- Cadastrar Fornecedor\n"
                + "2 ----- Cadastrar Produto\n"
                + "3 ----- Abrir Carrinho\n"
                + "4 ----- Fechar Carrinho\n"
                + "9 ----- Sair\n"
                + "Digite a opção desejada: ";
        int opcao = 10;
        while(opcao != 9){
            System.out.print(menu);
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    System.out.print("Digite o nome do fornecedor: ");
                    fornecedor.setNome(sc.next());
                    System.out.print("Digite o contato do fornecedor: ");
                    fornecedor.setContato(sc.next());
                    System.out.print("Digite o fone do fornecedor: ");
                    fornecedor.setTelefone(sc.next());
                    System.out.print("Digite o email do fornecedor: ");
                    fornecedor.setEmail(sc.next());
                    for (int i = 0; i < fornecedores.length; i++) {
                        if(fornecedores[i] == null){
                            fornecedor.setIdForm(i);
                            fornecedores[i] = fornecedor;
                            System.out.println("Fornecedor Cadastrado com Sucesso!");
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Digite a descricao do produto: ");
                    produto.descricao=(sc.next());
                    System.out.print("Digite o preço do produto: ");
                    produto.preco=(Double.parseDouble(sc.next()));
                    if(fornecedores[0] != null){
                        exibirFornecedores(fornecedores);
                    } else {System.out.println("Obrigatorio pelo menos um fornecedor!");
                        break;
                    }
                    System.out.print("Digite o codigo do fornecedor: ");
                    int codigoFornecedor = sc.nextInt();
                    produto.fornecedor=(fornecedores[codigoFornecedor]);
                    for (int i = 0; i < produtos.length; i++) {
                        if(produtos[i] == null){
                            produto.setCodProd(i);
                            produtos[i] = produto;
                            System.out.println("Produto Cadastrado com Sucesso!");
                            break;
                        }
                    }
                    break;
                case 3:
                    exibirProdutos(produtos);
                    System.out.print("Digite o codigo do produto: ");
                    int codigoProduto = sc.nextInt();
                    for (int i = 0; i < produtos.length; i++) {
                        if(produtos[i].getCodProd() == codigoProduto){
                            cesta.adicionarItem(produto);
                            System.out.println("Produto  na Cesta!");
                            break;
                        }
                    }
                    break;
                case 4:
                    cesta.exibeLista();
                    break;
                case 9:
                    System.out.println("SAIU");
                    break;
                default:
                    System.out.println(" Opção Inválida ");
            }
        }
    }
}
