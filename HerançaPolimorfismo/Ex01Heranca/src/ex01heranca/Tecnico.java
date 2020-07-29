/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01heranca;

public class Tecnico extends Funcionario {
    public double bonus = 50;
    //bonus = salario + 50;
    
    @Override
    public void exibeDados(){
       System.out.println("O número da matricula é: " + matricula);
       System.out.println("O salário normal é: " + salario);
    }

    public double bonusSalarial(){
        
        System.out.println("O salário com bônus é: " + salario + bonus);
        return salario;
    }
    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
}
