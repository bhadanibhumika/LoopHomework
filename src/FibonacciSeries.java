import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        //declare the variables

        int maxnumber = 0;
        int previosnumber = 0;
        int nextnumber = 1;

        System.out.println("enter the numbers for fibonacci: ");// print for user input

        Scanner scanner = new Scanner(System.in);// create scanner obj
        maxnumber = scanner.nextInt(); // use obj for variable maxnumber
        System.out.println("Fibonacci series of : "+maxnumber);// print for series

        // for loop syntax
        for (int i=1;i<=maxnumber;++i)
        {
            System.out.println(previosnumber+" ");

            int sum = previosnumber+nextnumber;//create sum variable
            previosnumber= nextnumber;
            nextnumber=sum;
        }


    }
}
