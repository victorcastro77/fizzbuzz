public class fizzbuzz
{
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            counter = counter + 1;
            String fizz = "";
            String buzz = "";
            if ((i/5) == (double)i/5 && (i/3) == (double)i/3) {
                fizz = "fizzbuzz";
            } else if ((i/5) == (double)i/5) {
                buzz = "buzz";
            } else if ((i/3) == (double)i/3) {
                fizz =  "fizz";
            }
            System.out.println(i+fizz+buzz);
                fizz = "fizz";
                buzz = "buzz";
        }
    }
}
