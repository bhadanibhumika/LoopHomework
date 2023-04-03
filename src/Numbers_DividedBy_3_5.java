public class Numbers_DividedBy_3_5 {

    //main method
    public static void main(String[] args) {
        System.out.println("Numbers Divided by 3 are: ");

        // for loop syntax
        for (int i =1;i<100;i++)
        {
            if(i%3==0)
                System.out.print(i+", ");
        }

        System.out.println("\n Numbers divided by 5 are: ");
        for (int i = 1;i<100;i++)
        {
            if(i%5==0)
                System.out.print(i+", " );
        }


    }


}
