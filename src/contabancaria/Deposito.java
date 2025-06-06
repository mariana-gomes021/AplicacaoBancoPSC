/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Deposito {

    private double valor;
    private LocalDateTime data;

    public Deposito(double valor) {
        this.valor = valor;
        this.data = LocalDateTime.now();
    }

    public double getValor() {
        return valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getDataFormatada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return data.format(formatter);
    }

}
