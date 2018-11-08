package Ch5_Singelton.Lock;

//
// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5
//

public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    //Синхронизация выполняется только при первом вызове
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