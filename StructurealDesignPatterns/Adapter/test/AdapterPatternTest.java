package test;

import beans.Volt;
import beans.SocketAdapter;
import beans.SocketClassAdapterImpl;
import beans.SocketObjectAdapterImpl;

public class AdapterPatternTest {
    public static void main(String[] args) {
        testClassAdapter();
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter sa = new SocketClassAdapterImpl();
        Volt v1 = getVolt(sa, 120);
        Volt v2 = getVolt(sa, 12);
        Volt v3 = getVolt(sa, 3);

        System.out.println("V120 volts using Class Adapter: " + v1.getVolts());
        System.out.println("V12 volts using Class Adapter: " + v2.getVolts());
        System.out.println("V3 volts using Class Adapter: " + v3.getVolts());
    }

    private static void testClassAdapter() {
        SocketAdapter sa = new SocketObjectAdapterImpl();
        Volt v1 = getVolt(sa, 120);
        Volt v2 = getVolt(sa, 12);
        Volt v3 = getVolt(sa, 3);

        System.out.println("V120 volts using Object Adapter: " + v1.getVolts());
        System.out.println("V12 volts using Object Adapter: " + v2.getVolts());
        System.out.println("V3 volts using Object Adapter: " + v3.getVolts());
    }

    private static Volt getVolt(SocketAdapter SocketAdapter, int i) {
        switch (i) {
            case 3: return SocketAdapter.get3Volt();
            case 12: return SocketAdapter.get12Volt();
            case 120: return SocketAdapter.get120Volt();
            default: return SocketAdapter.get120Volt();
        }
    }
}
