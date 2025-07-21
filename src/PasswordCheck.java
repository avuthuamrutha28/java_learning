import java.util.Scanner;
public class PasswordCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password:");
        String password = scanner.nextLine();

        if (password.length() >= 8 && password.matches(".*\\d.*")){
            System.out.println("Strong password!");
        } else {
            System.out.println("Weak password!");
        }

    }
}
