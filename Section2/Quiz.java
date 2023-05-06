package Section2;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions.


        Scanner scan = new Scanner(System.in);

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String answerOne = scan.nextLine();

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        
        String answerTwo = scan.nextLine();

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        String answerThree = scan.nextLine();

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        String answerFour = scan.nextLine();

        int score = 0;

        if(answerOne.equals("c")){
            score += 5;
        }//else{System.out.println(answerOne + "is not correct");}

        if(answerTwo.equals("a")){
            score += 5;
        }//else{System.out.println(answerTwo + "is not correct");}

        if(answerThree.equals("d")){
            score += 5;
        }//else{System.out.println(answerThree + "is not correct");}

        if(answerFour.equals("a") || (answerFour.equals("b"))){ 
            score += 5;
        }//else{ System.out.println(answerFour + "is not correct");}
        //Task 2: Check each answer - For each correct answer, add 5 points to the score. 
        
        System.out.println("Your final score is: " + score + "/20");

        //Task 3: print a message depending on the score
        if(score >= 15){
            System.out.println("Wow, you know your stuff!");
        }else if(score >= 5)
        {
            System.out.println("Not bad!");
        }else{
            System.out.println("better luck next time."); 
        }

        scan.close();

    }
}

