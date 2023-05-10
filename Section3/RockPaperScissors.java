package Section3;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

    //Task 1: See if the user wants to play. 

    String play = scan.nextLine();
    if(play.equals("yes")){
        System.out.println("Great!");
        System.out.println("rock - paper - scissors, shoot!");
        String yourChoice = scan.nextLine();
        String computerChoice = computerChoice();
        String result = result(yourChoice, computerChoice);
        printResult(yourChoice, computerChoice, result);

    }else{ 
        System.out.println("Darn, some other time...!  ");}   
        scan.close();
    }

     public static String computerChoice(){
        double randomNumber = Math.random() * 3; //0 -1.9999999

    switch ((int)randomNumber) {
    case 0: return "rock"; 
    case 1: return "paper"; 
    case 2: return "scissors";
    default:return "";
    }

    }

    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        if(yourChoice.equals("rock") && computerChoice.equals("scissors")
        || yourChoice.equals("paper") && computerChoice.equals("rock")
        || yourChoice.equals("scissors") && computerChoice.equals("paper")){
            result ="You Win!";
            
        } 
        else if(computerChoice.equals("rock") && yourChoice.equals("scissors")
        || computerChoice.equals("paper") && yourChoice.equals("rock")
        || computerChoice.equals("scissors") && yourChoice.equals("paper")){
            result ="You Lose!";
            
        }
        else if(computerChoice.equals("rock") && yourChoice.equals("rock")
        || computerChoice.equals("paper") && yourChoice.equals("paper")
        || computerChoice.equals("scissors") && yourChoice.equals("scissors")){
            result ="Its a Tie!";
            
        }else{
            result ="Invalid Choice";
            System.exit(0);
    
         }
         return result;
      }

     public static void printResult(String yourChoice, String computerChoice, String result){
        System.out.println("You chose:" +yourChoice);
        System.out.println("The computer chose:" +computerChoice);
        System.out.println(result);
     }
}
