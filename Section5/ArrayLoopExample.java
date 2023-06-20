package Section5;

public class ArrayLoopExample {

    public static void main(String[] args) {
        // Example 1: Print the elements of an integer array using a for loop
        int[] numbers = {22, 24, 26, 29, 30};
        // TODO: Use a for loop to print each element of the intArray

        for(int i=0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        // Example 2: Print the elements of a string array using a for loop
        String[] strArray = {"apple", "banana", "cherry"};

        for(String strarray : strArray){
            System.out.println(strarray);
        }

        // Example 3: Print every second element of an integer array
        int[] grades = {95, 80, 85, 70, 90, 60, 88, 78};
        

        for(int i =0; i< grades.length; i+=2){
            System.out.println(grades[i]);
        }

        // Example 4: Double the elements of an integer array
        int[] values = {3, 5, 7, 9, 11};
        for(int i=0; i<values.length;i++){
            values[i] = values[i] * 2;
            System.out.println(values[i]);
        }

        // Example 5: Capitalize the elements of a string array
        String[] colors = {"red", "green", "blue"};
        for(int i=0; i<colors.length;i++){
            colors[i] = colors[i].toUpperCase();
            System.out.println(colors[i]);
        }

        // Example 6: Find the index of a specific value in an integer array
        int[] data = {4, 7, 4, 1, 4, 9, 4};
        int targetValue = 4;

        for(int i = 0; i< data.length;i++){
            if(data[i] == 4)
            {System.out.println(i);
            }
        }
       
    }
}
 
    

