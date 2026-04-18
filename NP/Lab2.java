import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;

public class Lab2 {
    public static void main(String[] args) {
        try {
            // 1. Get all network interfaces in an Enumeration (a list-like collection)
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

            System.out.println("List of Network Interfaces on this machine:");
            System.out.println("--------------------------------------------");

            // 2. Loop through each interface found
            for (NetworkInterface netInt : Collections.list(interfaces)) {
                // Print the Display Name (User friendly) and the Name (System name)
                System.out.println("Display Name: " + netInt.getDisplayName());
                System.out.println("Interface Name: " + netInt.getName());
                System.out.println("--------------------------------------------");
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}