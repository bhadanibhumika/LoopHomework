import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        // create scanner class obj
        Scanner scanner = new Scanner(System.in);
        //Taking user input
        System.out.println("Enter a number to check it is prime or not: ");

        int number = scanner.nextInt(); //create variable

        // for loop syntax
        for (int i = 2; i <= number / 2; i++)
        {
            if ((number % i) == 0)
            {
                System.out.println(number+" is a not prime");
                break;
            }
            else
                System.out.println(number+" is a  prime number");
        }
    }
}