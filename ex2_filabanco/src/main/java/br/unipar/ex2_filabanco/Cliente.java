/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.ex2_filabanco;

/**
 *
 * @author gabri
 */
public class Cliente {
    int senha;
    String nome;
    int anoNascimento;
    
    Cliente(int senha, String nome, int anoNascimento){
        this.senha = senha;
        this.nome = nome; 
        this.anoNascimento = anoNascimento;
    }
}
