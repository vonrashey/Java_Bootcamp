package Section3;

public class Parameters {
    public static void main(String[] args) {
        calculateArea(2.3, 3.6);
        calculateArea(1.6, 2.4);
        calculateArea(2.6, 2.4);
    }

    public static void calculateArea(double length, double width )  {

        double area = length * width;
        System.out.println("Area is: " + area);
    } 
}
