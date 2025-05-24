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
import contabancaria.Saque;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        System.out.println("---------------------------------");
        System.out.println("Deposito");
        // Realizando depósito
        Operacoes operacoes = new Operacoes();
        //Deposito meuDeposito = operacoes.depositar(eu, 150.0); // depósito de R$150,00

        // Exibindo saldo e data
        System.out.println("Saldo após o depósito: R$ " + eu.getSaldo());
//        if (meuDeposito != null) {
////            System.out.println("Depósito de R$ " + meuDeposito.getValor();
////                    + " realizado em " + meuDeposito.getDataFormatada());
//            System.out.println("Depósito de R$ " + meuDeposito.getValor()
//                    + " realizado em " + getDataFormatada(meuDeposito.getData()));
//        };

        System.out.println("Saldo apos o deposito: R$ " + eu.getSaldo());
        
        System.out.println("---------------------------------");
        System.out.println("Saque");

        Cliente eu2 = new Cliente("maria", "12345", "001", "002");

        //Deposito meuDeposito2 = operacoes.depositar(eu2, 500);
        Saque meuSaque = operacoes.saque(eu2, 30);

        if (meuSaque != null) {
            System.out.println("Saque de R$ " + meuSaque.getValor()
                    + " realizado em " + getDataFormatada(meuSaque.getData()));
            System.out.println("Saldo apos o saque: R$ " + eu2.getSaldo());
        }
        
//
        ControladorLogin clogin = new ControladorLogin(eu);;;
        j1.setControle(clogin);
        j2.setControle(clogin);

        j1.setVisible(true);;
        j2.setVisible(true);
    }

    public static String getDataFormatada(LocalDateTime data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return data.format(formatter);
    }
}
