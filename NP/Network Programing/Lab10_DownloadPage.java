import java.io.*;
import java.net.*;

public class Lab10_DownloadPage {
    public static void main(String[] args) throws Exception {
        // 1. Define the URL
        URL url = new URL("http://www.google.com");

        // 2. Open a stream to read data from the URL
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        // 3. Read the page line by line and print it
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }
}