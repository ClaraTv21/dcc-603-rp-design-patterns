package singleton;

import java.util.concurrent.TimeUnit;

public class DBConnection {

    private final String url;

     @param url the JDBC connection string (e.g. "jdbc:mysql://...")
    public DBConnection(String url) {
        this.url = url;
    }

    /**
     * Simulates establishing a connection by printing status messages
     * and sleeping for one second.
     *
     * @throws InterruptedException if the thread is interrupted during sleep
     */
    public void open() throws InterruptedException {
        System.out.printf("Opening connection to %s...%n", url);
        // pause for 1 second to mimic network latency
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Connection established.");
    }

    public static void main(String[] args) {
        try {
            DBConnection conn = new DBConnection("jdbc:yourdb://localhost:3306/mydb");
            conn.open();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Connection process was interrupted.");
        }
    }
}