/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04heranca;

public class Velho extends Imovel {
    
    @Override
    public void ImprimePreco(double preco){
       preco = preco - (preco * 0.25);
        System.out.println("O valor do imovel mais novo com desconto é de: " + preco);
    }
    
}
