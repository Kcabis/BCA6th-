import java.net.InetAddress;
import java.net.URL;

public class Lab1{
    public static void main(String[] args) {
        try {
            // 1. Create a URL object
            URL myUrl = new URL("https://www.google.com");

            // 2. Extract basic info from the URL
            String hostName = myUrl.getHost();
            String protocol = myUrl.getProtocol();
            int port = myUrl.getDefaultPort(); // Gets the default port for HTTPS (443)

            // 3. Get the IP address (Host Address) using the hostname
            InetAddress ipAddress = InetAddress.getByName(hostName);
            String hostAddress = ipAddress.getHostAddress();

            // 4. Print all the extracted information
            System.out.println("Hostname: " + hostName);
            System.out.println("Host Address (IP): " + hostAddress);
            System.out.println("Protocol: " + protocol);
            System.out.println("Port: " + port);

        } catch (Exception e) {
            // This catches any network or URL formatting errors
            System.out.println("Error: " + e.getMessage());
        }
    }
}