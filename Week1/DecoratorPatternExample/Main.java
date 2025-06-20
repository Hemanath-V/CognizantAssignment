package DecoratorPatternExample;

public class Main {
    public static void main(String[] args) {
        Notifier baseNotifier = new EmailNotifier();

        // Add SMS and Slack on top of email
        Notifier fullNotifier = new SlackNotifier(
                new SMSNotifier(baseNotifier));

        fullNotifier.send("Server down!");
    }
}

