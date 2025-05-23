package contabancaria;

import cliente.Cliente;

public class Operacoes {

    

    public Saque saque(Cliente cliente, double valor) {
        if (cliente.getSaldo() > 0) {
            if (valor > 0) {
                if (valor <= cliente.getSaldo()) {
                    Saque saque = new Saque(valor);
                    double saldoMenosValor = (cliente.getSaldo() - valor);
                    cliente.setSaldo(saldoMenosValor);
                    System.out.println("Saque feito com sucesso!");
                    return saque;
                } else {
                    System.out.println("Saldo insuficiente para saque! Seu saldo: " + cliente.getSaldo());
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
