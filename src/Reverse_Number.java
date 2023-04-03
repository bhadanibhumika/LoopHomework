import java.util.Scanner;

public class Reverse_Number {

    public static void main(String[] args) {

        // declare variable
        int num,reminder,i;
        // create scanner class obj
        Scanner scanner = new Scanner(System.in);
        //Print for user
        System.out.println("Enter  a Numbers: ");
         num = scanner.nextInt();//  using num variable and scanner obj

        System.out.println("Before Revers number is: "+num); // print the number

        //for loop syntax
        for ( i=0;num>0;num=num/10)//num=1234 //second time i value is 4
        {
            reminder=num%10;// 1234%10 =4 first time
            i = i*10+reminder; // i value 0 = 0*10+4= 4

        }
        System.out.println(" After Reverse Number is: "+ i);//4321


    }
}
