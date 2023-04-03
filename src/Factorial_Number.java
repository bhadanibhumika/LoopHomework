import java.util.Scanner;

public class Factorial_Number {

    public static void main(String[] args) {
        // declare variable fact and initialize
        int fact=1;
        // create scanner class obj
        Scanner scanner = new Scanner(System.in);
        // print for user
        System.out.println("Enter the Number: ");
        // create variable n use sc obj
        int num = scanner.nextInt();

        //for loop syntax
        for (int i=1;i<=num;i++)//first time i=1, num=4
        {
            fact=fact*i;//fact=1*1 =1 s 2*1=2,t 2*3=6,f 6*4=12

        }
        System.out.println("Factorial of the number: "+fact);//output 24





    }
}
