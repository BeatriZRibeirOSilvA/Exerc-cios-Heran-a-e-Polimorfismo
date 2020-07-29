/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03heranca;

public class Vip extends Ingresso {
    public double valorad;
    public double adicional;

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    

    public double getValorad() {
        return valorad;
    }

    public void setValorad(double valorad) {
        this.valorad = valorad;
    }
    
    
    public double IncluiAdicional(double valor, double valorad, double adicional){
        valor = getValor();
        valorad = valor + adicional;
        System.out.println("Com o valor adicional, o preço fica: " + getValorad());
        return valorad;
    }

   
    
    
}
