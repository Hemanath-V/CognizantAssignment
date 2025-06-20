package DecoratorPatternExample;

public class Main {
    public static void main(String[] args) {
        Notifier baseNotifier = new EmailNotifier();


        Notifier fullNotifier = new SlackNotifier(
                new SMSNotifier(baseNotifier));

        fullNotifier.send("Server down!");
    }
}

