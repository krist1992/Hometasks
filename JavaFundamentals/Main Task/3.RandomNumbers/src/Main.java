import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter random numbers quantity:");
        int n = Integer.parseInt(input.nextLine());
        System.out.println("Break to new line?(y/n)");
        String newLine = input.nextLine();

        for (int i = 1; i <= n; i++) {

            Random randomNumbers = new Random();
            int ix = randomNumbers.nextInt();

            if (newLine.equals("y")) {
                System.out.println(i+". Random number:" +ix);
            }
            else {
                System.out.printf(i+". Random number:" +ix+ "\t");
            }
        }
    }
}

