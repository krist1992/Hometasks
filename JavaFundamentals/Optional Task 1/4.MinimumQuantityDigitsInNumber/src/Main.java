import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input numbers quantity:");
        int n = in.nextInt();
        System.out.println("Input numbers:");
        int digits = 0;
        int foundNum = 0;
        int number;
        int count;
        int Numbers[];
        Numbers = new int[n];
        for(int i = 0; i < n; i++) {
            Numbers[i] = in.nextInt();
        }

        number = Numbers[0];
        count = (number == 0) ? 1 : 0;
        while(number != 0) {
            count++;
            number /= 10;
        }
        digits = count;
        foundNum = Numbers[0];

        for(int i = 1; i < n; i++) {
            number = Numbers[i];
            count = (number == 0) ? 1 : 0;
            while(number != 0) {
                count++;
                number /= 10;
            }
            if(count < digits) {
                digits = count;
                foundNum = Numbers[i];
            }
        }

        System.out.printf("Found number: %d \n", foundNum);
    }
}