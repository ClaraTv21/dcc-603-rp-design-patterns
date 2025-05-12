package singleton;

public class DBConnection {

    private static DBConnection singleInstance;
    private final String url;

    private DBConnection(String url) {
        this.url = url;
    }

    public static synchronized DBConnection getInstance(String url) {
        if (singleInstance == null) {
            singleInstance = new DBConnection(url);
        }
        return singleInstance;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + url);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }
}
