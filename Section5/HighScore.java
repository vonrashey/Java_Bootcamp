package Section5;

public class HighScore {
    public static void main(String[] args) {
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        
        int highScore = 0;
        int seat =0;
        System.out.print("Here are the scores: ");    
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
            if (scores[i] > highScore) {
                highScore = scores[i];
                seat=i;
            }
        }
        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
        
         System.out.println("It's the gentleman in seat: "+ seat +". Give that man a cookie!");
    }
    
    public static int randomNumber(){
        double randomNumber = Math.random() * 49999;
        randomNumber +=1;
        return (int)randomNumber;
    }
}
