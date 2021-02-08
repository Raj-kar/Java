import java.util.Scanner;
class Question { //Define a class Question with two elements e1 and e2.
    Scanner sc = new Scanner(System.in);
    int e1 = sc.nextInt(); //Read e1
    int e2 = sc.nextInt(); //Read e2
}
public class Question3 {
    public static void swap(Question obj) {
        int e3 = obj.e1;
        obj.e1 = obj.e2;
        obj.e2 = e3;
    }


    public static void main(String[] args) {
        //Create an object of class Question
        Question t = new Question();
        //Call the method swap()
        swap(t);

        System.out.print(t.e1 + " " + t.e2);
    }

}