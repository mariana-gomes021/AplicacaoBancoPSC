/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

import contabancaria.Extrato;

public class Cliente {

    private Pessoa pessoa;
    private String conta;
    private String agencia;
    private DadosBancarios dados;
    private double limite = 500;
    private Extrato extrato; // 🌟 Adicionando extrato

    public Cliente(String nome,
            String CPF,
            String conta,
            String agencia) {

        this.pessoa = new Pessoa(nome, CPF);
        this.dados = new DadosBancarios(agencia, conta, 0.0);
        this.extrato = new Extrato(); // Instanciando extrato
    }

    public Cliente(Pessoa p, String c, String a, DadosBancarios dados) {
        this.pessoa = p;
        this.conta = c;
        this.agencia = a;
        this.dados = dados;
        this.extrato = new Extrato();
    }

    public String getNome() {
        return this.pessoa.getNome();
    }

    public String getCPF() {
        return this.pessoa.getCPF();
    }

    public String getAgencia() {
        return this.dados.getAgencia();
    }

    public String getConta() {
        return this.dados.getConta();
    }

    public double getSaldo() {
        return this.dados.getSaldo();
    }

    public void setSaldo(double novoSaldo) {
        this.dados.setSaldo(novoSaldo);
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    

    // Métodos do extrato:
    public void adicionarTransacao(String tipo, double valor) {
        extrato.adicionarTransacao(tipo, valor);
    }

    public void imprimirExtrato() {
        extrato.imprimirExtrato();
    }
    
    public Extrato getExtrato(){
        return this.extrato;
    }
    
}

