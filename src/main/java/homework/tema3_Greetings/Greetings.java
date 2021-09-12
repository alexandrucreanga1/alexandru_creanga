package homework.tema3_Greetings;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name ?");
        String name = scanner.nextLine();

        if (name.equals("")) {
            System.out.println("Hello, stranger.");
        } else
            System.out.println("Hello, " + name + "!");

    }

}
