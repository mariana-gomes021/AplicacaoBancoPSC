/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

import cliente.Cliente;

public class Operacoes {

    public Deposito depositar(Cliente cliente, double valor) {
        if (valor > 0) {
            cliente.setSaldo(cliente.getSaldo() + valor);
            Deposito deposito = new Deposito(valor);
            // Aqui você poderia adicionar esse depósito numa lista se quisesse
            return deposito;
        } else {
            System.out.println("Valor de depósito inválido.");
            return null;
        }
    }
}