/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.ex5_transportes;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Deposito {
    private Stack<Produto>[] pilhaProdutos = new Stack[5];
    
    public Deposito(){
        for(int i = 0; i < pilhaProdutos.length; i++){
            pilhaProdutos[i] = new Stack<>();
        }
    }
    
    public void adicionarProduto(int pilha, Produto produto){
        if(pilhaProdutos[pilha].size() < 10){
            pilhaProdutos[pilha].push(produto);
        }else{
            JOptionPane.showMessageDialog(null, "A pilha "
            +"está cheia.");
        }
    }
    
    public void listarProdutos(int pilha){
        StringBuilder produtos = new StringBuilder();
        for (Produto produto : pilhaProdutos[pilha]) {
            produtos.append(produto.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, "Produtos na pilha:\n" + produtos);
    }
    
    public void despacharProduto(int pilha){
        if(!pilhaProdutos[pilha].isEmpty()){
            Produto produto = pilhaProdutos[pilha].pop();
            JOptionPane.showMessageDialog(null, "Produto despachado "
                    + produto);
        }
    }
    
}
