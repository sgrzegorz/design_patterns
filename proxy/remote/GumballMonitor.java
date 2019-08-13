import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMonitor {
    GumballMachineRemote machine;
    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }
    
    public void report() {
        try{
            System.out.println("Gumball Machine: " + machine.getLocation());
            System.out.println("Current inventory: " + machine.getCount() + " gumballs");
            System.out.println("Current state: " + machine.getState());

        }catch (RemoteException e){
            e.printStackTrace();;
        }

    }


    public static void main(String[] args) {
//        "rmi://santafe.mightygumball.com/gumballmachine", "rmi://boulder.mightygumball.com/gumballmachine",
        String[] location = { "rmi://seattle.mightygumball.com/gumballmachine"};
        GumballMonitor[] monitor = new GumballMonitor[location.length];
        for (int i=0;i < location.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for(int i=0; i < monitor.length; i++) {
            monitor[i].report();
        }
}
}
