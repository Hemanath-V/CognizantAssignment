package StrategyPatternExample;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(500);

        cart.setPaymentStrategy(new UPIPayment());
        cart.checkout(1000);

        cart.setPaymentStrategy(new NetBankingPayment());
        cart.checkout(2000);
    }
}

