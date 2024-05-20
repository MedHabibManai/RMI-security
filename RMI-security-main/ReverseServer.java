import java.rmi.*;
import java.rmi.server.*;

public class ReverseServer {
    public static void main(String args[]) {
        try {
            if (System.getSecurityManager() == null)
                System.setSecurityManager(new RMISecurityManager());
            ReverseImpl obj = new ReverseImpl();
            Naming.rebind("Reverse", obj);
            System.out.println("ReverseServer bound in registry");
        } catch (Exception e) {
            System.out.println("ReverseServer error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
