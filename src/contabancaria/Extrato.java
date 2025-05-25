/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package contabancaria;

import java.util.ArrayList;
import java.util.List;

public class Extrato {

    private List<Transacao> transacoes;

    public Extrato() {
        this.transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(String tipo, double valor) {
        Transacao nova = new Transacao(tipo, valor);
        transacoes.add(nova);
    }

    public void imprimirExtrato() {
        System.out.println("===== Extrato Bancario =====");
        if (transacoes.isEmpty()) {
            System.out.println("Nenhuma transação registrada.");
        } else {
            for (Transacao t : transacoes) {
                System.out.println(t);
            }
        }
        System.out.println("============================");
    }
    
    public List<Transacao> getTransacoes(){
        return transacoes;
    
    }
    
}
 