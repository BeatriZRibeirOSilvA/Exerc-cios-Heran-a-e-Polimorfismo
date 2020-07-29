/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01heranca;

public class Ex01Heranca {

    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.setMatricula(001);
        func.setSalario(1.500);
        func.exibeDados();
        
        System.out.println("______________________________");
        System.out.println("Assistente");
        
        Assistente assis = new Assistente();
        assis.setMatricula(002);
        assis.setSalario(1.550);
        assis.exibeDados();
        
        System.out.println("______________________________");
        System.out.println("Assistente Técnico");
        
        Tecnico tec = new Tecnico();
        tec.setMatricula(003);
        tec.setSalario(1.600);
        tec.bonusSalarial();
        tec.exibeDados();
        
        System.out.println("______________________________");
        System.out.println("Assitente Administrativo");
        
        Administrativo adm = new Administrativo();
        adm.setMatricula(004);
        adm.setSalario(1.650);
        adm.exibeDados();
        
    }
    
}
