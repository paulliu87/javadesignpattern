package design.abstractfactory;

import design.model.Computer;

public static class ComputerFactory {
    public static Computer createComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
