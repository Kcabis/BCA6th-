import java.rmi.*;

public interface HelloService extends Remote {
    // This method will be executed on the server but called by the client
    String sayHello(String name) throws RemoteException;
}