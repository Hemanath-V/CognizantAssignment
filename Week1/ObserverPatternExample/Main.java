package ObserverPatternExample;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobile1 = new MobileApp("Hemanath's Phone");
        Observer web1 = new WebApp("Dashboard A");

        stockMarket.registerObserver(mobile1);
        stockMarket.registerObserver(web1);

        stockMarket.setStock("TCS", 3520.25);
        System.out.println("----");

        stockMarket.setStock("Infosys", 1450.10);

        stockMarket.removeObserver(web1);
        System.out.println("---- After removing WebApp ----");

        stockMarket.setStock("HCL", 1234.56);
    }
}

