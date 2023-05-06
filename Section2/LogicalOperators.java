package Section2;
public class LogicalOperators {
    public static void main(String[] args) {

    
        boolean hasDrivingLicense = true;
        boolean hasInsurance = true;

        if(hasDrivingLicense && hasInsurance){
            System.out.println("You can legally drive.");
        }
        else{
            System.out.println("You cannot legally drive.");
        }

        // has License and Insurance: 
        // otherwise: 

        int age = 25;
        double income = 35000;

        if(age>= 21 && income >=40000){  
        System.out.println("You are eligible for a loan.");
        } else { 
        System.out.println("You are not eligible for a loan.");
        }


        String inputUsername = "JohnDoe";
        String inputPassword = "Password123";

        String correctUsername = "JohnDoe";
        String correctPassword = "password123";

        if(inputUsername.equals(correctUsername)   && inputPassword.equals(correctPassword)){
        System.out.println("Access granted!");
        }else{
        System.out.println("Invalid username or password");  
        }
       
        // otherwise: System.out.println("Invalid username or password");

        /**********************OR OPERATOR**********************/

        boolean hasGoodPerformance = true;
        boolean isLongTermEmployee = false;

        if(hasGoodPerformance || isLongTermEmployee){
            System.out.println("The user is eligible for a promotion.");
        }else{
            System.out.println("The user is not eligible for a promotion.");
        }

        int userAge = 17;
        boolean isParentPresent = true;
        if(userAge >=18 || isParentPresent){
            System.out.println("You can enter the venue.");
        }else{
            System.out.println("You cannot enter the venue.");
        }
        // at least 18 or if parent is present: 
        // otherwise: 


        int memberAge = 16;
        boolean hasMembership = false;
        if(memberAge >= 16 || hasMembership){
            System.out.println("The user can access the service.");
        }
        else{ System.out.println("The user cannot access the service.");}


        /**********************NOT OPERATOR**********************/

        String option = "debit";

        if(!(option.equals("cash") || option.equals("credit"))){System.out.println("Please choose another payment option");}
        else{System.out.println("Sold. Pleasure doing business with you!");}
       

        char letter = 'X';

        if(!(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')){
            System.out.println("The letter " + letter + " is a consonant"); 
        }else{
            System.out.println("The letter " + letter + " is a vowel");}
        

        String move = "stay";
        
        if( ! (move.equals("hit") || move.equals("stay"))){
            System.out.println("Please choose a valid move");
        }else{
            System.out.println("You win 10 bucks!");
        }
     

        double price = 25.99;
        int quantity = 2;
 
        if (price >= 30 || quantity > 5) {
            System.out.println("If code runs");
        } else {
            System.out.println("Else code runs");
        }
    }
}
