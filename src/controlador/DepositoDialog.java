/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import contabancaria.*;
import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author luara
 */
public class DepositoDialog extends JDialog {

    private JTextField valorDepositoField;
    private JButton depositoButton;
    private ControladorLogin controla;

    public DepositoDialog(JFrame parent, ControladorLogin controla) {
        super(parent, "Depósito", true);
        this.controla = controla;

        valorDepositoField = new JTextField(10);
        depositoButton = new JButton("Depositar");

        if (depositoButton.getActionListeners().length == 0) {
            depositoButton.addActionListener(e -> {
                try {
                    double valorDeposito = Double.parseDouble(valorDepositoField.getText());
                    Operacoes operacoes = new Operacoes();
                    Deposito deposito = operacoes.depositar(this.controla.getCliente(), valorDeposito);

                    if (deposito != null) {
                        System.out.println("---------------------------------");
                        System.out.println("Deposito");
                        System.out.println("Deposito de R$ " + deposito.getValor()
                                + " realizado em " + deposito.getData());
                        System.out.println("Saldo apos o deposito: R$ " + this.controla.getCliente().getSaldo());
                        JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso: R$ " + deposito.getValor());
                    } else {
                        JOptionPane.showMessageDialog(null, "Falha ao realizar depósito.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Valor inválido! Digite um número.");
                }
            });
        }

        setLayout(new FlowLayout());
        add(new JLabel("Valor:"));
        add(valorDepositoField);
        add(depositoButton);

        pack();
        setLocationRelativeTo(parent);
    }

}
