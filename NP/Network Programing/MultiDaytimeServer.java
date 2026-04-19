import java.io.*;
import java.net.*;
import java.util.Date;

public class MultiDaytimeServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(1313);
        System.out.println("Multithreaded Daytime Server started...");

        while (true) {
            Socket client = server.accept();
            // Start a new thread for every client
            new Thread(() -> {
                try {
                    PrintWriter out = new PrintWriter(client.getOutputStream(), true);
                    out.println(new Date().toString()); // Send current time
                    client.close();
                } catch (IOException e) { e.printStackTrace(); }
            }).start();
        }
    }
}