import java.rmi.*;
import java.rmi.registry.*;

public class ReverseClient {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Utilisation : java ReverseClient ch1 ch2");
            System.exit(0);
        }
        try {
            if (System.getSecurityManager() == null)
                System.setSecurityManager(new RMISecurityManager());

            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
            FabReverseInterface fabrique = (FabReverseInterface) reg.lookup("Fabrique");

            // Your implementation for the client logic here
        } catch (Exception e) {
            System.out.println("ReverseClient error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
