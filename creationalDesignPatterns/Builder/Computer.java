package design.builder;

public class Computer {
    private String RAM;
    private String HDD;

    private boolean isGraphicCarEnabled;
    private boolean isBluetoothEnabled;

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public boolean isGraphicCarEnabled() {
        return isGraphicCarEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private Computer(ComputerBuilder builder) {
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
        this.isGraphicCarEnabled = builder.isGraphicCarEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public class ComputerBuilder {
        private String RAM;
        private String HDD;
        private boolean isGraphicCarEnabled;
        private boolean isBluetoothEnabled;

        public  ComputerBuilder(String ram, String hdd) {
            this.RAM = ram;
            this.HDD = hdd;
        }

        public ComputerBuilder setGraphicCardEnabled(boolean isGraphicCarEnabled) {
            this.isGraphicCarEnabled = isGraphicCarEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
