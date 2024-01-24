package singleton;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DatabaseConnection {
    private static DatabaseConnection dbc = null;
    private String url;
    private String port;
    private String username;
    private String password;

    private DatabaseConnection() {
        //Make constructor private
    };

    public static DatabaseConnection getInstance() {
        Lock lock = new ReentrantLock();
        //Double check locking
        if (dbc == null) {
            lock.lock();
            if (dbc == null) {
                dbc = new DatabaseConnection();
            }
            lock.unlock();
        }
        return dbc;
    }

}
