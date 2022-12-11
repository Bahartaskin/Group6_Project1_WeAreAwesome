public class Bahar2 {

    public static void main(String[] args) {


        int number = 6;

        boolean has28Days = number == 2; // for the month that has 28 days
        boolean has30Days = number == 4 || number == 6|| number == 9 || number == 11; // for the months that has 30 days
        boolean has31Days = number == 1|| number == 3|| number == 5|| number== 7|| number == 8|| number ==  10|| number == 12; // if the month does not have 28 days and does not have 30 days
        // or u can write it like
        // boolean has31Days = !has28Days && !has30Days;

        if(has28Days){ //if the month has 28 days
            System.out.println("28 Days");
        }
        if(has30Days){ //if the month has 30 days
            System.out.println("30 Days");
        }

        if(has31Days){ //if the month has 31 days
            System.out.println("31 Days");
        }

    }

}
/*
Write a program that can print the number of days in a month

			Ex:
				number = 1 ~ 12;

			output:
				31 Days


			Hints:
				Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
				Months that has 30 days: 4, 6, 9, 11
				Month that has 28 days: 2
 */