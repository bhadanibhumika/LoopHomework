import java.util.Scanner;

public class  Times_Table {
    public static void main(String[] args) {
        // create scanner class obj
        Scanner scanner = new Scanner(System.in);
        //print for user
        System.out.println("Enter any Number for print the times table: ");
        // create variable using scanner obj
        int a = scanner.nextInt();

         // loop syntax
        for (int i = 1; i <=12 ; i++) {
            System.out.println(a+"x"+i+"="+(i*a));// print for multiplication


        }

    }
}
