package YusnulMagfira;

public class Day98 {
    public static void main(String[] args) {
        int N = 10;

        int a = 0, b = 1;

        System.out.println("Deretan Fibonacci sampai " + N + ":");

        while (a <= N) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
