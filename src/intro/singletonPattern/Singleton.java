package intro.singletonPattern;

public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    /**
     * Returns the unique instance of the Singleton class.
     *
     * This method is thread-safe and ensures that only one instance of the
     * Singleton class is created.
     *
     * @return the unique instance of the Singleton class
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
