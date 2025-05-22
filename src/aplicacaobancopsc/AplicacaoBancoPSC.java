/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacaobancopsc;

import cliente.Cliente;
import controlador.ControladorLogin;
import controlador.Janela1;

/**
 *
 * @author bruno
 */
public class AplicacaoBancoPSC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Janela1 j1 = new Janela1();
        Janela1 j2 = new Janela1();
        
        Cliente eu = new Cliente("bruno", "123","001","002");
        ControladorLogin clogin = new ControladorLogin(eu);
        j1.setControle(clogin);
        j2.setControle(clogin);
        
        j1.setVisible(true);
        j2.setVisible(true);
        
        
    }
    
}
