/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03heranca;

public class Ingresso {
    public double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
   public double ImprimeValor(double valor){
       System.out.println("O valor do ingresso é de: " + getValor());
        return valor;
       
   }

    @Override
    public String toString() {
        return "Ingresso{" + "valor=" + valor + '}';
    }
   
   
}
