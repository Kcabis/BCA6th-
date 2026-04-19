import java.io.*;
import java.net.*;
import java.util.Date;
import java.util.concurrent.*;

public class ThreadPoolServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(1314);
        // Create a pool of 50 threads
        ExecutorService pool = Executors.newFixedThreadPool(50);
        
        System.out.println("Server with ThreadPool(50) started...");

        while (true) {
            Socket client = server.accept();
            // Give the task to the pool instead of creating a "new Thread"
            pool.execute(() -> {
                try {
                    PrintWriter out = new PrintWriter(client.getOutputStream(), true);
                    out.println(new Date().toString());
                    client.close();
                } catch (IOException e) { e.printStackTrace(); }
            });
        }
    }
}