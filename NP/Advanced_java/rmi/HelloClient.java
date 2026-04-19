import java.rmi.registry.*;

public class HelloClient {
    public static void main(String[] args) {
        try {
            // Get the registry from the server's IP (null means localhost)
            Registry registry = LocateRegistry.getRegistry(null);

            // Look up the remote object by name
            HelloService stub = (HelloService) registry.lookup("HelloRemote");

            // Call the remote method as if it were local
            String response = stub.sayHello("Gemini User");
            System.out.println("Response from Server: " + response);

        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
        }
    }
}