import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteServer extends UnicastRemoteObject implements MyRemote {

    public MyRemoteServer() throws RemoteException { }

    public String sayHello() {
        return "Server says, ‘Hey’";
    }


    public static void main(String[] args) {
        System.out.println("Server main");

        try {
            MyRemote service = new MyRemoteServer();
            Naming.rebind("RemoteHello", service);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
