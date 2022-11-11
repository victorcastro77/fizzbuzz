
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
        for (int i = 1; i <= a; i++) {
            System.out.println(i + " ");
            if (i / 5 == 0 && i / 3 == 0) {
                System.out.println("fizzbuzz");
            }
            if ((i/5)==double(i/5)) {
                System.out.println("fizz");
            }
            if (i / 3 == 0) {
                System.out.println("buzz");
            }
        }
    }
}