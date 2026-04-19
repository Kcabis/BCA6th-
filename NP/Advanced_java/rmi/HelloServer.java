import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class HelloServer extends UnicastRemoteObject implements HelloService {

    protected HelloServer() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "! Welcome to the RMI World.";
    }

    public static void main(String[] args) {
        try {
            // Create the remote object
            HelloServer obj = new HelloServer();

            // Create/Start the RMI registry on port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind the remote object in the registry with a unique name
            registry.rebind("HelloRemote", obj);

            System.out.println("Server is ready and running...");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
        }
    }
}