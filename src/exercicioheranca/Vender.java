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
public class Vender extends Imovel{
    private double valorVenda;
    private double comissaoVenda;

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getComissaoVenda() {
        return comissaoVenda;
    }

    public void setComissaoVenda(double comissaoVenda) {
        this.comissaoVenda = comissaoVenda;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nComissao: R$ " + getValorVenda() * getComissaoVenda() / 100;
    }
    
    
    
    
    
}
