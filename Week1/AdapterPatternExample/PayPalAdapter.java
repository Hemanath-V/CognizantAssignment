package AdapterPatternExample;

public class PayPalAdapter implements PaymentProcessor {
    private PayPal paypal;

    public PayPalAdapter(PayPal paypal) {
        this.paypal = paypal;
    }

    public void pay(int amount) {
        paypal.sendMoney(amount);
    }
}
