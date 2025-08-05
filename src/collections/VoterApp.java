package collections;
import java.util.*;

public class VoterApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        VoterRegistry registry = new VoterRegistry();

        while(true){
            System.out.println("\n--- Unique Voter Registration System ---");
            System.out.println("1. Register Voter");
            System.out.println("2. Remove Voter");
            System.out.println("3. Check Voter");
            System.out.println("4. View All Voters");
            System.out.println("5. Compare with Another Booth");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter voter name to register: ");
                    String nameToAdd = scanner.nextLine();

                    if (registry.registerVoter(nameToAdd)){
                        System.out.println("Voter registered.");
                    } else {
                        System.out.println("Voter already exists.");
                    }
                    break;

                case 2:
                    System.out.print("Enter voter name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    if(registry.removeVoter(nameToRemove)){
                        System.out.println("Voter removed." );
                    }
                    else{
                        System.out.println("Voter not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter voter name to check: ");
                    String nameToCheck = scanner.nextLine();
                    if(registry.isRegistered(nameToCheck)){
                        System.out.println("Voter is registered.");
                    }
                    else{
                        System.out.println("Voter not found");
                    }
                    break;

                case 4:
                    registry.displayVoters();
                    break;

                case 5:
                    Set<String> booth2 = new TreeSet<>(Arrays.asList("Alice", "Ravi", "Priya"));
                    registry.compareWithOtherBooth(booth2);
                    break;

                case 6:
                    System.out.println("Exiting");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try Again.");

            }

        }
    }
}
