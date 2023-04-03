import java.util.Scanner;

public class Sum_Of_X_Range {
    public static void main(String[] args) {
        //declare variable n assign the value
        int sum = 0;
        //create scanner class obj
        Scanner scanner = new Scanner(System.in);
        //Taking user input
        System.out.println(" Enter a Number between 1 to 20: ");
        //create variable n use scanner obj
        int num = scanner.nextInt();

        //if statement
        if(num<1 || num>20)
        {
            System.out.println("Invalid input! "+num);
        }
        else
        {
            //for loop syntax
            for(int i =1; i<=num; i++)
            {
                sum=i+sum;
            }
                System.out.println("The sum of x from 1 to "+num+" is: "+sum);

        }




    }


}
