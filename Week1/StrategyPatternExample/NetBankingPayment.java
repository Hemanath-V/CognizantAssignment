package StrategyPatternExample;

public class NetBankingPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Net Banking ");
    }
}

