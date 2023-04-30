import java.util.Scanner;

public class Count_A_In_String {
    //main method
    public static void main(String[] args) {
        // create scanner class for user
        Scanner scanner = new Scanner(System.in);

        //taking user input
        System.out.println("Enter any String: ");

        //crate variable n use scanner obj
        String string = scanner.nextLine();
        //print for string
        System.out.println(string);


        // declare variable
        char ch = 'a';
        int count =0;
        //for loop syntax
        for (int i = 0;i<string.length();i++)
        {
            //if statement
            if(string.charAt(i)==ch)
            count++;
        }
        System.out.println("The Total Character 'a' in the string is: "+count);

    }
}
