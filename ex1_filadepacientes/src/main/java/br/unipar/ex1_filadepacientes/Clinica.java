/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.ex1_filadepacientes;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class Clinica {
    private Queue<String> fila = new LinkedList();
    
    public void adicionarPaciente(String nome) {
        if (fila.size() < 20) {
            fila.add(nome);
        } else {
            JOptionPane.showMessageDialog(null, "A fila está cheia para hoje.");
        }
    }
    
    public void chamarProximo(){
        if(!fila.isEmpty()){
            String proximo = fila.poll();
            JOptionPane.showMessageDialog(null, "Proxímo paciente: "
            + proximo);
        }else{
            JOptionPane.showMessageDialog(null, "não há pacientes na fila");
        }
    }
}
