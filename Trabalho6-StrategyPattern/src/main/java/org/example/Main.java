package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        while (true) {
            // Exibe o menu de opções
            System.out.println("\nEscolha o método de pagamento:");
            System.out.println("1: Pix");
            System.out.println("2: Cartao de Crédito");
            System.out.println("3: Boleto");
            System.out.println("0: Sair");
            System.out.print("Digite o número da opçao: ");
            int option = scanner.nextInt();

            // Verifica se o usuário quer sair
            if (option == 0) {
                System.out.println("Saindo do sistema...");
                break;
            }

            // Cria a estratégia de pagamento usando a PaymentFactory
            PaymentStrategy paymentStrategy = PaymentFactory.createPaymentStrategy(option);

            // Solicita o valor da transação
            System.out.print("Digite o valor da transação: ");
            double amount = scanner.nextDouble();

            // Configura e processa o pagamento
            paymentProcessor.setPaymentStrategy(paymentStrategy);
            paymentProcessor.processPayment(amount);
        }

        scanner.close();
    }
}