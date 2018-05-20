package test;

import beans.Computer;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB")
                                        .setGraphicCardEnabled(true)
                                        .setBluetoothEnabled(true)
                                        .build();

        System.out.println("Computer RAM is: " + computer.getRAM());
    }
}
