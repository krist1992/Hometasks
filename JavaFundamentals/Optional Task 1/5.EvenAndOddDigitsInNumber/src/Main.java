import org.omg.CORBA.TRANSACTION_MODE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input numbers quantity:");
        int n = in.nextInt();
        System.out.println("Input numbers:");
        String numbers[] = new String[n];
        for (int i = 0; i < n; i++) {
            int number = in.nextInt();
            Integer numberObject = new Integer(number);
            numbers[i] = numberObject.toString();
        }

        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            int oddDigits = 0;
            int evenDigits = 0;
            for (int j = 0; j < numbers[i].length(); j++) {
                if (numbers[i].toCharArray()[j] % 2 != 0)
                    oddDigits++;
                else
                    evenDigits++;
            }

            if (oddDigits == 0)
                count1++;
            else if (evenDigits == oddDigits)
                count2++;
        }

        System.out.printf("Numbers quantity with even digits: \n%d \n", count1);
        System.out.printf("Numbers quantity with equal even and odd digits quantity:\n%d \n", count2);
    }
}