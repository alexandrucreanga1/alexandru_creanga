package homework.tema2_PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int i = 0;

        for (i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                break;
            }
        }

        if (number % i == 0) {
            System.out.println("The number " + number + " is Composite; Can be divided by " + i + ";");
        } else {
            System.out.println("The number " + number + " is Prime;");
        }
    }

}
