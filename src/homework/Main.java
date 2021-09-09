/* Guidance:
   Please take into account:
   - weight >> data introduced must be in "kg" positive;
   - height >> data introduced must be in "m" positive, and not in "cm" positive;
 */

package homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter your weight(kg): ");
        double weight = scanner.nextDouble();

        System.out.println("Please enter your height(m): ");
        double height = scanner.nextDouble();




        double IMC = weight / Math.pow(height,2);


        if ( weight <=0 || height <=0) {
            System.out.println("Please take into account, that numbers introduced for weight and/or height must be greater than zero (positive)");
        } else if (IMC <=18.49) {
            System.out.println("IMC este " + IMC +"; Status greutate: Subponderal");
        } else if (IMC >=18.50 && IMC <=24.99) {
            System.out.println("IMC este " + IMC + "; Status greutate: Normala");
        } else if (IMC >=25.00 && IMC <=29.99) {
                System.out.println("IMC este " + IMC+"; Status greutate: Supraponderal");
        }else if (IMC >=30.00 && IMC <=34.99) {
            System.out.println("IMC este " + IMC+"; Status greutate: Obezitate (gradul I)");
        }else if (IMC >=35.00 && IMC <=39.99) {
            System.out.println("IMC este " + IMC+"; Status greutate: Obezitate (gradul II)");
        }else {
            System.out.println("IMC este " + IMC+"; Status greutate: Obezitate morbida");
        }
        System.out.println("Thank you!");
    }
}
