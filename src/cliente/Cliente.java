/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

//composicao
public class Cliente {
    private Pessoa pessoa;
    private String conta;
    private String agencia;
    
    public Cliente (String nome,
                    String CPF,
                    String conta,
                    String agencia){
        
        this.pessoa = new Pessoa(nome,CPF);
        this.conta = conta;
        this.agencia = agencia;
    }
    
    public Cliente(Pessoa p, String c, String a){
        this.pessoa = p;
        this.conta = c;
        this.agencia = a;
    }
    
    public String getNome(){
        return this.pessoa.getNome();
    }
    
    public String getCPF(){
        return this.pessoa.getCPF();
    }
    
    public String getAgencia(){
        return this.agencia;
    }
    
    public String getConta(){
        return this.conta;
    } 
}

