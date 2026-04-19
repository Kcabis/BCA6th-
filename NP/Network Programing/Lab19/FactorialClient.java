import java.io.*;
import java.net.*;
import java.util.Scanner;

public class FactorialClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 6000);
        
        // Read integer from user
        System.out.print("Enter an integer: ");
        int num = new Scanner(System.in).nextInt();

        // Send to server
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.writeInt(num);

        // Receive result
        DataInputStream in = new DataInputStream(s.getInputStream());
        System.out.println("Server says Factorial is: " + in.readLong());

        s.close();
    }
}