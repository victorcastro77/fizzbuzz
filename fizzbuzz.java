
/**
 * Write a description of class fizzbuzz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fizzbuzz
{
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            counter = counter + 1;
            int fizz = 3;
            int buzz = 5;
            if ((counter/5) == (double)counter/5 && (counter/3) == (double)counter/3) {
                System.out.println("fizzbuzz");
            } else if ((counter/5)==(double)counter/5) {
                System.out.println("buzz");
            } else if ((counter/3) == (double)counter/3) {
                System.out.println("fizz");
            } 
            System.out.println(counter);
        }
    }
}