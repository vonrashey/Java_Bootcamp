package Section5;

public class IntroToArrays {
    public static void main(String[] args) {
        String[]  kingdoms = { "Mercia", "Wessex", "Northumbria", "East Anglia"};
        System.out.println(kingdoms[0]);
        System.out.println(kingdoms[1]);
        System.out.println(kingdoms[2]);
        System.out.println(kingdoms[3]);
        System.out.println(kingdoms[4 - 1]); //throws an index out of bounds error

        //System.out.println(kingdoms); // it prints the reference of the array
    }
}