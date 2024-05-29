/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.ex1_filadepacientes;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Ex1_filadepacientes {

    public static void main(String[] args) {
        Clinica cliente = new Clinica();
        
        while(true){
            String opcao = JOptionPane.showInputDialog("\n1 - Adicionar paciente\n2 "
                    + "- Chamar próximo paciente\n3 "
                    + "- Sair\nEscolha uma opção:");
            
            if(opcao.equals("1")){
                String nome = JOptionPane.showInputDialog("Informe o nome do "
                        + "paciente");
                cliente.adicionarPaciente(nome);
            } else if(opcao.equals("2")){
                cliente.chamarProximo();
            } else if (opcao.equals("3")){
                break;
            } else{
                JOptionPane.showConfirmDialog(null, "Opção "
                        + "inválida. Tente novamente");
            }
        }
    }
}
