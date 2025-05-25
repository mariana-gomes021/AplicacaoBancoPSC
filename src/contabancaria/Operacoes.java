package contabancaria;

import cliente.Cliente;

public class Operacoes {

    public Saque sacar(Cliente cliente, double valor) {
        double saldoAtual = cliente.getSaldo();
        double limiteAtual = cliente.getLimite();

        if (valor <= saldoAtual + limiteAtual) {
            if (valor <= saldoAtual) {
                // saldo suficiente
                cliente.setSaldo(saldoAtual - valor);
            } else {
                // usa saldo + limite
                double restante = valor - saldoAtual;
                cliente.setSaldo(0); // zera saldo
                cliente.setLimite(limiteAtual - restante); // reduz limite
            }

            Saque novoSaque = new Saque(valor);

            String descricao = String.format(
                    "Saque de R$ %.2f | Saldo: R$ %.2f | Limite: R$ %.2f",
                    valor, cliente.getSaldo(), cliente.getLimite()
            );
            cliente.adicionarTransacao(descricao, valor);

            return novoSaque;
        } else {
            System.out.println("Saldo insuficiente para saque.");
            return null;
        }
    }

    public Deposito depositar(Cliente cliente, double valor) {
        double saldoAtual = cliente.getSaldo();
        cliente.setSaldo(saldoAtual + valor);

        Deposito novoDeposito = new Deposito(valor);

        // Adiciona transação com info do saldo e limite
        String descricao = String.format("Deposito de R$ %.2f | Saldo: R$ %.2f | Limite: R$ %.2f",
                valor, cliente.getSaldo(), cliente.getLimite());
        cliente.adicionarTransacao(descricao, valor);

        return novoDeposito;
    }
}
