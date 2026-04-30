import java.util.Scanner;

public class LoginSample {
    // Sample hardcoded credentials
    private static final String USERNAME = "ec2-user";
    private static final String PASSWORD = "ASDasd123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Login System ===");

        // Get username input
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        // Get password input
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        // Validate credentials
        if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
            System.out.println("Login successful! Welcome, " + inputUsername);
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}
