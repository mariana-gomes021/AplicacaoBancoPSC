/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import cliente.*;
/**
 *
 * @author bruno
 */
public class ControladorLogin {
   
    private Cliente c; 
    
    public ControladorLogin(String nome,
            String cpf,
            String conta,
            String agencia){
        
        this.c = new Cliente(nome, cpf, conta, agencia);
        
    }

    public ControladorLogin(Cliente c){
        this.c = c;
    }
    
    public Cliente getCliente(){
        return this.c;
    }
    
    public void setCliente(Cliente c){
        this.c = c;
    }
    
    
}

