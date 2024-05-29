/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.ex4_transportes;

/**
 *
 * @author gabri
 */
public class Produto {
    String codProduto;
    String descricao;
    String dataEntrada;
    String ufOrigem;
    String ufDestino;

    Produto(String codProduto, String descricao, String dataEntrada, 
            String ufOrigem, String ufDestino){
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.dataEntrada = dataEntrada;
        this.ufOrigem = ufOrigem;
        this.ufDestino = ufDestino;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto{");
        sb.append("codProduto=").append(codProduto);
        sb.append(", descricao=").append(descricao);
        sb.append(", dataEntrada=").append(dataEntrada);
        sb.append(", ufOrigem=").append(ufOrigem);
        sb.append(", ufDestino=").append(ufDestino);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}

    
    
