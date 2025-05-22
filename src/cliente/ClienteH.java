/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

public class ClienteH extends Pessoa{
    
    private String conta;
    private String agencia;
    
    public ClienteH(String nome,
                    String cpf,
                    String agencia,
                    String conta){
        
        super(nome, cpf);
        this.agencia = agencia;
        this.conta = conta;
    }
    
    @Override
    public String getNome(){
        return super.getNome();
    }
    
    @Override
    public String getCPF(){
        return super.getCPF();
    }
    
    public String getAgencia(){
        return this.agencia;
    }
    
    public String getConta(){
        return this.conta;
    }
}
