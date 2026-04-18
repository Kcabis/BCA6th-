import java.net.*;

public class Lab4 {
    public static void main(String[] args) {
        try {
            // 1. Define the URL
            URL url = new URL("https://www.google.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // 2. Set the timeout to 2 seconds (2000ms)
            connection.setConnectTimeout(2000);

            // 3. Try to connect
            connection.connect();

            // 4. If no error occurs, it's reachable
            System.out.println("URL is reachable within 2 seconds.");

        } catch (Exception e) {
            // If it takes longer than 2s or fails, it catches the error here
            System.out.println("URL is NOT reachable: " + e.getMessage());
        }
    }
}