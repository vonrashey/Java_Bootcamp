package Section5;

import java.util.Arrays;

public class ReferenceTrap { 
public static void main(String[] args) {

    String [] oldUsers = {"Toby", "Anne", "Lameck"};
    String [] newUsers = Arrays.copyOf(oldUsers, oldUsers.length);

    newUsers[1] = "Paida";
    System.out.println("Old Users" + Arrays.toString(oldUsers));
    System.out.println("New Users" + Arrays.toString(newUsers));

}   
}