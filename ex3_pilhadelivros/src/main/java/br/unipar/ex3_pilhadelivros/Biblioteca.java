/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.ex3_pilhadelivros;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Biblioteca {
    private Stack<String> pilhaLivros = new Stack<>();
    
    public void adicionarLivro(String livro){
        pilhaLivros.push(livro);
    }
    
    public void listarLivros(){
        JOptionPane.showMessageDialog(null, "Livro na pilha"+
                pilhaLivros);
    }
    
    public void removerLivro(){
        if(!pilhaLivros.isEmpty()){
            String livro = pilhaLivros.pop();
            JOptionPane.showMessageDialog(null, "Livro removido "
            + livro);
        }else{
            JOptionPane.showMessageDialog(null, "Não há "
                    + "livros há remover");
        }
    }
}
