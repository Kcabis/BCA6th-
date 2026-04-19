import java.net.*;
import java.util.Date;

public class Lab15_URLMetadata {
    public static void main(String[] args) throws Exception {
        // 1. Create URL and open connection
        URL url = new URL("https://www.google.com");
        URLConnection conn = url.openConnection();

        // 2. Get and print the metadata
        System.out.println("Content Type: " + conn.getContentType());
        System.out.println("Content Length: " + conn.getContentLength() + " bytes");
        
        // 3. Convert the long timestamp to a readable Date
        long lastMod = conn.getLastModified();
        if (lastMod == 0) {
            System.out.println("Last Modified: Not provided by server");
        } else {
            System.out.println("Last Modified: " + new Date(lastMod));
        }
    }
}