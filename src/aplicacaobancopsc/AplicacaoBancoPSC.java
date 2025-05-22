/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacaobancopsc;

import cliente.Cliente;
import controlador.ControladorLogin;
import controlador.Janela1;
import cliente.Pessoa;
import cliente.DadosBancarios;
import contabancaria.Operacoes;
import contabancaria.Deposito;

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

        Cliente eu = new Cliente("bruno", "123", "001", "002");

        /* Realizando depósito
        Operacoes operacoes = new Operacoes();
        operacoes.depositar(eu, 150.0); // depósito de R$150,00*/
        // Realizando depósito
        Operacoes operacoes = new Operacoes();
        Deposito meuDeposito = operacoes.depositar(eu, 150.0); // depósito de R$150,00

        // Exibindo saldo e data
        System.out.println("Saldo após o depósito: R$ " + eu.getSaldo());
        if (meuDeposito != null) {
            System.out.println("Depósito de R$ " + meuDeposito.getValor()
                    + " realizado em " + meuDeposito.getDataFormatada());
        }

        ControladorLogin clogin = new ControladorLogin(eu);
        j1.setControle(clogin);
        j2.setControle(clogin);

        j1.setVisible(true);
        j2.setVisible(true);

    }

}
