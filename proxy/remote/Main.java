public class Main {
    public static void main(String[] args) {



        GumballMachine gumballMachine = new GumballMachine("seattle", 112);
        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        monitor.report();


    }
}
