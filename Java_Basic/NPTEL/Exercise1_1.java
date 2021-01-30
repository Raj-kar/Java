import java.util.Scanner;

public class Exercise1_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double radius = s.nextDouble();
        double perimeter;
        double area;
        double PI = Math.PI;

        //Calculate the parameter
        perimeter = (2 * PI * radius);

        //Calculate the area
        area = (PI * (radius * radius));


        System.out.print(perimeter + "\n" + area);
    }
}