package beans;

public class SocketObjectAdapterImpl implements SocketAdapter {
    private Socket sock = new Socket();

    @Override
    public Volt get120Volt() {
        return sock.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = sock.getVolt();
        return convertVolt(v, 12);
    }

    @Override
    public Volt get3Volt() {
        Volt v = sock.getVolt();
        return convertVolt(v, 3);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}
