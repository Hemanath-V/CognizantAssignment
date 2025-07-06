package AdapterPatternExample;

public class Main {
    public static void main(String[] args) {
        PayPal paypal = new PayPal();
        PaymentProcessor processor = new PayPalAdapter(paypal);

        processor.pay(1000);
    }
}

