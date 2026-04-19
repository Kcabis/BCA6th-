import java.net.*;
import java.util.*;

public class Lab16_AllHeaders {
    public static void main(String[] args) throws Exception {
        // 1. Open connection to a URL
        URL url = new URL("https://www.google.com");
        URLConnection conn = url.openConnection();

        // 2. Get all header fields into a Map
        Map<String, List<String>> headers = conn.getHeaderFields();

        // 3. Loop through the Map and print key and values
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            
            System.out.println(key + " : " + value);
        }
    }
}