package design.test;

import design.abstractfactory.PCFactory;
import design.abstractfactory.ServerFactory;
import design.factory.ComputerFactory;
import design.model.Computer;

public class TestDesignPatterns {
    public static void main(String[] args) {
        testHelper();
    }

    public static void testHelper() {
        Computer pc = new design.factory.ComputerFactory.createComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = new desgin.factory.ComputerFactory.createComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));

        System.out.println("PC config :: " + pc);
        System.out.println("PC config :: " + server);
    }
}
