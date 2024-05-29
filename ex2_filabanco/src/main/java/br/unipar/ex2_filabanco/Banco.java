/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.ex2_filabanco;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Banco {
    private Queue<Cliente> filaNormal = new LinkedList<>();
    private Queue<Cliente> filaPrioritaria = new LinkedList<>();
    private int contPrioritaria = 0;
    
    public void adicionarCliente(Cliente cliente){
        int idade = 2024 - cliente.anoNascimento;
        
        if(idade >= 65){
            filaPrioritaria.add(cliente);
        }else{
            filaNormal.add(cliente);
        }
    }
    
    public void chamarProximo(){
        if(!filaPrioritaria.isEmpty() && contPrioritaria < 2){
            Cliente proximo = filaPrioritaria.poll();
            JOptionPane.showMessageDialog(null, "Próximo ciente: "
                    + proximo.nome);
            contPrioritaria++;
        }else if(!filaNormal.isEmpty()){
            Cliente proximo = filaNormal.poll();
            JOptionPane.showMessageDialog(null, "Próximo cliente "
            + proximo.nome );
            contPrioritaria = 0;
        }else{
            JOptionPane.showMessageDialog(null, "Não há clientes"
                    + "na fila");
        }
    }
    
 }

