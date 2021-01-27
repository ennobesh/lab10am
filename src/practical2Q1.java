/* This program prints the table using the sqrt method in the Math class.
*/

/**
 *
 * @author Noor Aida Husaini
 */
public class practical2Q1 {
    public static void main(String[]args){
        System.out.println("Number\t SquareRoot\n");
        for (int number=0; number<=20; number+=2){
            System.out.printf("%d \t %.8f\n", number, Math.sqrt(number));
        }
        
    }
}
