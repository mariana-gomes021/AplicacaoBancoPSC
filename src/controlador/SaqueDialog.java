package controlador;

import contabancaria.*;
import java.awt.FlowLayout;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luara
 */
public class SaqueDialog extends JDialog{
     private JTextField valorSaqueField;
    private JButton saqueButton;
    private ControladorLogin controla;

    public SaqueDialog(JFrame parent, ControladorLogin controla) {
        super(parent, "Saque", true);
        this.controla = controla;

        valorSaqueField = new JTextField(10);
        saqueButton = new JButton("Sacar");

        if (saqueButton.getActionListeners().length == 0) {
            saqueButton.addActionListener(e -> {
                try {
                    double valorDeposito = Double.parseDouble(valorSaqueField.getText());
                    Operacoes operacoes = new Operacoes();
                    Saque saque = operacoes.sacar(this.controla.getCliente(), valorDeposito);

                    if (saque != null) {
                        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso: R$ " + saque.getValor());
                    } else {
                        JOptionPane.showMessageDialog(null, "Falha ao realizar saque.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Valor inválido! Digite um número.");
                }
            });
        }

        setLayout(new FlowLayout());
        add(new JLabel("Valor:"));
        add(valorSaqueField);
        add(saqueButton);

        pack();
        setLocationRelativeTo(parent);
    }

}
