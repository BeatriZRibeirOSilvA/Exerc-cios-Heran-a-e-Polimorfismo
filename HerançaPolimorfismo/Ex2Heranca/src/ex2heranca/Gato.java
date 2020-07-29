/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2heranca;

public class Gato extends Animal{
    public void Mia(){
        System.out.println("Meow!");
    }
    
    @Override
    public void Caminha (){
        System.out.println("O gato está caminhando!"); 
    }
    
}
