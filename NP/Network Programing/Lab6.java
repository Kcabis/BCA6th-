import java.net.*;

public class Lab6 {
    public static void main(String[] args) throws Exception {
        // You can change this IP to test both versions
        String input = "192.168.1.1"; 
        InetAddress address = InetAddress.getByName(input);

        // Check the instance type
        if (address instanceof Inet4Address) {
            System.out.println(input + " is an IPv4 address.");
        } else if (address instanceof Inet6Address) {
            System.out.println(input + " is an IPv6 address.");
        }
    }
}