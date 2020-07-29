/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01heranca;

public class Funcionario {
   public double salario;
   public int matricula;

   public void exibeDados(){
       System.out.println("O número da matricula é: " + matricula);
       System.out.println("O salário é: " + salario);
   }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
   
   
    
    

   
    
    
}
