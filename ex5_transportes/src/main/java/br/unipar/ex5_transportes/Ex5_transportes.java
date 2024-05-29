/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.ex5_transportes;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Ex5_transportes {

    public static void main(String[] args) {
        Deposito deposito = new Deposito();

        while (true) {
            String opcao = JOptionPane.showInputDialog("\n1 - Adicionar produto"
                    + "\n2 - Listar produtos"
                    + "\n3 - Despachar produto");

            if (opcao.equals("1")) {
                int pilha = Integer.parseInt(JOptionPane.showInputDialog
                    ("Informe a pilha (0-4):"));
                
                String codProduto = JOptionPane.showInputDialog
                    ("Informe o código do produto:");
                
                String descricao = JOptionPane.showInputDialog
                    ("Informe a descrição do produto:");
                
                String dataEntrada = JOptionPane.showInputDialog
                    ("Informe a data de entrada do produto:");
                
                String ufOrigem = JOptionPane.showInputDialog
                    ("Informe a UF de origem:");
                
                String ufDestino = JOptionPane.showInputDialog
                    ("Informe a UF de destino:");
                
                Produto produto = new Produto(codProduto, descricao, dataEntrada, 
                    ufOrigem, ufDestino);
                
                    deposito.adicionarProduto(pilha, produto);
                    
            } else if (opcao.equals("2")) {
                int pilha = Integer.parseInt(JOptionPane.showInputDialog
                ("Informe a pilha (0-4):"));
                deposito.listarProdutos(pilha);
                
            } else if (opcao.equals("3")) {
                int pilha = Integer.parseInt
                (JOptionPane.showInputDialog("Informe a pilha (0-4):"));
                deposito.despacharProduto(pilha);
                
            } else {
                JOptionPane.showMessageDialog(null, 
                        "Opção inválida. Tente novamente.");
            }
        }
    }
}