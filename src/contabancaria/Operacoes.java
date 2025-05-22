/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

import cliente.Cliente;

/**
 *
 * @author bruno
 */
public class Operacoes {

    public String depositar(Cliente cliente, double valor) {
        if (valor <= 0) {
            return "Valor inválido para depósito.";
        }

        double saldoAtual = cliente.getSaldo();
        cliente.setSaldo(saldoAtual + valor);

        return "Depósito de R$" + valor + " realizado com sucesso.\n"
                + "Novo saldo: R$" + cliente.getSaldo();
    }

}
