package factory.test;

import factory.factory.ComputerFactory;
import factory.model.Computer;

public class TestFactory {
    public static void main(String[] args) {
        Computer pc = new ComputerFactory("PC", "2 GB","500 GB","2.4 GHz");
        Computer server = new ComputerFactory("Server", "3 GB","700 GB","2.7 GHz");

        System.out.println("Factory Computer configuration ::" + pc);
        System.out.println("Factory Server configuration ::" + server);
    }
}
