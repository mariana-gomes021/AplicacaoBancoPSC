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
    if (valor <= 0) {
        System.out.println("Valor de saque inválido.");
        return null;
    }

    double saldoDisponivel = cliente.getSaldo() + cliente.getLimite();

    if (valor <= saldoDisponivel) {
        Saque saque = new Saque(valor);
        cliente.setSaldo(cliente.getSaldo() - valor); // saldo pode ficar negativo
        System.out.println("Saque feito com sucesso!");
        System.out.println("Saldo após saque: " + cliente.getSaldo());
        return saque;
    } else {
        System.out.println("Saldo + limite insuficientes para saque! Saldo disponível: R$" + saldoDisponivel);
        return null;
    }
}
}
