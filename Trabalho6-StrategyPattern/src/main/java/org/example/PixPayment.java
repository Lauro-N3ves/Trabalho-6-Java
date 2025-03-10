package org.example;

import java.util.UUID;

public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String pixCode = UUID.randomUUID().toString().replace("-", "");
        System.out.println("Pagamento via Pix no valor de R$ " + amount + " processado.");
        System.out.println("Código Pix: " + pixCode);
    }
}