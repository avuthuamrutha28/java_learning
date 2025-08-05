package collections;
import java.util.*;

public class VoterRegistry {
    private Set<String> registeredVoters;

    public VoterRegistry(){
        registeredVoters = new TreeSet<>();
    }

    public boolean registerVoter(String name){
        return registeredVoters.add(name);
    }

    public boolean isRegistered(String name){
        return registeredVoters.remove(name);
    }

    public boolean removeVoter(String name) {
        return registeredVoters.remove(name);
    }

    public void displayVoters(){
        if (registeredVoters.isEmpty()){
            System.out.println("No voters registered.");
        }
        else{
            System.out.println("\n---- Registered Voters ----");
            for(String Voter : registeredVoters){
                System.out.println("- " + Voter);
            }
        }
    }

    public void compareWithOtherBooth(Set<String> booth2) {
        Set<String> common = new  TreeSet<>(registeredVoters);
        common.retainAll(booth2);

        Set<String> onlyHere = new TreeSet<>(registeredVoters);
        onlyHere.removeAll(booth2);

        Set<String> union = new TreeSet<>(registeredVoters);
        union.addAll(booth2);

        System.out.println("\n Booth 2 Voters: " + booth2);
        System.out.println(" Common voters: " + common);
        System.out.println(" Unique to this booth: " + onlyHere);
        System.out.println(" Unique of Both Booths: " + union);
    }


}
