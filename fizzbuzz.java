public class fizzbuzz
{ 
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            counter = counter + 1;
            String fizz = "";
            String buzz = "";
            if ((i/5) == (double)i/5 && (i/3) == (double)i/3) {
                System.out.println ("fizzbuzz");
            } else if ((i/5) == (double)i/5) {
                System.out.println ("buzz");
            } else if ((i/3) == (double)i/3) {
                System.out.println ("fizz");
            } else
                System.out.println(i);
            
        }
    }
}
