package ObserverPatternExample;

public class WebApp implements Observer {
    private String name;

    public WebApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double newPrice) {
        System.out.println("[🌐 Web - " + name + "] " + stockName + " updated to ₹" + newPrice);
    }
}

