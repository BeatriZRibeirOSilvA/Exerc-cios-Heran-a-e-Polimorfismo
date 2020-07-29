/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04heranca;

import java.util.Scanner;

public class Ex04Heranca {

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite 1 para ver o imovel Novo e 2 para o Imovel Velho: ");
        int num = dados.nextInt();
        
        if(num == 1){
           Novo casaNova = new Novo();
        casaNova.setEndereco("Rua das Flores");
        casaNova.setPreco(150.00);
        casaNova.ImprimePreco(casaNova.getPreco()); 
        }else{
            Velho casaVelha = new Velho();
        casaVelha.setEndereco("Rua das Flores");
        casaVelha.setPreco(150.00);
        casaVelha.ImprimePreco(casaVelha.getPreco()); 
        }
        
        Imovel casa = new Imovel();
        casa.setEndereco("Rua Monte Castelo");
        casa.setPreco(150.000);
        casa.ImprimePreco(casa.getPreco());
        
        
        
       
    }
    
}
