import java.net.*;

public class Lab14_Auth extends Authenticator {
    // This method is called automatically when a password is needed
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("myUsername", "myPassword123".toCharArray());
    }

    public static void main(String[] args) throws Exception {
        // 1. Set the default authenticator for the application
        Authenticator.setDefault(new Lab14_Auth());

        System.out.println("Authenticator is now set.");
        System.out.println("Java will use these credentials if a site asks for a login.");
        
        // Note: To fully test this, you would connect to a password-protected URL.
    }
}