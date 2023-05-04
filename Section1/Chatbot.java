import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int years = 400;

        System.out.println("\nHello. What is your name?");
        String name = scanner.nextLine();

        System.out.println("\nHi "+name+" I'm Javabot. Where are you from?");
        String place = scanner.nextLine();
        System.out.println("\nI hear its beautiful at " +place+"! I'm from a place called Oracle");
        System.out.println("\nHow old are you ?");
        int age = scanner.nextInt();
        System.out.println("\nSo you're " +age+", cool! I'm "+years+ " years old.");
        System.out.println("\nThis means I'm " +(years/age)+" times older than you.");
        System.out.println("\nEnough about me. What's your favourite language? (just don't say Python)");
        scanner.nextLine();
        String language = scanner.nextLine();
        System.out.println("\n" +language+", that's great! Nice chatting with you "+name+". I have to log off now. See ya!");
        scanner.close();
    }
}
