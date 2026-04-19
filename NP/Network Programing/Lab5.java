import java.net.InetAddress;

public class Lab5{
    public static void main(String[] args) throws Exception {
        // 1. Parse the given IP
        InetAddress ip = InetAddress.getByName("255.234.180.23");

        // 2. Check various types using built-in methods
        if (ip.isMulticastAddress()) {
            System.out.println("Type: Multicast Address");
        } else if (ip.isLoopbackAddress()) {
            System.out.println("Type: Loopback Address");
        } else if (ip.isAnyLocalAddress()) {
            System.out.println("Type: Wildcard Address");
        } else {
            System.out.println("Type: Unicast/Global Address");
        }
        
        // Bonus: Check if it's reachable
        System.out.println("Is reachable: " + ip.isReachable(1000));
    }
}