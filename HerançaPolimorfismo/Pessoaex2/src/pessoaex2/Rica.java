/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoaex2;

/**
 *
 * @author Estudo
 */
public class Rica extends Pessoa {
    private double dinheiro;
    
    public void FazCompras (){
        System.out.println("Esta pessoa está fazendo compras!");
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
        
    }

    
    
    
    
    
}
