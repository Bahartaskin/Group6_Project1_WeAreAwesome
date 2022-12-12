package files;

import java.util.Scanner;

public class Bruce1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");

        double radius = input.nextDouble();

        double area = radius * radius * 3.14;
        double perimeter = 2 * radius * 3.14;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

        input.close();

    }

}

// Scanner Class: used for getting user inputs