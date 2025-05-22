/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

/**
 *
 * @author bruno
 */
public class Pessoa {
    private String nome;
    private String cpf;
    
    public Pessoa(String nome, String CPF){
        this.nome = nome;
        this.cpf = CPF;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCPF(){
        return this.cpf;
    }
    
    
    
}
