import java.net.*;
import java.io.*;

public class Lab18_ServerSocket {
    public static void main(String[] args) throws Exception {
        // 1. Create a ServerSocket listening on port 5000
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server started... Waiting for a client on port 5000");

        while (true) {
            // 2. Wait and accept a connection
            Socket socket = server.accept();
            
            // 3. Print log message when someone connects
            System.out.println("Log: New client connected from " + socket.getInetAddress());

            // 4. Close client socket (or keep it open to talk)
            socket.close();
        }
    }
}