/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioheranca;

/**
 *
 * @author Alexandre.Torres
 */
public abstract class Imovel {
    public static final int DISPONIVEL = 1;
    public static final int OCUPADO = 2;
    
    private int situacao;
    private Cliente cliente;
    private Endereco endereco;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
        

    public Imovel(){
        this.situacao = DISPONIVEL;
    }
    
    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public String toString(){
        
        return getCliente() + " " + getEndereco();
        
    }
    
    
}
