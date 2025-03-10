package org.example;

import java.util.UUID;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String boletoCode = UUID.randomUUID().toString().replace("-", "");
        System.out.println("Pagamento via Boleto no valor de R$ " + amount + " processado.");
        System.out.println("Código do Boleto: " + boletoCode);
    }
}