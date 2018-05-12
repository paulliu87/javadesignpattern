public class ReflectionSignletonTest {

    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne = new EagerInitializedSingleton();
        EagerInitializedSingleton instanceTwo = null;

        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();

            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton)constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.PrintStackTrace();
        }
        System.out.print(instanceOne.hashCode());
        System.out.print(instanceTwo.hashCode());
    }
}
