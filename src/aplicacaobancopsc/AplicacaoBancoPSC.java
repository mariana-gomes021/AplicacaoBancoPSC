/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacaobancopsc;

import cliente.Cliente;
import controlador.ControladorLogin;
import controlador.Janela1;
import contabancaria.Deposito;
import contabancaria.Saque;
import contabancaria.Operacoes;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AplicacaoBancoPSC {

    public static void main(String[] args) {

        // Criando janelas e clientes
        Janela1 j1 = new Janela1();
        Janela1 j2 = new Janela1();

        Cliente bruno = new Cliente("Bruno", "123", "001", "002");
        Cliente maria = new Cliente("Maria", "456", "001", "003");

        //limite
        bruno.setLimite(1000.0);
        maria.setLimite(750.0);

        // Operações bancárias
        Operacoes operacoes = new Operacoes();

        System.out.println("--------------- DEPOSITO ---------------");
        Deposito depositoBruno = operacoes.depositar(bruno, 500.0);

        if (depositoBruno != null) {
            System.out.println("Deposito de R$ " + depositoBruno.getValor()
                    + " realizado em " + formatarData(depositoBruno.getData()));
            System.out.println("Saldo atual de Bruno: R$ " + bruno.getSaldo());
        }

        System.out.println("\n--------------- SAQUE ---------------");
        Saque saqueMaria = operacoes.sacar(maria, 150.0);

        if (saqueMaria != null) {
            System.out.println("Saque de R$ " + saqueMaria.getValor()
                    + " realizado em " + formatarData(saqueMaria.getData()));
            System.out.println("Saldo atual de Maria: R$ " + maria.getSaldo());
        }

        System.out.println("\n--------------- EXTRATO DE BRUNO ---------------");
        bruno.imprimirExtrato();

        System.out.println("\n--------------- EXTRATO DE MARIA ---------------");
        maria.imprimirExtrato();

        // Controle de login
        ControladorLogin clogin = new ControladorLogin(bruno);
        j1.setControle(clogin);
        j2.setControle(clogin);

        j1.setVisible(true);
        j2.setVisible(true);
    }

    public static String formatarData(LocalDateTime data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return data.format(formatter);
    }
}
