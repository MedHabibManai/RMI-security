import java.rmi.*;

public class ReverseClient {
    public static void main(String args[]) {
        try {
            if (System.getSecurityManager() == null)
                System.setSecurityManager(new RMISecurityManager());
            ReverseInterface obj = (ReverseInterface) Naming.lookup("rmi://localhost/Reverse");
            String result = obj.reverseString(args[0]);
            System.out.println("Reversed string: " + result);
        } catch (Exception e) {
            System.out.println("ReverseClient error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
