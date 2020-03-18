import java.util.Scanner;

public class Dorset1 {

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a 4 digits number: ");
        int number = in.nextInt();

        String string = Integer.toString(number);

        char[] ArrayNumber = new char[string.length()];

        for (int i = 0; i < string.length(); i++)
        {
            ArrayNumber[i] = string.charAt(i);
            int result = Integer.parseInt((String.valueOf(ArrayNumber[i])));
            sum += result;
        }

        System.out.println("The sum of the digits is: " + sum);

    }
}
