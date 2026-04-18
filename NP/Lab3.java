import java.net.*;

public class Lab3{
    public static void main(String[] args) throws Exception {
        // 1. Get the address for localhost
        InetAddress localAddr = InetAddress.getByName("127.0.0.1");

        // 2. Find the interface attached to that address
        NetworkInterface netInt = NetworkInterface.getByInetAddress(localAddr);

        // 3. Print the name
        if (netInt != null) {
            System.out.println("Interface for localhost: " + netInt.getDisplayName());
            System.out.println("Name: " + netInt.getName());
        } else {
            System.out.println("Interface not found.");
        }
    }
}