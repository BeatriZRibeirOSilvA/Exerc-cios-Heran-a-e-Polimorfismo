/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoaex2;

/**
 *
 * @author Estudo
 */
public class Pessoaex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rica dados = new Rica();
        dados.setNome("Tereza Cristina");
        dados.setIdade(46);
        System.out.println(dados.toString());
        dados.setDinheiro(1000000);
        dados.FazCompras();
        
        System.out.println("________________________________");
        
        Pobre p = new Pobre();
        p.setNome("Juliana");
        p.setIdade(25);
        System.out.println(p.toString());
        p.Trabalha();
        
        System.out.println("________________________________");
        
        Miseravel m = new Miseravel();
        m.setNome("Isabel");
        m.setIdade(38);
        System.out.println(m.toString());
        m.Mendiga();
        
        
    }
    
}
