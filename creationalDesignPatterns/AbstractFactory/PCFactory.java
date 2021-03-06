public package design.abstractfactory;

import design.model.Computer;
import design.model.PC;

public class PCFactory extends ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @override
    public Computer createComputer() {
        return new PC(String ram, String hdd, String cpu);
    }
}
