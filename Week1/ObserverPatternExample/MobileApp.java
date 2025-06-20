package ObserverPatternExample;

public class MobileApp implements Observer {
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double newPrice) {
        System.out.println("[📱 Mobile - " + name + "] " + stockName + " updated to ₹" + newPrice);
    }
}
