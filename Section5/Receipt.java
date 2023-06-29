package Section5;

public class Receipt {
    public static void main(String[] args) {


        System.out.println("Here's your receipt:\n");
        
        String[] apples = {"Gala", "Granny Smith", "Macintosh"};

        double[] price = {1.99, 1.49, 1.29};
        double cost =0;
        int total=0;

        for(int i=0;i<apples.length;i++){
            total = apples.length;
        for(int j=i;j<=i;j++){
       
         System.out.println( apples[i] +": " +price[j]);
        }
               
               
                
            }

            

        // See instructions on Learn the Part (Workbook 6.8)
        
        System.out.println("\t"+total+":"+ cost); // to be used in for loop.
    }
}

