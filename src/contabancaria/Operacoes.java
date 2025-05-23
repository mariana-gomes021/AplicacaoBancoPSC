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
            System.out.println("Valor de deposito inválido.");
            return null;
        }
    }

    public Saque saque(Cliente cliente, double valor) {
        if (cliente.getSaldo() > 0) {
            if (valor > 0) {
                if (valor <= cliente.getSaldo()) {
                    Saque saque = new Saque(valor);
                    double saldoMenosValor = (cliente.getSaldo() - valor);
                    cliente.setSaldo(saldoMenosValor);
                    System.out.println("Saque feito com sucesso!");
                    System.out.println("Saldo apos saque: " + cliente.getSaldo());
                    return saque;
                } else {
                    System.out.println("Saldo insuficiente para saque! Seu saldo: R$" + cliente.getSaldo());
                    return null;
                }
            } else {
                System.out.println("Valor de saque invalido");
                return null;
            }
        } else {
            System.out.println("Sem saldo na conta: " + cliente.getSaldo());
            return null;
        }
    }
}
