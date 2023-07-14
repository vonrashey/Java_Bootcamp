import java.util.Arrays;

public class TDArrays {
    public static void main(String[] args) {
        int[][] grades = {
            {11, 22, 22},
            {33, 33, 22},
            {44, 22, 20}
        };
        //grades[0][0] = 99;
        //grades[0][1] = 88;
        //grades[0][2] = 90;
        //grades[0][3] = 80;
        //System.out.println("\tPat: " + grades[0][0] + " " + grades[0][1]+ " " + grades[0][2]);
        //System.out.println("\tTon: " +  grades[1][0] + " " + grades[1][1]+ " " + grades[1][2]);
        //System.out.println("\tKai: " + grades[2][0] + " " + grades[2][1]+ " " + grades[2][2]);
        //System.out.println( grades[0]);

        for(int i =0; i<grades.length; i++){

            switch(i){
                case 0: System.out.print("\tHarry: ");break;
                case 1: System.out.print("\tKale: ");break;
                case 2: System.out.print("\tWale: ");break;
            }

            for(int j=0; j< grades[i].length;j++){ 
            System.out.print(grades[i][j] + " ");
        }
        System.out.println("\n");
    }
    }
}
