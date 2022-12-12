package collaborationGroup6;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number");
            int number = scanner.nextInt();
            numbers[i] = number;
        }
        System.out.println("Numbers stored : " + Arrays.toString(numbers));

    }
}
