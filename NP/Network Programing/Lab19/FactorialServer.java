import java.io.*;
import java.net.*;

public class FactorialServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6000);
        System.out.println("Factorial Server is running...");
        Socket s = ss.accept();

        // Get number from client
        DataInputStream in = new DataInputStream(s.getInputStream());
        int num = in.readInt();

        // Calculate Factorial
        long fact = 1;
        for (int i = 1; i <= num; i++) fact *= i;

        // Send result back
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.writeLong(fact);
        
        s.close(); ss.close();
    }
}