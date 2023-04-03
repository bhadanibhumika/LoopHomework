import java.util.Scanner;

public class Sum_Of_Natural_Numbers2 {

    public static void main(String[] args) {
        //declare variable
        int i;
        int num;
        // assign the value 0
        int sum=0;
        // create scanner class obj
        Scanner scanner = new Scanner(System.in);
        //print for user
        System.out.println("Enter the Number: ");
        // use variable and scanner obj
        num = scanner.nextInt();

        //for loop syntax
        for (i=1;i<=num;++i)
        {
            sum=sum+i;
        }
        System.out.println("Sum of Natural Numbers is:  "+sum);

    }

    }
