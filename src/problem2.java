import java.util.Scanner;

public class problem2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter the first number: ");
        int number1 = in.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = in.nextInt();

        double remainder = number1%number2;

        if (remainder == 0)
            System.out.println("The numbers are multiples!");
        else
            System.out.println("The numbers are NOT multiples!");
    }
}
