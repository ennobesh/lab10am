/*
 * This program  prints table using the sqrt method in the Math class.
 */

/**
 *
 * @author Aida
 */
public class class10 {
    public static void main(String[]args){
        System.out.println("Number\t SquareRoot\n");
        for (int number = 0; number <= 20; number += 2){
            System.out.printf("%d \t %.4f\n", number, Math.sqrt(number));
        }
    }
}
