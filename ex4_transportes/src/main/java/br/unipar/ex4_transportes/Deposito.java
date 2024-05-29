/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.ex4_transportes;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Deposito {
    private Stack<Produto> pilhaProdutos = new Stack<>();
    
    public void adicionarProduto(Produto produto){
        if(pilhaProdutos.size() < 10){
            pilhaProdutos.push(produto);
        }else{
            JOptionPane.showMessageDialog(null, "A pilha "
            +"está cheia.");
        }
    }
    
    public void listarProdutos(){
        JOptionPane.showMessageDialog(null, "Produtos na pilha "
                + pilhaProdutos);
    }
    
    public void despacharProduto(){
        if(!pilhaProdutos.isEmpty()){
            Produto produto = pilhaProdutos.pop();
            JOptionPane.showMessageDialog(null, "Produto despachado "
                    + produto);
        }
    }
    
}
