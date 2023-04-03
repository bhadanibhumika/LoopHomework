import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // create scanner class n obj
        Scanner scanner = new Scanner(System.in);
        //print for user input
        System.out.println("Enter First Number: ");
        // create variable n use obj
        int a = scanner.nextInt();
        // Taking number from user
        System.out.println("Enter second Number: ");
        // create variable n use obj
        int b = scanner.nextInt();
        // Taking opp from user
        System.out.println("Enter an Operator: ");
        // create variable n use scanner obj
        char operator= scanner.next().charAt(0);

        //switch syntax
        switch (operator)
        {
            case '+':
                System.out.println("Addition of: "+a+"+"+b+"="+(a+b));
                break;
            case '-':
                System.out.println("subtraction of: "+a+"-"+b+"="+(a-b));
                break;
            case '*':
                System.out.println("multiplication of: "+a+"*"+b+"="+(b*b));
                break;
            case'/':
                System.out.println("Division of: "+a+"/"+b+"="+(a/b));
                break;
            default:
                System.out.println("Invalid Operator: " + operator);

        }







    }
}
