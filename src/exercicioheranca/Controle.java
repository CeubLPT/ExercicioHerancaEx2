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
public class Controle {
    
    public static void main(String[] args) {
        
        Vender imovelVenda = new Vender();
        Cliente cliente = new Cliente();
        cliente.setNome("Zé");
        
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua A");
        endereco.setComplemento("Numero 22, apt 202");
        endereco.setTipo( new Apartamento() );
        
        imovelVenda.setCliente(cliente);
        imovelVenda.setComissaoVenda(3);
        imovelVenda.setValorVenda(500000);
        imovelVenda.setEndereco(endereco);
        
        System.out.println( imovelVenda );
        
        
        
    }
    
}
