/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.ex3_pilhadelivros;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Ex3_pilhadelivros {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        while(true){
            String opcao = JOptionPane.showInputDialog("\n1 - Adicionar livro"
                    + "\n2 - Listar Livros"
                    + "\n3 - Remover Livro");
            
            if(opcao.equals("1")){
                String livro = JOptionPane.showInputDialog("Informe"
                        + "o Livro");
                biblioteca.adicionarLivro(livro);
            }else if(opcao.equals("2")){
                biblioteca.listarLivros();
            }else if(opcao.equals("3")){
                biblioteca.removerLivro();
            }else{
                JOptionPane.showMessageDialog(null, "Opção"
                        + "Inválida.");
            }
            
        }
    }
}
