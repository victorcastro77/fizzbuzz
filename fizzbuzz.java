
/**
 * Write a description of class fizzbuzz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fizzbuzz
{
    public static void main(String[] args) {
        int a = 100;
        int fizz = 3;
        int buzz = 5;
        for (int i = 1; i <= a; i++) {
            System.out.println(i + " ");
            boolean afizz = false;
            boolean bbuzz = false; 
            boolean cfizzbuzz = false;
            if ((i/5) == (double)i/5 && (i/3) == (double)i/3) {
                System.out.println("fizzbuzz");
            } else if ((i/5)==(double)i/5) {
                System.out.println("buzz");
            } else if ((i/3) == (double)i/3) {
                System.out.println("fizz");
            } 
        }
    }
}