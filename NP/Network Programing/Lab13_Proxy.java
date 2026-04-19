import java.net.*;
import java.util.List;

public class Lab13_Proxy {
    public static void main(String[] args) throws Exception {
        // 1. Get the default ProxySelector of the system
        ProxySelector selector = ProxySelector.getDefault();

        // 2. Ask the selector which proxy to use for a specific website
        URI uri = new URI("https://www.google.com");
        List<Proxy> proxyList = selector.select(uri);

        // 3. Loop through and print the available proxies
        for (Proxy p : proxyList) {
            System.out.println("Proxy Type: " + p.type());
            
            if (p.address() != null) {
                System.out.println("Proxy Address: " + p.address());
            } else {
                System.out.println("No proxy configured (Direct connection).");
            }
        }
    }
}