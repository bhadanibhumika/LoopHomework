import java.util.Scanner;

public class Months_Name {
    public static void main(String[] args) {
        //create scanner class obj
        Scanner scanner = new Scanner(System.in);
        //Taking user input
        System.out.println("Enter a number between 1 to 12: ");
        // create variable n use scanner obj
        int month = scanner.nextInt();

       //switch syntax
        switch (month)
        {
            case 1:
                System.out.println("month 1 is January");
                break;
            case 2:
                System.out.println("month 2 is February");
                break;
            case 3:
                System.out.println("Month 3 is March ");
                break;
            case 4:
                System.out.println("Month 4 is April");
                break;
            case 5:
                System.out.println("Month 5 is May");
                break;
            case 6:
                System.out.println("Month 7 is June");
                    break;
            case 7:
                System.out.println("Month 7 is July");
                break;
            case 8:
                System.out.println("Month 8 is August");
                break;
            case 9:
                System.out.println("Month 9 is September");
                break;
            case 10:
                System.out.println("Month 10 is October");
                break;
            case 11:
                System.out.println("Month 11 is  November");
                break;
            case 12:
                System.out.println("Month 12 is December");
                break;
            default:
                System.out.println("Invalid Number: "+month);


        }

    }




}
