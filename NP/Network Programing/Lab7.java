import java.net.*;

public class Lab7{
    public static void main(String[] args) throws Exception {
        // 1. Get IP of the host (using localhost for this example)
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("IP Address: " + ip.getHostAddress());

        // 2. Get the Network Interface for that IP
        NetworkInterface network = NetworkInterface.getByInetAddress(ip);

        // 3. Get the MAC address in bytes
        byte[] mac = network.getHardwareAddress();

        // 4. Convert bytes to a readable Hex string (XX-XX-XX-XX-XX-XX)
        System.out.print("MAC Address: ");
        for (int i = 0; i < mac.length; i++) {
            System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
        }
    }
}