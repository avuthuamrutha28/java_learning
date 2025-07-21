//User Info Collector (Variables + Scanner)
// Goal: Take user name, age, and city, then print a message.
import java.util.Scanner;
public class UserInfo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Name:");
        String name = scanner.nextLine();

        System.out.print("Enter your Age:");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter your City:");
        String city = scanner.nextLine();

        System.out.println("I am" + name + ", " + age + "years old from" +city+ ".");
        scanner.close();



    }
}
