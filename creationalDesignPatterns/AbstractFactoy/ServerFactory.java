package design.abstractfactory;

import design.model.Server;
import design.model.Computer;

public class ServerFactory extends ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @override
    public Computer createComputer() {
        return new Server(String ram, String hdd, String cpu);
    }
}
