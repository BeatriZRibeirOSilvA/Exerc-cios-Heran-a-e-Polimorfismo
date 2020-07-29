/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2heranca;

public class Ex2Heranca {

    public static void main(String[] args) {
       Cachorro meg = new Cachorro();
       meg.setNome("Meg");
       meg.setRaca("Poodle");
       System.out.println(meg.toString());
       meg.Late();
       meg.Caminha();
       
       Gato mingau = new Gato();
       mingau.setNome("Mingau");
       mingau.setRaca("Siamês");
       System.out.println(mingau.toString());
       mingau.Mia();
       mingau.Caminha();
       
    
       
    }
    
}
