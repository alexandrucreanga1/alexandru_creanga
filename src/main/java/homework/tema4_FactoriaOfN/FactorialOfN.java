package homework.tema4_FactoriaOfN;

import java.util.Scanner;

public class FactorialOfN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter factorial number(*only non-negative numbers): ");
        int number = scanner.nextInt();

        int factorial =1;

        if (number == 0) {
            System.out.println("The factorial of "+number+" is 1");
        }  else if(number>0) {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            System.out.println("The factorial of "+number +" is "+factorial+".");
        }else {
            System.out.println("Hmm, please reconsider your option. Enter a non-negative number. For example any number " +
                    "equal or greater than zero.");
        }
    }
}
