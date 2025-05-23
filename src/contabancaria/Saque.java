package contabancaria;

import java.time.LocalDateTime;

public class Saque {

    private double valor;
    private LocalDateTime data;

    public Saque(double valor) {
        this.valor = valor;
        this.data = LocalDateTime.now();
    }

    public double getValor() {
        return valor;
    }

    public LocalDateTime getData() {
        return data;
    }
}
