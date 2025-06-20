package BuilderPatternExample;

public class Main {
    public static void main(String[] args) {
        Computer myPC = new Computer.Builder()
                .cpu("Intel i5")
                .ram(16)
                .storage(512)
                .hasGPU(true)
                .build();

        myPC.specs();
    }
}
