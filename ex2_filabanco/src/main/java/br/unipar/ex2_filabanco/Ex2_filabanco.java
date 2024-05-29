/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.ex2_filabanco;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Ex2_filabanco {

    public static void main(String[] args) {
        Banco banco = new Banco();
        
        while (true){
            String opcao = JOptionPane.showInputDialog("\n1 - Adicionar Cliente"
                    + "\n2 - Chamar próximo cliente"
                    + "\n3 - Sair"
                    + "\nEscolha uma opção");
            
            if(opcao.equals("1")){
                int senha = Integer.parseInt(JOptionPane.showInputDialog(
                        "Informe a senha do cliente"));
                String nome = JOptionPane.showInputDialog("Informe o nome"
                        + "do cliente");
                int anaNascimento = Integer.parseInt(JOptionPane.showInputDialog(
                        "Informe o ano do nacimento do cliente"));
                Cliente cliente = new Cliente(senha, nome, anaNascimento);
                banco.adicionarCliente(cliente);
            }else if(opcao.equals("2")){
                banco.chamarProximo();
            }else if(opcao.equals("3")){
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Opçao"
                        + "inválida. tente novamente");
            }
            
        }
        
    }
}
