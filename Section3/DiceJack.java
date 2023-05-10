package Section3;

import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int roll1 =  rollDice();
        int roll2 =  rollDice();
        int roll3 =  rollDice();

        System.out.print("Enter three numbers between 1 and 6: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();


        if (isLessThan1(num1, num2, num3) || isHigherThan6(num1, num2, num3)){
        System.out.println("You entered number(s) out of range");
        System.exit(0);
        }

        int sumNumbers = num1 + num2 + num3;
        int sumDiceRolls = roll1 + roll2 + roll3;

        System.out.println("Your Sum: "+sumNumbers+ "  Dice Sum: " +sumDiceRolls);

        if(userWon(sumNumbers, sumDiceRolls)){
            System.out.println("\nCongratulations, you won");
        }
        else{
            System.out.println("\nSorry, try again");
        }

        scan.close();
    }


    public static int rollDice() {
        //0 - 0.99999999999
        double randomNumber = Math.random() * 6; //0 -5.9999999
        randomNumber += 1;
        return (int)randomNumber; // 1 - 6
    }

    public static boolean isLessThan1(int num1, int num2, int num3){
        return(num1 < 1 || num2 < 1 || num3 < 1);
    }

    public static boolean isHigherThan6(int num1, int num2, int num3){
        return(num1 > 6 || num2 > 6 || num3 > 6);
    }

   public static boolean userWon(int sumNumbers, int sumDiceRolls){
    return(sumNumbers > sumDiceRolls &&(sumNumbers -sumDiceRolls) < 3);
   }
}
