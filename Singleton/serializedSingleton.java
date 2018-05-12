import java.io.Serializable;

public class SerializedSingleton implements serializable {
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){};

    private static SerializableSingleHelper() {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    private static SerializedSingleton getInstance {
        return SerializableSingleHelper.instance;
    }
}
