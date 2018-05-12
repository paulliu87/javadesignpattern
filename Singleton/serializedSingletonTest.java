import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializedSingletonTest {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundExceoption {
        SerializedSingleton instanceOne = new SerializedSingleton();

        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.print("InstanceOne hashCode: " + InstanceOne.hashCode());
        System.out.print("instanceTwo hashCode: " + InstanceTwo.hashCode());
    }

    // to get same same hashCode;
    // protected Object readResolved() {
    //     return getInstance();
    // }
}
