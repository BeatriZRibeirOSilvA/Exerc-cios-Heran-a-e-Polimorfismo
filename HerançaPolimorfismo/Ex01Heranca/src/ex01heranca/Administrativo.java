/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01heranca;

public class Administrativo extends Funcionario{
    public String turno;
    public double adicional;
    @Override
    public void exibeDados(){
        System.out.println("O número da matricula é: " + matricula);
       System.out.println("O salário é: " + salario);
    }
    
}
