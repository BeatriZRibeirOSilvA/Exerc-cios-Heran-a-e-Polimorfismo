/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2heranca;

public class Cachorro extends Animal{
    public void Late(){
        System.out.println("Au au au!");
    }
    
    @Override
    public void Caminha(){
        System.out.println("O cachorro está caminhando!"); 
    }
    
    
}
