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
        scanner.close();
        System.out.println("Numbers stored : " + Arrays.toString(numbers));
    }
}
/*
1. Can you explain Array?
       Array is a special variable that can contain multiple elements
	   Array's size is fixed
	   Arrays support primitives & non-primitives

	   Declaring array:
	   		DataType[] variableName;

   		Initializing array:
   			If we do not know the exact data:
   				1. DataType[] variableName= new DataType[length]
   					int[] nums = new int[5];

			If we know the exact data:
				2. DataType[] variableName = {data1, data2, dat3 ...}

2. Write a program that asks user to enter a number 10 times and store all user entered numbers in an array
*/