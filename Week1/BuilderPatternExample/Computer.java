package BuilderPatternExample;

public class Computer {
    private String cpu;
    private int ram;
    private int storage;
    private boolean hasGPU;


    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.hasGPU = builder.hasGPU;
    }


    public static class Builder {
        private String cpu;
        private int ram;
        private int storage;
        private boolean hasGPU;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder hasGPU(boolean hasGPU) {
            this.hasGPU = hasGPU;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public void specs() {
        System.out.println("CPU: " + cpu + ", RAM: " + ram + "GB, Storage: " + storage + "GB, GPU: " + hasGPU);
    }
}

