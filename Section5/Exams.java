package Section5;

public class Exams {
    public static void main(String[] args) {

        // Instructions for this workbook are on Learn the Part (Workbook 6.1).

        String[] seats = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};
        System.out.println("It's time to take your 5th year exams. Please, take your seats.\n");
        
        for(int i=0; i< seats.length; i++){ 
        System.out.println(seats[i]+ ", you will take seat " + i);
        }

        // Compare your result to what's on Learn the Part.

    }
}
