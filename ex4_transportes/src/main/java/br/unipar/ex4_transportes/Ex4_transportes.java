/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.ex4_transportes;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Ex4_transportes {

    public static void main(String[] args) {
        Deposito deposito = new Deposito();
        
        while(true){
            String opcao = JOptionPane.showInputDialog("\n1 - Adicionar produto"
                    + "\n2 - Listar produtos"
                    + "\n3 - Despachar produto");
            
            if(opcao.equals("1")){
                String codProduto = 
                        JOptionPane.showInputDialog("Informe o código do "
                                + "produto");
                
                String descricao = 
                        JOptionPane.showInputDialog("informe a descrição "
                                + "do produto");
                
                String dataEntrada = 
                        JOptionPane.showInputDialog("Informe a data de entrada "
                                + "do produto");
                
                String ufOrigem = 
                        JOptionPane.showInputDialog("Informe o UF de "
                                + "origem");
                
                String ufDestino = 
                        JOptionPane.showInputDialog("Informe o UF de "
                                + "destino");
                
                Produto produto = new Produto(codProduto, descricao, 
                        dataEntrada, ufOrigem, ufDestino);
                deposito.adicionarProduto(produto);
            }else if(opcao.equals("2")){
                deposito.listarProdutos();
            }else if(opcao.equals("3")){
                deposito.despacharProduto();
            }else{
                JOptionPane.showMessageDialog(null, "Opção inválida. "
                        + "Tente novamente.");
            }
        }
    }
}
