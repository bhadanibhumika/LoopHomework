import java.util.Scanner;

public class Range_Of_Ten_Number {

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);// create scanner object

        System.out.println("Enter first value: "); //print for user input
         int n = scanner.nextInt();//using obj for variable n

        System.out.println("Enter second number: "); // print for user input
        int b = scanner.nextInt(); //using obj gor variable b

        System.out.println("Numbers range are: ");
        //for loop syntax
        for (int i = n; i <= b; i++) {
            System.out.println(i);// for print the value

        }








    }
}
