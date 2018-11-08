package Ch5_Singelton.ThreadSafe;

public class Singleton {
    private static Singleton uniqueInstance;

    // other useful instance variables here

    private Singleton() {
    }

    //Если производительность не критична
    //Синхронизация актуальная только при первом вызове
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}