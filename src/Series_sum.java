import java.util.Scanner;

public class Series_sum {

    //main method
    public static void main(String[] args) {
        // create scanner class obj
        Scanner scanner = new Scanner(System.in);
        //Taking user input
        System.out.println("Enter the value of n: ");
        // create variable use scanner obj
        int n = scanner.nextInt();

        // declare variable n assign to 0
        double sum = 0;

        // for syntax
        for (int i = 1;i<=n;i++)
        {
            sum+=1.0/i;
        }
        System.out.println("The sum of the series is: "+sum);



    }
}
