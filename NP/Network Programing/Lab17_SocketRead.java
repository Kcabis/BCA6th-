import java.io.*;
import java.net.*;

public class Lab17_SocketRead {
    public static void main(String[] args) throws Exception {
        // 1. Connect to a server (e.g., time.nist.gov on port 13)
        // If testing locally, use "localhost" and your own port
        Socket socket = new Socket("time.nist.gov", 13);

        // 2. Set up the input stream to read data
        InputStream input = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));

        // 3. Read and print the response
        String line = reader.readLine();
        System.out.println("Server says: " + line);

        socket.close();
    }
}