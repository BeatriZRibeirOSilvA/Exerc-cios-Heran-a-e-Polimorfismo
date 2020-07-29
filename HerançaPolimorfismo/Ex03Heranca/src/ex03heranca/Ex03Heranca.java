/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03heranca;

public class Ex03Heranca {

    public static void main(String[] args) {
        Ingresso ing = new Ingresso();
        ing.setValor(35);
        ing.ImprimeValor(ing.getValor());
        System.out.println(ing.toString());
        
        Vip vip = new Vip();
        vip.setAdicional(15);
        vip.IncluiAdicional(vip.getValor(), vip.getValorad(), vip.getAdicional());
        
        Normal norm = new Normal();
        norm.getValor();
        norm.IngressoNormal();
        
                
    }
    
}
