package files;

public class Zehra {

   /*
    1- Switch statement’s expression must be
    evaluated to a single value, it can not be long,
    double, float and Boolean data types.

    */

  //2
   public static void main(String[] args) {

        double n1 = 200.5,
                n2 = 10.5;

        char operator = '$';

        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';

        if(valid){ // Operator: +, -, *, /

            switch (operator){

                case '+':
                    System.out.println(n1 + n2);
                    break;

                case '-':
                    System.out.println(n1 - n2);
                    break;

                case '*':
                    System.out.println(n1 * n2);
                    break;

                default:
                    System.out.println(n1 / n2);

            }

        }else{
            System.err.println("Invalid Operator: "+operator);
        }


    }

}
